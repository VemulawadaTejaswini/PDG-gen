package test;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int m = sc.nextInt();
                sum += m;
                min = Math.min(min, m);
            }
            X -= sum;
            System.out.println(N + X / min);
        }
    }
}
