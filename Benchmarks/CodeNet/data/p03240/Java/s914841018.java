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
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CPyramid solver = new CPyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPyramid {
        int n;
        int[] x;
        int[] y;
        long[] h;
        static final int BOUND = 100;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            x = new int[n];
            y = new int[n];
            h = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                h[i] = in.nextInt();
            }

            for (int cx = 0; cx <= BOUND; cx++) {
                for (int cy = 0; cy <= BOUND; cy++) {
                    long answer = test(cx, cy);
//                System.out.println(cx + " " + cy + " " + answer);
                    if (answer > 0) {
                        out.println(cx + " " + cy + " " + answer);
                        return;
                    }
                }
            }
        }

        long test(int cx, int cy) {
            long H = -1;
            for (int i = 0; i < n; i++) {
                long h0 = findH(cx, cy, x[i], y[i], h[i]);
                if (h[i] > 0) {
                    if (h0 <= 0) {
                        return -1;
                    }
                    if (H > 0 && H != h0) {
                        return -2;
                    }
                    H = h0;
                }
            }
            for (int i = 0; i < n; i++) {
                long h0 = findH(cx, cy, x[i], y[i], h[i]);
                if (h[i] == 0) {
                    if (h0 < H) {
                        return -3;
                    }
                }
            }

            return H;
        }

        long findH(int cx, int cy, int x, int y, long h) {
            return h + (Math.abs(x - cx) + Math.abs(y - cy));
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

