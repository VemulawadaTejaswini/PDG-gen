
// https://atcoder.jp/contests/abc086/tasks/abc086_a

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a * b % 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}