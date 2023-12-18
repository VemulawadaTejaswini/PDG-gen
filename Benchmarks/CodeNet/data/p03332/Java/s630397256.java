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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt(), b = in.nextInt();
            long k = in.nextLong();
            int mod = 998244353;
            Combinations comb = new Combinations(n + 1, mod);
            long ans = 0;
            for (int cntA = 0; cntA <= n; cntA++) {
                long kk = k - 1L * cntA * a;
                if (kk % b == 0 && kk / b <= n) {
                    ans += (long) comb.choose(n, cntA) * comb.choose(n, (int) (kk / b)) % mod;
                }
            }
            out.println(ans % mod);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

    static class Combinations {
        public final int max;
        public final int mod;
        public int[] inv;
        public int[] fact;
        public int[] invFact;

        public Combinations(int max, int mod) {
            this.max = max;
            this.mod = mod;
            inv = MathUtils.inverses(max, mod);
            fact = new int[max];
            invFact = new int[max];
            fact[0] = invFact[0] = 1;
            for (int i = 1; i < max; i++) {
                fact[i] = (int) ((long) fact[i - 1] * i % mod);
                invFact[i] = (int) ((long) invFact[i - 1] * inv[i] % mod);
            }
        }

        public int choose(int n, int k) {
            if (k < 0 || k > n) {
                return 0;
            }
            return (int) ((long) fact[n] * invFact[k] % mod * invFact[n - k] % mod);
        }

    }

    static class MathUtils {
        public static int[] inverses(int size, int mod) {
            int[] inv = new int[size];
            inv[1] = 1;
            for (int i = 2; i < inv.length; i++) {
                inv[i] = (int) ((long) (mod - mod / i) * inv[mod % i] % mod);
            }
            return inv;
        }

    }
}

