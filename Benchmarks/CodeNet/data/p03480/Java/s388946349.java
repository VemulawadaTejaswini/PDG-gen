import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
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
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWideFlip solver = new DWideFlip();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWideFlip {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int[] s = in.string().chars().map(i -> i - '0').toArray();
            if (Arrays.stream(s).allMatch(i -> i == 1)) {
                out.println(s.length);
            } else if (Arrays.stream(s).allMatch(i -> i == 0)) {
                out.println(s.length);
            } else {
                int ans = Integer.MAX_VALUE;
                for (int i = 1; i < s.length; i++) {
                    if (s[i - 1] != s[i]) {
                        ans = Math.min(ans, Math.max(i, s.length - i));
                    }
                }
                out.println(ans);
            }
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

    }
}

