
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int k = in.nextInt();
        for (int i = 1; i <= k; ++i) {
            System.out.println(c(k - 1, i - 1) * c(n - k + 1, i));
        }
    }

    public static long A(int n, int m) {
        long result = 1;
        for (int i = m; i > 0; i--) {
            result *= n;
            n--;
            result %= MOD;
        }
        return result;
    }

    private static long c(int n, int k) {
        final long half = n / 2;
        if (k > half) {
            k = n - k;
        }
        return (A(n, k) % MOD) * modinv(A(k, k), MOD) % MOD;
    }


    static long modinv(long a, long m) {
        long b = m, u = 1, v = 0;
        while (b > 0) {
            final long t = a / b;
            a -= t * b;
            long tmp = a;
            a = b;
            b = tmp;
            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) {
            u += m;
        }
        return u;
    }
}
