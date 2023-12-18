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
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CAntiDivision solver = new CAntiDivision();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAntiDivision {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a, b, c, d;
            a = in.nextLong();
            b = in.nextLong();
            c = in.nextLong();
            d = in.nextLong();
            long x = b / c - (a - 1) / c;
            long y = b / d - (a - 1) / d;
            long e = gcd(c, d);
            long k = b - a + 1;
            e = (c * d) / e;
            long h = b / e - (a - 1) / e;
            out.println(b - a + 1 - x - y + h);
        }

        private long gcd(long c, long d) {
            if (d == 0) return c;
            else return gcd(d, c % d);
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

