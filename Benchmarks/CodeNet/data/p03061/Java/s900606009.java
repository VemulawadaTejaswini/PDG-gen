

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int[] left = new int[N + 1];
            int[] right = new int[N + 1];
            for (int i = 0; i < N; i++) {
                left[i + 1] = gcd(left[i], A[i]);
            }
            for (int i = N - 1; i >= 0; i--) {
                right[i] = gcd(right[i + 1], A[i]);
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                max = Math.max(max, gcd(left[i], right[i + 1]));
            }
            System.out.println(max);
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
