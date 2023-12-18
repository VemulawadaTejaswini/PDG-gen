import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        int[] fact;
        int[] invFact;
        int mod = 1000000007;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt() - 1;
            fact = new int[n + 1];
            invFact = new int[n + 1];
            fact[0] = invFact[0] = 1;
            for (int i = 1; i <= n; i++) {
                fact[i] = (int) ((long) fact[i - 1] * i % mod);
            }
            invFact[n] = (int) MathUtils.inv(fact[n], mod);
            for (int i = n - 1; i >= 0; i--) {
                invFact[i] = (int) ((long) invFact[i + 1] * (i + 1) % mod);
            }

            long ans = 0;

            for (int count = 0; count <= n; count++) {
                long add = 1;
                add = choose(count - 1, n - count);
                add = (add * fact[count] % mod * fact[n - count] % mod);
                ans += fact[n] - add;
            }
            out.println((ans % mod + mod) % mod);
        }

        private long choose(int n, int k) {
            if (k < 0 || k > n) {
                return 0;
            }
            return (long) fact[n] * invFact[k] % mod * invFact[n - k] % mod;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }

    static class MathUtils {
        public static long modPow(long a, long b, long mod) {
            while (a < 0) {
                a += mod;
            }
            long res = 1;
            while (b > 0) {
                if ((b & 1) != 0) {
                    res = res * a % mod;
                }
                a = a * a % mod;
                b >>>= 1;
            }
            return res;
        }

        public static long inv(long a, long mod) {
            return modPow(a, mod - 2, mod);
        }

    }
}

