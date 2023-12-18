package com.kesarling.atCoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        switch (S) {
            case "Sunny":
                System.out.print("Cloudy");
            case "Cloudy":
                System.out.println("Rainy");
            case "Rainy":
                System.out.println("Sunny");
        }
    }
}
