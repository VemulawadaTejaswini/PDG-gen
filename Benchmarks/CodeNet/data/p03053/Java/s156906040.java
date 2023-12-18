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
        A_DarkerAndDarker solver = new A_DarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_DarkerAndDarker {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            char[][] s = new char[height][];
            int[] qr = new int[height * width];
            int[] qc = new int[height * width];
            int qt = 0;
            int qh = 0;
            int[][] d = new int[height][width];
            for (int[] arr : d) {
                Arrays.fill(arr, height + width + 1);
            }
            for (int r = 0; r < height; r++) {
                s[r] = in.next().toCharArray();
                for (int c = 0; c < width; c++) {
                    if (s[r][c] == '#') {
                        qr[qh] = r;
                        qc[qh] = c;
                        ++qh;
                        d[r][c] = 0;
                    }
                }
            }
            while (qt < qh) {
                int r = qr[qt];
                int c = qc[qt];
                ++qt;
                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {
                        if ((dr == 0) != (dc == 0)) {
                            int nr = r + dr;
                            int nc = c + dc;
                            if (nr < 0 || nr >= height || nc < 0 || nc >= width) {
                                continue;
                            }
                            if (d[nr][nc] > 1 + d[r][c]) {
                                d[nr][nc] = 1 + d[r][c];
                                qr[qh] = nr;
                                qc[qh] = nc;
                                ++qh;
                            }
                        }
                    }
                }
            }
            int r = qr[qh - 1];
            int c = qc[qh - 1];
            out.println(d[r][c]);
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

