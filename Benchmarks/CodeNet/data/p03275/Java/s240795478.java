package kmp_algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class Permutation {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
            arr[i]=input.nextInt();
        System.out.print(arr[n/2]);
    }

}
