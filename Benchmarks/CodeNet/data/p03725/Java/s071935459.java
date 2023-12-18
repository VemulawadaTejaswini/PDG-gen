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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        static final int INF = (int) 1e9;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int rows = in.nextInt();
            int cols = in.nextInt();
            int k = in.nextInt();
            String[] field = new String[rows];
            int srow = -1;
            int scol = -1;
            for (int row = 0; row < rows; ++row) {
                field[row] = in.next();
                for (int col = 0; col < cols; ++col) {
                    if (field[row].charAt(col) == 'S') {
                        if (srow >= 0) throw new RuntimeException();
                        srow = row;
                        scol = col;
                    }
                }
            }
            if (srow < 0) throw new RuntimeException();
            int[][] best = new int[rows][cols];
            for (int[] x : best) Arrays.fill(x, INF);
            best[srow][scol] = 0;
            int[] qr = new int[rows * cols];
            int[] qc = new int[rows * cols];
            int qt = 0;
            int qh = 1;
            qr[0] = srow;
            qc[0] = scol;
            while (qt < qh) {
                int r = qr[qt];
                int c = qc[qt];
                ++qt;
                for (int dr = -1; dr <= 1; ++dr) {
                    for (int dc = -1; dc <= 1; ++dc) {
                        if (Math.abs(dr) + Math.abs(dc) == 1) {
                            int nr = r + dr;
                            int nc = c + dc;
                            if (field[nr].charAt(nc) == '#' || best[nr][nc] < INF) continue;
                            best[nr][nc] = best[r][c] + 1;
                            if (nr == 0 || nr == rows - 1 || nc == 0 || nc == cols - 1) {
                                out.println(1);
                                return;
                            }
                            if (best[nr][nc] < k) {
                                qr[qh] = nr;
                                qc[qh] = nc;
                                ++qh;
                            }
                        }
                    }
                }
            }
            qh = 0;
            qt = 0;
            for (int r = 0; r < rows; ++r) {
                for (int c = 0; c < cols; ++c) {
                    if (best[r][c] < INF) {
                        best[r][c] = 0;
                        qr[qh] = r;
                        qc[qh] = c;
                        ++qh;
                    }
                }
            }
            while (qt < qh) {
                int r = qr[qt];
                int c = qc[qt];
                ++qt;
                for (int dr = -1; dr <= 1; ++dr) {
                    for (int dc = -1; dc <= 1; ++dc) {
                        if (Math.abs(dr) + Math.abs(dc) == 1) {
                            int nr = r + dr;
                            int nc = c + dc;
                            if (best[nr][nc] < INF) continue;
                            best[nr][nc] = best[r][c] + 1;
                            if (nr == 0 || nr == rows - 1 || nc == 0 || nc == cols - 1) {
                                out.println(1 + (best[nr][nc] + k - 1) / k);
                                return;
                            }
                            qr[qh] = nr;
                            qc[qh] = nc;
                            ++qh;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

