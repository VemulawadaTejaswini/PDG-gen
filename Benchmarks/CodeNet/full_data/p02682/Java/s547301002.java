package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        if (a + b >= k) {
            System.out.println(a);
        }else {
            System.out.println(a - (k - (a + b)));
        }
    }
}
