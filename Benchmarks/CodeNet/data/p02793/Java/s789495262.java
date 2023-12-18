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
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            long gcd = 0;
            long lcm = 1;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                lcm = (lcm * a[i]) / Maths.gcd(lcm, a[i]);
//            out.println(lcm);
            }
            long ans = 0;
            long mod = 100_000_000_7;

            for (int i = 0; i < n; i++) {
                ans += (lcm / a[i]) % mod;
                ans %= mod;
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

