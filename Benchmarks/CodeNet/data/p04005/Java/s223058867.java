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
        ADivideACuboid solver = new ADivideACuboid();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADivideACuboid {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a = in.nextLong(), b = in.nextLong(), c = in.nextLong();

            long ans = Long.MAX_VALUE;
            ans = Math.min(ans, f(a, b, c));
            ans = Math.min(ans, f(b, c, a));
            ans = Math.min(ans, f(c, a, b));

            out.println(ans);
        }

        public static long f(long a, long b, long c) {
            return c % 2 == 0 ? 0 : a * b;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

