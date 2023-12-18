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
        ProblemD_SwapAndFlip solver = new ProblemD_SwapAndFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemD_SwapAndFlip {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }

            int max = 0;
            for (int x : a) {
                max = Math.max(max, x);
            }
            for (int x : b) {
                max = Math.max(max, x);
            }

            final int infinity = (int) 1e9;
            int[][] d = new int[max + 1][1 << n];
            for (int[] arr : d) {
                Arrays.fill(arr, infinity);
            }
            d[0][0] = 0;
            int[] cost = new int[n];
            for (int mask = 0; mask < 1 << n; mask++) {
                int pos = Integer.bitCount(mask);
                Arrays.fill(cost, 0);
                for (int i = 0; i < n; i++) {
                    if (((mask >> i) & 1) != 0) {
                        continue;
                    }
                    for (int j = 0; j < i; j++) {
                        if (((mask >> j) & 1) != 0) {
                            continue;
                        }
                        ++cost[i];
                    }
                }
                for (int prev = 0; prev <= max; prev++) {
                    for (int i = 0; i < n; i++) {
                        if (((mask >> i) & 1) != 0) {
                            continue;
                        }
                        int nmask = mask | (1 << i);
                        int cur = Math.abs(i - pos) % 2 == 0 ? a[i] : b[i];
                        if (cur < prev) {
                            continue;
                        }
                        d[cur][nmask] = Math.min(d[cur][nmask], d[prev][mask] + cost[i]);
                    }
                }
            }
            int ans = infinity;
            for (int i = 0; i <= max; i++) {
                ans = Math.min(ans, d[i][(1 << n) - 1]);
            }
            if (ans >= infinity) {
                ans = -1;
            }
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

