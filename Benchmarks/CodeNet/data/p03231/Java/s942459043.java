import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATwoAbbreviations solver = new ATwoAbbreviations();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoAbbreviations {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long n = in.NextInt();
            long m = in.NextInt();
            char[] s = in.next().toCharArray();
            char[] t = in.next().toCharArray();

            if (s[0] != t[0]) {
                out.println(-1);
                return;
            }
            if (n == m) {
                if (Arrays.equals(s, t)) {
                    out.println(n);
                } else {
                    out.println(-1);
                }
                return;
            }
            long gcd = MathExtensions.gcd(n, m);
            long lcd = (n / gcd) * m;

            for (long x = 1; x < m; x++) {
                long xn = x * n;
                long y = xn / m;
                if (y * m == xn) {
                    if (s[(int) y] != t[(int) x]) {
                        out.println(-1);
                        return;
                    }
                }
            }

            out.println(lcd);
//        x*l/m=y*l/n
//        x/m=y/n
//        x=y*m/n;
//        x*n=y*m;
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

    }

    static class MathExtensions {
        public static long gcd(long a, long b) {
            if (b == 0) return a;
            long t;
            while (a != 0) {
                t = a;
                a = b % a;
                b = t;
            }
            return b;
        }

    }
}

