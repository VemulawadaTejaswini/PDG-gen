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
        B_Joker solver = new B_Joker();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_Joker {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] p = new int[n * n];
            for (int i = 0; i < p.length; i++) {
                p[i] = in.nextInt() - 1;
            }
            int[][] naiveCost = new int[n][n];
            int[] compCost = new int[n * n];
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    int u = Math.min(r, n - 1 - r);
                    int v = Math.min(c, n - 1 - c);
                    naiveCost[r][c] = Math.min(u, v);
                    compCost[n * r + c] = naiveCost[r][c];
                }
            }

            final int[] dr = {-1, 0, 1, 0};
            final int[] dc = {0, -1, 0, 1};
            boolean[][] isFree = new boolean[n][n];
            DSU dsu = new DSU(n * n);
            int ans = 0;
            for (int who : p) {
                int r = who / n;
                int c = who % n;
                int x = naiveCost[r][c];
                for (int dir = 0; dir < 4; dir++) {
                    int nr = r + dr[dir];
                    int nc = c + dc[dir];
                    if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                        continue;
                    }
                    if (!isFree[nr][nc]) {
                        continue;
                    }
                    x = Math.min(x, compCost[dsu.findComp(nr * n + nc)]);
                    dsu.merge(r * n + c, nr * n + nc);
                }
                ans += x;
                compCost[dsu.findComp(who)] = x;
                isFree[r][c] = true;
            }
            out.println(ans);
        }

        class DSU {
            int[] f;
            int numComps;

            DSU(int n) {
                f = new int[n];
                reset();
            }

            void reset() {
                for (int i = 0; i < f.length; i++) {
                    f[i] = i;
                }
                numComps = f.length;
            }

            private int findComp(int x) {
                int r;
                int saved;

                saved = x;
                while (x != f[x]) {
                    x = f[x];
                }
                r = x;

                x = saved;
                while (x != r) {
                    saved = f[x];
                    f[x] = r;
                    x = saved;
                }
                return r;
            }

            private void merge(int p0, int q0) {
                int p1 = f[p0];
                int q1 = f[q0];
                while (p1 != q1) {
                    if (p1 > q1) {
                        if (p0 == p1) {
                            --numComps;
                        }
                        f[p0] = q1;
                        p0 = p1;
                        p1 = f[p1];
                    } else {
                        if (q0 == q1) {
                            --numComps;
                        }
                        f[q0] = p1;
                        q0 = q1;
                        q1 = f[q1];
                    }
                }
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

