import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author palayutm
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int H = in.nextInt(), W = in.nextInt(), D = in.nextInt();
            int[][] a = in.nextInt2dArray(H, W);
            int[][] b = new int[H * W + 1][];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    b[a[i][j]] = new int[]{i, j};
                }
            }
            long[] d = new long[H * W + 1];
            for (int i = D + 1; i <= H * W; i++) {
                d[i] = d[i - D] + Math.abs(b[i][0] - b[i - D][0]) + Math.abs(b[i][1] - b[i - D][1]);
            }
            int Q = in.nextInt();
            while (Q-- > 0) {
                int L = in.nextInt(), R = in.nextInt();
                out.println(d[R] - d[L]);
            }
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream out) {
            super(out);
        }

        public OutputWriter(Writer out) {
            super(out);
        }

        public void close() {
            super.close();
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

        public int[][] nextInt2dArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

    }
}

