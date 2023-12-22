import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        LightWriter out = new LightWriter(outputStream);
        EMsSolution solver = new EMsSolution();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMsSolution {
        private static final long INF = 1_000_000_000_000_000L;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long[] x = new long[n], y = new long[n], p = new long[n];
            in.longs(x, y, p);
            long[][] ansX = solve(n, x, p), ansY = solve(n, y, p);

            long[] ans = new long[n + 1];
            Arrays.fill(ans, INF);

            int all = 1 << n;
            for (int i = 0; i < all; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; j + k <= n; k++) {
                        ans[j + k] = Math.min(ans[j + k], ansX[i][j] + ansY[(all - 1) & ~i][k]);
                    }
                }
            }
            for (int i = 0; i <= n; i++) {
                out.ans(ans[i]).ln();
            }
        }

        private static long[][] solve(int n, long[] x, long[] p) {
            x = Arrays.copyOf(x, n + 1);
            x[n] = 0;
            long[][][] dp = new long[1 << n][n + 1][n + 1];
            ArrayUtil.fill(dp, INF);
            dp[0][n][0] = 0;
            int all = 1 << n;
            for (int i = 0; i < all; i++) {
                for (int j = 0; j < n; j++) { //next
                    if ((i & (1 << j)) != 0) continue; // visited already
                    int s = i | (1 << j);
                    for (int k = 0; k <= n; k++) { // prev built
                        if (k != n && (i & (1 << k)) == 0) continue; // not visited yet
                        for (int m = 0; m < n; m++) {// roads built
                            // use existing
                            dp[s][k][m] = Math.min(dp[s][k][m], dp[i][k][m] + p[j] * Math.abs(x[k] - x[j]));
                            // build new
                            dp[s][j][m + 1] = Math.min(dp[s][j][m + 1], dp[i][k][m]);
                        }
                    }
                }
            }

            long[][] ans = new long[all][n + 1];
            for (int i = 0; i < all; i++) {
                for (int j = 0; j <= n; j++) {
                    ans[i][j] = INF;
                    for (int k = 0; k <= n; k++) {
                        ans[i][j] = Math.min(ans[i][j], dp[i][k][j]);
                    }
                }
            }
            return ans;
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(long[] a, long v) {
            Arrays.fill(a, v);
        }

        public static void fill(long[][] a, long v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

        public static void fill(long[][][] a, long v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

        public long longs() {
            return Long.parseLong(string());
        }

        public void longs(long[]... arrays) {
            int l = Arrays.stream(arrays).mapToInt(a -> a.length).min().orElse(0);
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = longs();
                }
            }
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

