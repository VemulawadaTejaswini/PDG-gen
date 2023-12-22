package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 2;
        for (int i = 2; i <a ; i++) {
            if (a%i==0)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}

