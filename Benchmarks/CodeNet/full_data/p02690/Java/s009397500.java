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
        DIHateFactorization solver = new DIHateFactorization();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIHateFactorization {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long x = in.nextLong();
            for (long i = 0; i < 3000; i++) {
                for (long j = 0; j < 3000; j++) {
                    long a = i * i * i * i * i;
                    long b = j * j * j * j * j;
                    if ((a - b) == x) {
                        out.println(i + " " + j);
                        return;
                    }
                    if ((a + b) == x) {
                        out.println(i + " " + -j);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

