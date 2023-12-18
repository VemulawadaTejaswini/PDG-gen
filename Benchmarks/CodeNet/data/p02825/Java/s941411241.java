import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Set;
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
        C_DominoQuality solver = new C_DominoQuality();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_DominoQuality {
        int n;
        int[][] a;
        char[][] ans;
        int[] u;
        int[] v;
        int need;
        final int HOR = 0;
        final int VER = 1;
        boolean timeout;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            if (N < 3) {
                out.println(-1);
                return;
            }

            int[][][] smallAns = new int[8][][];
            for (n = 3; n <= 7; n++) {
                for (need = 1; need <= 3; need++) {
                    if (n == 7) {
                        need = 3;
                    }
                    try {
                        timeout = false;
                        a = new int[n][n];
                        u = new int[n];
                        v = new int[n];
                        rec(0, 0);
                    } catch (RuntimeException e) {
                        smallAns[n] = a;
                        break;
                    }
                }
            }

            ans = new char[N][N];
            for (char[] s : ans) {
                Arrays.fill(s, '.');
            }
            n = N % 4;
            int k = (N - n) / 4;
            if (k > 0) {
                k -= 1;
                n += 4;
            }
            for (int block = 0; block < k; block++) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (smallAns[4][i][j] != 0) {
                            ans[4 * block + i][4 * block + j] = (char) (smallAns[4][i][j] + 'a');
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (smallAns[n][i][j] != 0) {
                        ans[4 * k + i][4 * k + j] = (char) (smallAns[n][i][j] + 'a');
                    }
                }
            }

            for (char[] s : ans) {
                out.println(new String(s));
            }
        }

        private void rec(int r, int c) {
            if (r == n) {
                return;
            }
            if (c == n) {
                if (u[r] != need) {
                    return;
                }
                rec(r + 1, 0);
                return;
            }
            boolean found = true;
            for (int i = 0; i < n; i++) {
                if (u[i] != need || v[i] != need) {
                    found = false;
                }
            }
            if (found) {
//            for (int t = 0; t < n; t++) {
//                System.out.println(Arrays.toString(a[t]));
//            }
//            System.out.println();
                throw new RuntimeException();
            }
            if (r + 1 < n && u[r] < need && u[r + 1] < need && v[c] < need && a[r][c] == 0 && a[r + 1][c] == 0) {
                place(r, c, VER, +1);
                rec(r, c + 1);
                place(r, c, VER, -1);
            }
            if (c + 1 < n && v[c] < need && v[c + 1] < need && u[r] < need && a[r][c] == 0 && a[r][c + 1] == 0) {
                place(r, c, HOR, +1);
                rec(r, c + 1);
                place(r, c, HOR, -1);
            }
            rec(r, c + 1);
        }

        private void place(int r, int c, int type, int value) {
            Set<Integer> nei = new HashSet<>();
            for (int i = r - 4; i <= r + 4; i++) {
                for (int j = c - 4; j <= c + 4; j++) {
                    int ii = ((i % n) + n) % n;
                    int jj = ((j % n) + n) % n;
                    nei.add(a[ii][jj]);
                }
            }
            int col = 1;
            while (nei.contains(col)) {
                ++col;
            }
            if (value > 0) {
                a[r][c] = col;
            } else {
                a[r][c] = 0;
            }
            u[r] += value;
            v[c] += value;
            if (type == VER) {
                if (value > 0) {
                    a[r + 1][c] = col;
                } else {
                    a[r + 1][c] = 0;
                }
                u[r + 1] += value;
            } else {
                if (value > 0) {
                    a[r][c + 1] = col;
                } else {
                    a[r][c + 1] = 0;
                }
                v[c + 1] += value;
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

