import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] counts = new long[40]; // max 40 digits
        long[] as = new long[n];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            as[i] = a;
            int j = 0;
            while (a >= 1) {
                counts[j] += a % 2;
                a /= 2;
                j++;
            }
        }

        long x = 0;
        for (int i = 0; i < 40; i++) {
            if (2 * (n - counts[i]) > n) {
                if (x + Math.pow(2, i) > k) {
                    break;
                }
                x += Math.pow(2, i);
            }
        }
        System.out.println(x);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += x ^ as[i];
        }
        System.out.println(ans);
    }
}