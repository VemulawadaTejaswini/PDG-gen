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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        char[][] board;
        int a;
        int b;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            board = new char[n][m];
            for (char[] c : board) {
                Arrays.fill(c, '.');
            }

            if (can(n / 2, m / 2, a - (m / 2) * (n % 2), b - (n - 1) / 2 * (m % 2))) {
                for (int i = 0; i < (m / 2) * (n % 2) && a > 0; i++) {
                    putHor(n - 1, 2 * i);
                }
                for (int i = 0; i < ((n - 1) / 2) * (m % 2) && b > 0; i++) {
                    putVert(2 * i, m - 1);
                }

                for (int i = 0; i < n / 2; i++) {
                    for (int j = 0; j < m / 2; j++) {
                        if (a > 0) {
                            putHor(2 * i, 2 * j);
                            putHor(2 * i + 1, 2 * j);
                        } else if (b > 0) {
                            putVert(2 * i, 2 * j);
                            putVert(2 * i, 2 * j + 1);
                        }
                    }
                }
                out.println("YES");
                for (char[] c : board) {
                    out.println(new String(c));
                }
                return;
            }

            if (can(n / 2, m / 2, a - ((m - 1) / 2) * (n % 2), b - (n / 2) * (m % 2))) {
                for (int i = 0; i < ((m - 1) / 2) * (n % 2) && a > 0; i++) {
                    putHor(n - 1, 2 * i);
                }
                for (int i = 0; i < (n / 2) * (m % 2) && b > 0; i++) {
                    putVert(2 * i, m - 1);
                }

                for (int i = 0; i < n / 2; i++) {
                    for (int j = 0; j < m / 2; j++) {
                        if (a > 0) {
                            putHor(2 * i, 2 * j);
                            putHor(2 * i + 1, 2 * j);
                        } else if (b > 0) {
                            putVert(2 * i, 2 * j);
                            putVert(2 * i, 2 * j + 1);
                        }
                    }
                }
                out.println("YES");
                for (char[] c : board) {
                    out.println(new String(c));
                }
                return;
            }

            out.println("NO");
        }

        private void putHor(int i, int j) {
            if (a > 0) {
                board[i][j] = '<';
                board[i][j + 1] = '>';
                a--;
            }
        }

        private void putVert(int i, int j) {
            if (b > 0) {
                board[i][j] = '^';
                board[i + 1][j] = 'v';
                b--;
            }
        }

        boolean can(int n, int m, int a, int b) {
            return n * m >= (a + 1) / 2 + (b + 1) / 2;
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

