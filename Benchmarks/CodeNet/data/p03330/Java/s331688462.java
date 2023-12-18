import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[][] d = in.nextIntArrayArray(m, m);
            int[][] c = in.nextIntArrayArray0indexed(n, n);

            long[][] cnt = new long[3][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    cnt[(i + j) % 3][c[i][j]]++;
                }
            }

            long ans = Long.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < m; k++) {
                        if (i == j || j == k || k == i) continue;

                        int[] a = {i, j, k};
                        long tmp = 0;
                        for (int l = 0; l < m; l++) {
                            for (int o = 0; o < 3; o++) {
                                tmp += cnt[o][l] * d[l][a[o]];
                            }
                        }

                        ans = Math.min(ans, tmp);
                    }
                }
            }

            out.println(ans);
        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArray0indexed(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public int[][] nextIntArrayArray(int n, int m) {
            int[][] res = new int[n][m];
            for (int i = 0; i < n; i++) {
                res[i] = nextIntArray(m);
            }
            return res;
        }

        public int[][] nextIntArrayArray0indexed(int n, int m) {
            int[][] res = new int[n][m];
            for (int i = 0; i < n; i++) {
                res[i] = nextIntArray0indexed(m);
            }
            return res;
        }

    }
}

