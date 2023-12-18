import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(solve2(N));
    }

    private static int solve2(int N) {
        int[] X = new int[N+1];

        X[1] = 1;
        for (int i=2; i<=N; i++) {
            int min = Integer.MAX_VALUE;

            int power6 = 6;
            while (power6 <= i) {
                min = Math.min(min, X[i-power6]+1);

                power6 *= 6;
            }

            int power9 = 9;
            while (power9 <= i) {
                min = Math.min(min, X[i-power9]+1);

                power9 *= 9;
            }

            for (int j=1; j<10 && j<=i; j++) {
                min = Math.min(min, X[i-j]+j);
            }

            X[i] = min;
            System.err.println("X[" + i + "] = " + min);
        }

        return X[N];
    }

    private static int solve(int N) {
        int x = 0;

        while (N > 0) {
            int max9 = power(N, 9);
            int max6 = power(N, 6);

            System.err.println("N = " + N + ", max9 = " + max9 + ", max6 = " + max6 + ", x = " + x);
            if (max9 > max6 && max9 > 0) {
                N -= max9;
                x++;
            } else if (max6 > max9 && max6 > 0) {
                N -= max6;
                x++;
            } else {
                x += N;
                N = 0;
            }
        }

        return x;
    }

    private static int power(int max, int base) {
        if (max < base) return -1;

        int cur = base;
        while (cur*base < max) {
            cur *= base;
        }

        return cur;
    }
}