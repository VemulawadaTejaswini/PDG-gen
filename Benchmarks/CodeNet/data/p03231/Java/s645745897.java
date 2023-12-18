import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATwoAbbreviations solver = new ATwoAbbreviations();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoAbbreviations {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), m = in.ints();
            String s = in.string(), t = in.string();
            int lcm = IntMath.lcm(n, m);
            int gcd = n * m / lcm;
            int x = 0, y = 0;
            for (int i = 0; i < gcd; i++) {
                if (s.charAt(x) != t.charAt(y)) {
                    out.println(-1);
                    return;
                }
                x += n / gcd;
                y += m / gcd;
            }
            out.println(lcm);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static int lcm(int a, int b) {
            long ans = a * b;
            ans /= gcd(a, b);
            return (int) ans;
        }

        public static int gcd(int a, int b) {
            int t;
            while (a % b > 0) {
                t = b;
                b = a % b;
                a = t;
            }
            return b;
        }

    }
}

