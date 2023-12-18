package com.kesarling.atCoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        switch (S) {
            case "Sunny":
                System.out.print("Cloudy");
                break;
            case "Cloudy":
                System.out.print("Rainy");
                break;
            case "Rainy":
                System.out.print("Sunny");
                break;
        }
    }
}
