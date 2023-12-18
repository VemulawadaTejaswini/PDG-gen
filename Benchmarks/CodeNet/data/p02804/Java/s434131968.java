//package Round613;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sguar <shugangcao@gmail.com>
 * welcome to kuaishou
 * Created on 2020-01-12
 */
public class Main {
    private static final int MOD = 1_000_000_000 + 7;

    long[] A;
    long[] F;
    long[] a;
    int n, K;

    public void init() {
        A = new long[n + 1];
        F = new long[n + 1];

        A[0] = 1;
        for (int i = 1; i <= n; i++) {
            A[i] = A[i - 1] * i % MOD;
        }
        F[n] = inv(A[n]);
        for (int i = n - 1; i >= 0; i--) {
            F[i] = F[i + 1] * (i + 1) % MOD;
        }
    }

    public void debug() {
        System.out.println(F[3] * A[3] % MOD);
        System.out.println(F[2] * A[2] % MOD);
        System.out.println(F[1]);

        System.out.println(A[3]);
        System.out.println(A[2]);
        System.out.println(A[1]);

        System.out.println(getC(3, 1));
        System.out.println(getC(3, 2));
    }

    public void run() {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        K = cin.nextInt();
        init();
        //debug();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextLong();
        }
        Arrays.sort(a);

        long ans = 0;
        for (int i = 1; i <= n; i++) {

            ans = (ans
                    + getC(n - i, K - 1)
                    * ((a[n - i] - a[i - 1] + MOD) % MOD)
                    % MOD)
                    % MOD;
        }
        System.out.println(ans);

    }

    public long getC(int i, int j) {
        if (i < j) return 0;
        return A[i] * F[j] % MOD * F[i - j] % MOD;
    }

    public long inv(long x) {
        return pow(x, MOD - 2);
    }

    public long pow(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x % MOD;
            }
            n >>= 1;
            x = x * x % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

