package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        final String[] array = str.split(", ");
        final int index = scanner.nextInt() - 1;

        System.out.println(array[index]);
    }
}
