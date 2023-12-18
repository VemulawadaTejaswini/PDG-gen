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
        C755 solver = new C755();
        solver.solve(1, in, out);
        out.close();
    }

    static class C755 {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            out.println(f(n, 0, 0));
        }

        public int f(int n, long base, int mask) {
            base *= 10;
            int ans = 0;
            if (base + 3 <= n) {
                if ((mask | 1) == 7) {
                    ans++;
                }
                ans += f(n, base + 3, mask | 1);
            }
            if (base + 5 <= n) {
                if ((mask | 2) == 7) {
                    ans++;
                }
                ans += f(n, base + 5, mask | 2);
            }
            if (base + 7 <= n) {
                if ((mask | 4) == 7) {
                    ans++;
                }
                ans += f(n, base + 7, mask | 4);
            }
            return ans;
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
}

