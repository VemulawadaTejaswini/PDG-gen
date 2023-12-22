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
        A_XorBattle solver = new A_XorBattle();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_XorBattle {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int numTests = in.nextInt();
            for (int test = 0; test < numTests; test++) {
                int n = in.nextInt();
                long[] a = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = in.nextLong();
                }
                char[] s = in.next().toCharArray();
                long[] basis = new long[64];
                int[] bit = new int[64];
                int k = 0;
                boolean z = true;
                for (int i = n - 1; i >= 0; i--) {
                    long x = a[i];
                    for (int j = 0; j < k; j++) {
                        if (((x >> bit[j]) & 1) != 0) {
                            x ^= basis[j];
                        }
                    }
                    if (x != 0) {
                        if (s[i] == '0') {
                            // Add a[i] to basis.
                            basis[k] = x;
                            bit[k] = Long.numberOfTrailingZeros(x);
                            ++k;
                        } else {
                            // a[i] must lie in the subspace spanned by basis.
                            z = false;
                        }
                    }
                }
                out.println(z ? 0 : 1);
            }
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
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

