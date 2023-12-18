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
        ProblemC_StrawberryCakes solver = new ProblemC_StrawberryCakes();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemC_StrawberryCakes {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int k = in.nextInt();
            char[][] s = new char[height][];
            for (int r = 0; r < height; r++) {
                s[r] = in.next().toCharArray();
            }

            int[][] ans = new int[height][width];
            int cur = 1;
            for (int r1 = 0; r1 < height; ) {
                int r2 = r1;
                while (r2 < height && isEmptyRow(s, r2)) {
                    ++r2;
                }
                ++r2;
                while (r2 < height && isEmptyRow(s, r2)) {
                    ++r2;
                }

                for (int c1 = 0; c1 < width; ) {
                    int c2 = c1;
                    while (c2 < width && isEmptyCol(s, r1, r2, c2)) {
                        ++c2;
                    }
                    ++c2;
                    while (c2 < width && isEmptyCol(s, r1, r2, c2)) {
                        ++c2;
                    }

                    for (int i = r1; i < r2; i++) {
                        for (int j = c1; j < c2; j++) {
                            ans[i][j] = cur;
                        }
                    }
                    ++cur;

                    c1 = c2;
                }

                r1 = r2;
            }

            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    if (c > 0) {
                        out.print(" ");
                    }
                    out.print(ans[r][c]);
                }
                out.println();
            }
        }

        private boolean isEmptyRow(char[][] s, int r) {
            for (char ch : s[r]) {
                if (ch == '#') {
                    return false;
                }
            }
            return true;
        }

        private boolean isEmptyCol(char[][] s, int r1, int r2, int c) {
            for (int i = r1; i < r2; i++) {
                if (s[i][c] == '#') {
                    return false;
                }
            }
            return true;
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

