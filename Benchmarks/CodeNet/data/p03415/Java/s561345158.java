package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<3;i++){
            stringBuilder.append(scanner.next().charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
