package com.ll.arrayList;

public class ArrayList {
    private int size;
    private int[] datum;
    ArrayList() {
        size = 0;
        datum = new int[2];
    }
    public int size() {
        return size;
    }

    public void add(int data) {
        ifSizeFullExpand();
        datum[size] = data;

        size++;


    }

    private void ifSizeFullExpand() {
        if (datum.length == size) {
            int[] newArr = new int[datum.length * 2];
            for (int i = 0; i < datum.length; i++) {
                newArr[i] = datum[i];
            }
            datum = newArr;
        }
    }

    public int get(int index) {
        return datum[index];

    }

    public void removeAt(int index) {
        for (int i = index + 1; i < size; i++) {
            datum[i-1] = datum[i];
        }
    }

    public int getArrayLength() {
        return datum.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d : %d\n", i, datum[i]);
        }

    }
    public void addAt(int data, int index) {
        ifSizeFullExpand();
        for (int i = size - 1; i >= index; i--) {
            datum[i+1] = datum[i];
        }
        datum[index] = data;
        size++;
    }
}
