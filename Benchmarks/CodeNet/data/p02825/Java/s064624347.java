import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        int n = 5;
        int[][] a = new int[n][n];
        int[] u = new int[n];
        int[] v = new int[n];
        int need;
        int lastCol = 1;
        final int HOR = 0;
        final int VER = 1;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[][] ans = new char[n][n];
            for (char[] arr : ans) {
                Arrays.fill(arr, '.');
            }
            if (n % 3 == 0) {
                for (int i = 0; i < n; i += 3) {
                    for (int j = 0; j < n; j += 3) {
                        place(ans, i, j, VER, 'a');
                        place(ans, i + 2, j + 1, HOR, 'b');
                    }
                }
            } else if (n % 4 == 0) {
                for (int i = 0; i < n; i += 4) {
                    for (int j = 0; j < n; j += 4) {
                        place(ans, i, j, HOR, 'a');
                        place(ans, i + 1, j, HOR, 'b');
                        place(ans, i + 2, j + 2, HOR, 'c');
                        place(ans, i + 3, j + 2, HOR, 'd');
                        place(ans, i, j + 2, VER, 'e');
                        place(ans, i, j + 3, VER, 'f');
                        place(ans, i + 2, j, VER, 'g');
                        place(ans, i + 2, j + 1, VER, 'h');
                    }
                }
            } else if (n % 5 == 0) {
                for (int i = 0; i < n; i += 5) {
                    for (int j = 0; j < n; j += 5) {
                        place(ans, i, j, VER, 'a');
                        place(ans, i, j + 1, VER, 'b');
                        place(ans, i, j + 2, VER, 'c');
                        place(ans, i + 2, j, VER, 'd');
                        place(ans, i + 3, j + 2, VER, 'e');

                        place(ans, i + 2, j + 1, HOR, 'f');
                        place(ans, i + 2, j + 3, HOR, 'g');
                        place(ans, i + 3, j + 3, HOR, 'h');
                        place(ans, i + 4, j, HOR, 'i');
                        place(ans, i + 4, j + 3, HOR, 'j');
                    }
                }
            } else {
                out.println(-1);
                return;
            }

            if (false) {
//        if (true) {
                for (need = 1; need <= this.n; need++) {
                    rec(0, 0);
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
                for (int t = 0; t < n; t++) {
                    System.out.println(Arrays.toString(a[t]));
                }
                throw new AssertionError("found!");
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
            if (value > 0) {
                a[r][c] = lastCol;
            } else {
                a[r][c] = 0;
            }
            u[r] += value;
            v[c] += value;
            if (type == VER) {
                if (value > 0) {
                    a[r + 1][c] = lastCol;
                } else {
                    a[r + 1][c] = 0;
                }
                u[r + 1] += value;
            } else {
                if (value > 0) {
                    a[r][c + 1] = lastCol;
                } else {
                    a[r][c + 1] = 0;
                }
                v[c + 1] += value;
            }
            if (value > 0) {
                lastCol = (lastCol + 1) % 26;
            }
        }

        private void place(char[][] s, int i, int j, int type, char col) {
            s[i][j] = col;
            if (type == HOR) {
                s[i][j + 1] = col;
            } else {
                s[i + 1][j] = col;
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

