package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        String s = scanner.next();

        if (a < 3200) {
            s = "red";
        }

        System.out.println(s);

    }
}