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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FModularness solver = new FModularness();
        solver.solve(1, in, out);
        out.close();
    }

    static class FModularness {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            int q = in.nextInt();
            long d[] = new long[k];
            for (int i = 0; i < k; i++) d[i] = in.nextInt();
            while (q-- > 0) {
                long c = 0;
                long n = in.nextLong();
                long x = in.nextLong();
                long m = in.nextLong();
                long an = x;
                for (int i = 0; i < k; i++) {
                    long temp = (n - 2 + k - i) / k;
                    an += temp * (d[i] % m);
                    if (d[i] % m == 0) c += temp;
                }
                c += ((an / m) - (x / m));
                out.println(n - c - 1);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

