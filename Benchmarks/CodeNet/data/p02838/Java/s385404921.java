import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        XorSum solver = new XorSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class XorSum {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            long result = 0;
            for (int i = 0; i <= 60; i++) {
                int zero = 0;
                int one = 0;
                for (int j = 0; j < n; j++) {
                    if (((a[j] >> (long) i) & 1) == 1) {
                        one++;
                    } else {
                        zero++;
                    }
                }
                result += (modPow(2, i, MOD) * one * zero) % MOD;
                result %= MOD;

            }
            out.println(result);

        }

        static long modPow(long x, long n, long mod) {
            if (n == 0) {
                return 1;
            }
            long result = modPow(x, n / 2, mod);

            if (n % 2 == 0) {
                return (result * result) % mod;
            }
            return (((result * result) % mod) * x) % mod;
        }

    }
}

