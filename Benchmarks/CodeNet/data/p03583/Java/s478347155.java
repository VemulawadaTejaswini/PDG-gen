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
        C4N solver = new C4N();
        solver.solve(1, in, out);
        out.close();
    }

    static class C4N {
        static final int CAP = 3500;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.nextInt();

            for (long b = 1; b <= CAP; b++) {
                for (long c = 1; c <= CAP; c++) {
                    long d = 4 * b * c - n * b - n * c;
                    if (d == 0) {
                        continue;
                    }
                    long a = (n * b * c) / d;
                    if (a > 0 && a <= CAP && n * (a * b + b * c + c * a) == 4 * a * b * c) {
                        out.println(a + " " + b + " " + c);
                        return;
                    }
                }
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

