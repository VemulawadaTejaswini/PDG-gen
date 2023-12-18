import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        CCandies solver = new CCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCandies {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();

            int[] a1 = IntMath.sum(in.ints(n));
            int[] a2 = IntMath.sum(in.ints(n));
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, a1[i + 1] + a2[n] - a2[i]);
            }
            out.println(ans);
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

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static int[] sum(int[] a) {
            int[] sum = new int[a.length + 1];
            for (int i = 0; i < a.length; i++) {
                sum[i + 1] = sum[i] + a[i];
            }
            return sum;
        }

    }
}

