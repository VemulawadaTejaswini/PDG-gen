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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        char[][] a;
        int h;
        int w;
        int[] p;
        boolean[] used;
        boolean[] dp;
        boolean ans = false;

        void check() {
            if (ans) {
                return;
            }
            Arrays.fill(dp, false);
            dp[0] = true;
            boolean[][] good = new boolean[w][w];
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < w; j++) {
                    good[i][j] = true;
                    for (int r = 0; r < h; r++) {
                        good[i][j] &= a[p[r]][i] == a[p[h - 1 - r]][j];
                    }
                }
            }

            for (int mask = 0; mask < 1 << w; mask++) {
                if (dp[mask]) {
                    if (Integer.bitCount(mask) + 1 == w) {
                        int missing = 0;
                        for (int i = 0; i < w; i++) {
                            if ((mask & (1 << i)) == 0) {
                                missing = i;
                            }
                        }
                        if (good[missing][missing]) {
                            dp[mask | (1 << missing)] = true;
                        }
                    } else {

                        for (int bit1 = 0; bit1 < w; bit1++) {
                            if ((mask & (1 << bit1)) != 0) {
                                continue;
                            }
                            for (int bit2 = bit1 + 1; bit2 < w; bit2++) {
                                if ((mask & (1 << bit2)) != 0) {
                                    continue;
                                }
                                dp[mask | (1 << bit1) | (1 << bit2)] |= good[bit1][bit2];
                            }
                        }
                    }
                }
            }
            if (dp[dp.length - 1]) {
                ans = true;
            }
        }

        void go(int l, int r) {
            if (l > r) {
                check();
                return;
            }
            int min = 0;
            while (min < used.length && used[min]) {
                min++;
            }
            p[l] = min;
            if (l == r) {
                check();
                return;
            }

            used[min] = true;
            for (int i = 0; i < h; i++) {
                if (!used[i]) {
                    used[i] = true;
                    p[r] = i;
                    go(l + 1, r - 1);
                    used[i] = false;
                }
            }
            used[min] = false;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            a = new char[h][];
            for (int i = 0; i < h; i++) {
                a[i] = in.next().toCharArray();
            }
            used = new boolean[h];
            p = new int[h];
            dp = new boolean[1 << w];
            go(0, h - 1);
            out.println(ans ? "YES" : "NO");
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
}

