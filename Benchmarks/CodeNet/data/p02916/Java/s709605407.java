package com.kesarling.atCoder;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    protected static void scanList(ArrayList<Integer> integerArrayList, int length) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            integerArrayList.add(Integer.parseInt(scanner.next()));
        }
    }

    public static void main(String[] args) throws IOError {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> integerArrayListA = new ArrayList<>();
        ArrayList<Integer> integerArrayListB = new ArrayList<>();
        ArrayList<Integer> integerArrayListC = new ArrayList<>();
        scanList(integerArrayListA,N);
        scanList(integerArrayListB,N);
        scanList(integerArrayListC,N-1);
        int sum = integerArrayListB.get(integerArrayListA.get(0)-1);
        for (int i = 1; i < N; i++) {
            if (integerArrayListA.get(i) == 1) {
                sum = sum + integerArrayListB.get(integerArrayListA.get(i)-1);
                continue;
            }
            sum = sum + integerArrayListB.get(integerArrayListA.get(i)-1) + integerArrayListC.get(integerArrayListA.get(i)-2);
        }
        System.out.println(String.valueOf(sum).toString());
    }
}