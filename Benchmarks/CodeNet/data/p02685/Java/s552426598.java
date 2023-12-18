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
        ColorfulBlocks solver = new ColorfulBlocks();
        solver.solve(1, in, out);
        out.close();
    }

    static class ColorfulBlocks {
        public static int MOD = 998244353;
        static long[] fac;
        static long[] finv;
        static long[] inv;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();

            comInit(n);

            long ans = 0;
            for (int i = 0; i <= k; i++) {
                long c = com(n - 1, i);
                ans = (ans + (c * m % MOD * modPow(m - 1, n - i - 1, MOD)) % MOD) % MOD;
            }
            out.append(String.valueOf(ans));
        }

        static void comInit(int max) {
            fac = new long[max + 1];
            finv = new long[max + 1];
            inv = new long[max + 1];

            fac[0] = fac[1] = 1;
            finv[0] = finv[1] = 1;
            inv[1] = 1;

            for (int i = 2; i <= max; i++) {
                fac[i] = fac[i - 1] * i % MOD;
                inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
                finv[i] = finv[i - 1] * inv[i] % MOD;
            }
        }

        static long com(int n, int k) {
            if (n < k) {
                return 0;
            }
            return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
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

