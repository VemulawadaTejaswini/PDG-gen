import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.io.BufferedReader;
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
        CProductAndGCD solver = new CProductAndGCD();
        solver.solve(1, in, out);
        out.close();
    }

    static class CProductAndGCD {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            Map<Long, Integer> factor = new HashMap<>();
            long n = in.longs(), p = in.longs();
            Long f = null;
            while ((f = IntMath.getPrimeFactor(p)) != null) {
                factor.merge(f, 1, (x, y) -> x + y);
                p /= f;
            }
            if (p > 1) {
                factor.merge(p, 1, (x, y) -> x + y);
            }

            long ans = 1;
            for (Map.Entry<Long, Integer> e : factor.entrySet()) {
                for (int i = 0; i < e.getValue() / n; i++) {
                    ans *= e.getKey();
                }
            }
            out.println(ans);
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static Long getPrimeFactor(long a) {
            if (a <= 1) {
                return null;
            } else if ((a & 1) == 0) {
                return 2L;
            }
            for (long i = 3; i * i <= a; i += 2) {
                if (a % i == 0) {
                    return i;
                }
            }
            return a;
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

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

