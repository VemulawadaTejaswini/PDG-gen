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
        Q_Flowers solver = new Q_Flowers();
        solver.solve(1, in, out);
        out.close();
    }

    static class Q_Flowers {
        long[] t;

        public long get(int r) {
            long ans = 0;
            while (r >= 0) {
                ans = Math.max(t[r], ans);
                r = (r & (r + 1)) - 1;
            }
            return ans;
        }

        public void set(int pos, long val) {
            while (pos < t.length) {
                t[pos] = Math.max(val, t[pos]);
                pos |= pos + 1;
            }
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            int[] h = in.na(n);
            int[] a = in.na(n);
            t = new long[n + 3];
            for (int i = 0; i < n; i++) {
                long best = get(h[i] - 1);
                set(h[i], a[i] + best);
            }
            out.println(get(n));
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
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

        public int ni() {
            return Integer.parseInt(ns());
        }

        public int[] na(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = ni();
            return a;
        }

    }
}

