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
        CGCDOnBlackboard solver = new CGCDOnBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGCDOnBlackboard {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long pre[] = new long[n + 2];
            long post[] = new long[n + 2];
            long a[] = new long[n + 2];
            for (int i = 1; i <= n; i++) a[i] = in.nextInt();
            for (int i = 1; i <= n; i++) pre[i] = Maths.gcd(a[i], pre[i - 1]);
            for (int i = n; i >= 1; i--) post[i] = Maths.gcd(a[i], post[i + 1]);
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                ans = Math.max(ans, Maths.gcd(post[i + 1], pre[i - 1]));
            }
            out.println(ans);
        }

    }

    static class Maths {
        static long gcd(long a, long b) {
            if (a == 0) {
                return b;
            }
            if (b == 0) {
                return a;
            }

            long r, i;
            while (b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return a;
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

