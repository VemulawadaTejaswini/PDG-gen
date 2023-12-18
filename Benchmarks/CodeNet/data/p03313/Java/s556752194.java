import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ProblemE solver = new ProblemE();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemE {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[1 << n];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }

            int[] max1 = new int[1 << n];
            int[] max2 = new int[1 << n];
            Arrays.fill(max1, -1);
            Arrays.fill(max2, -1);
            for (int mask = 0; mask < 1 << n; mask++) {
                update(mask, mask, a, max1, max2);
                for (int bit = 0; bit < n; bit++) {
                    if ((mask & (1 << bit)) == 0) {
                        continue;
                    }
                    int nmask = mask ^ (1 << bit);
                    update(max1[nmask], mask, a, max1, max2);
                    update(max2[nmask], mask, a, max1, max2);
                }
            }

            long ans = 0;
            for (int k = 1; k < 1 << n; k++) {
                ans = Math.max(ans, a[max1[k]] + a[max2[k]]);
                out.println(ans);
            }
        }

        private void update(int i, int mask, int[] a, int[] max1, int[] max2) {
            if (i < 0) {
                return;
            }
            if (i == max1[mask] || i == max2[mask]) {
                return;
            }
            if (max1[mask] < 0 || a[max1[mask]] <= a[i]) {
                max2[mask] = max1[mask];
                max1[mask] = i;
            } else if (max2[mask] < 0 || a[max2[mask]] <= a[i]) {
                max2[mask] = i;
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

    }
}

