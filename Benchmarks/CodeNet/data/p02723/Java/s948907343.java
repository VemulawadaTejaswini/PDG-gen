package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {
        String S = scan.nextLine();
            if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) System.out.println("Yes");
                    else System.out.println("No");
    }

}