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
        ProblemB_CountingOfTrees solver = new ProblemB_CountingOfTrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemB_CountingOfTrees {
        final int MOD = 998244353;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] d = new int[n];

            int maxD = 0;
            for (int i = 0; i < n; i++) {
                d[i] = in.nextInt();
                ++a[d[i]];
                maxD = Math.max(maxD, d[i]);
            }

            long ans = 1;
            if (d[0] != 0 || a[0] != 1) {
                ans = 0;
            }
            for (int i = 1; i <= maxD; i++) {
                ans = ans * pow(a[i - 1], a[i]) % MOD;
            }
            out.println(ans);
        }

        private int pow(long a, long n) {
            long r = 1;
            while (n > 0) {
                if (n % 2 == 1) {
                    r = r * a % MOD;
                }
                a = a * a % MOD;
                n /= 2;
            }
            return (int) r;
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

