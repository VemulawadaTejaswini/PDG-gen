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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long len = in.nextInt();
            int n = in.nextInt();
            long[] x = new long[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextInt();
            }
            long[][][] best = new long[2][n + 1][n + 1];
            for (int first = 0; first < n; ++first) {
                for (int last = 0; first + last < n; ++last) {
                    long pleft = first == 0 ? 0 : (x[n - first] - len);
                    long pright = last == 0 ? 0 : x[last - 1];
                    for (int old = 0; old < 2; ++old) {
                        long at = old == 0 ? pleft : pright;
                        best[0][first + 1][last] = Math.max(best[0][first + 1][last], best[old][first][last] + at - (x[n - first - 1] - len));
                        best[1][first][last + 1] = Math.max(best[1][first][last + 1], best[old][first][last] + x[last] - at);
                    }
                }
            }
            long res = 0;
            for (long[][] a : best) for (long[] b : a) for (long c : b) res = Math.max(res, c);
            out.println(res);
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

