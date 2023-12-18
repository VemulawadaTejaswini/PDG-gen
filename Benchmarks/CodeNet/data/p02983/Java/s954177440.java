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
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CRemainderMinimization2019 solver = new CRemainderMinimization2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemainderMinimization2019 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            if (a < 2019 && b >= 2019) {
                out.println(0);
            } else {
                out.println((a, a + 1) % 2019);
            }
        }

        static long gcd(long a, long b) {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }

        static long lcm(long a, long b) {
            return (a * b) / gcd(a, b);
        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

