package Latihan;

import java.util.Scanner;

public class Part09{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N  = input.nextInt();
        int M  = input.nextInt();
        if (N >= 1 && N <= 100){
            if (N == M){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}