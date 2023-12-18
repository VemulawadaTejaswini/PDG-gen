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
 * @author Vadim Semenov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DivisionorSubstraction solver = new DivisionorSubstraction();
        solver.solve(1, in, out);
        out.close();
    }

    static final class DivisionorSubstraction {
        public void solve(int __, InputReader in, PrintWriter out) {
            long n = in.nextLong();
            long answer = n == 2 ? 1 : 2;
            long d;
            for (d = 2; d * d <= n; ++d) {
                long m = n;
                while (m % d == 0) {
                    m /= d;
                }
                if (m % d == 1) {
                    answer++;
                }
            }
            for (long k = 2; k * k <= n - 1; ++k) {
                if ((n - 1) % k == 0) {
                    if (k >= d) {
                        answer++;
                    }
                    if ((n - 1) / k >= d) {
                        answer++;
                    }
                }
            }
            out.println(answer);
        }

    }

    static class InputReader {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(readLine());
            }
            return tokenizer.nextToken();
        }

        public String readLine() {
            String line;
            try {
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return line;
        }

    }
}

