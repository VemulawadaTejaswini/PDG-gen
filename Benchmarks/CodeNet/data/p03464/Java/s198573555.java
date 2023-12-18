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
        BIceRinkGame solver = new BIceRinkGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class BIceRinkGame {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            long[] a = new long[k];

            // read input in reverse
            for (int i = k - 1; i >= 0; i--) {
                a[i] = in.nextInt();
            }

            long lower = 2, upper = 2;

            for (long x : a) {
                long l2 = (lower / x) * x;
                if (l2 < lower) l2 += x;

                long u2 = (upper / x) * x;

                lower = l2;
                upper = u2 + (x - 1);
                if (lower > upper) {
                    break;
                }
            }

            if (lower > upper) {
                out.println(-1);
            } else {
                out.format("%d %d%n", lower, upper);
            }
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

