package me.awataki;

import java.util.Scanner;

public class P41 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] arr = {true, true, true};
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        arr[a] = false;
        arr[b] = false;
        int i = 0;
        for (boolean v : arr) {
            if (v){
                i++;
                System.out.println(i);
                return;
            }
            i++;
        }
    }
}
