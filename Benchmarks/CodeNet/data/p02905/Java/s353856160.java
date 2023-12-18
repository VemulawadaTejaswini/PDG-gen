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
        C_LCMs solver = new C_LCMs();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_LCMs {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            final int MOD = 998244353;
            final int N = (int) 1e6 + 100;

            long[] am = new long[N];
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                ++am[x];
            }

            int[] d = new int[N];
            for (int i = 2; i < d.length; i++) {
                if (d[i] == 0) {
                    for (int j = i; j < d.length; j += i) {
                        d[j] = i;
                    }
                }
            }

            int[] mu = new int[N];
            mu[1] = 1;
            for (int i = 2; i < mu.length; i++) {
                if (d[i] != d[i / d[i]]) {
                    mu[i] = -mu[i / d[i]];
                }
            }

            // Sum of numbers divisible by i.
            long[] sum = new long[N];
            // Sum of squares of numbers divisible by i.
            long[] sumSq = new long[N];
            for (int i = 1; i < N; i++) {
                for (int j = i; j < N; j += i) {
                    sum[i] = (sum[i] + (long) j * am[j]) % MOD;
                    sumSq[i] = (sumSq[i] + (long) j * am[j] % MOD * j) % MOD;
                }
            }


            long[] inv = new long[N];
            inv[1] = 1;
            for (int i = 2; i < N; i++) {
                inv[i] = (MOD - (MOD / i) * inv[MOD % i] % MOD) % MOD;
            }

            long[] u = new long[N];
            for (int i = 1; i < N; i++) {
                long cur = sum[i] * sum[i] % MOD;
                cur -= sumSq[i];
                if (cur < 0) {
                    cur += MOD;
                }
                u[i] = cur;
            }

            for (int i = 1; i < N; i++) {
                for (int j = 2 * i; j < N; j += i) {
                    u[i] = (u[i] + u[j] * mu[j / i]) % MOD;
                    if (u[i] < 0) {
                        u[i] += MOD;
                    }
                }
            }

            long ans = 0;
            for (int i = 1; i < N; i++) {
                ans = (ans + u[i] * inv[i]) % MOD;
            }
            ans = ans * inv[2] % MOD;
            out.println(ans);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

