package _128;

import java.util.Scanner;

public class A_ApplePie {
    public static int getNumOfPie(int A, int P) {
        return (int) (A * 3 + P) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int P = scan.nextInt();
        System.out.println(getNumOfPie(A, P));
    }
}
