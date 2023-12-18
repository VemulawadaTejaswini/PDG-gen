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
        ETwoCurrencies solver = new ETwoCurrencies();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETwoCurrencies {
        private static final long INF = 1_000_000_000_000_000L;
        private static final int MAX = 2510;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), m = in.ints(), s = in.ints();
            int[] u = new int[m], v = new int[m], a = new int[m], b = new int[m];
            for (int i = 0; i < m; i++) {
                u[i] = in.ints() - 1;
                v[i] = in.ints() - 1;
                a[i] = in.ints();
                b[i] = in.ints();
            }
            int[] c = new int[n], d = new int[n];
            in.ints(c, d);

            long[][] dp = new long[n][MAX + 1];
            ArrayUtil.fill(dp, INF);
            dp[0][Math.min(s, MAX)] = 0;
            for (int j = 0; j <= MAX; j++)
                dp[0][Math.min(MAX, j + c[0])] = Math.min(dp[0][Math.min(MAX, j + c[0])], dp[0][j] + d[0]);
            for (int run = 0; run < 2 * n; run++) {
                for (int i = 0; i < m; i++) {
                    for (int j = a[i]; j <= MAX; j++) {
                        dp[u[i]][j - a[i]] = Math.min(dp[u[i]][j - a[i]], dp[v[i]][j] + b[i]);
                        dp[v[i]][j - a[i]] = Math.min(dp[v[i]][j - a[i]], dp[u[i]][j] + b[i]);
                    }
                    for (int j = 0; j <= MAX; j++) {
                        dp[u[i]][Math.min(MAX, j + c[u[i]])] = Math.min(dp[u[i]][Math.min(MAX, j + c[u[i]])], dp[u[i]][j] + d[u[i]]);
                        dp[v[i]][Math.min(MAX, j + c[v[i]])] = Math.min(dp[v[i]][Math.min(MAX, j + c[v[i]])], dp[v[i]][j] + d[v[i]]);
                    }
                }
            }
            for (int i = 1; i < n; i++) {
                long ans = INF;
                for (int j = 0; j <= MAX; j++) ans = Math.min(ans, dp[i][j]);
                out.ans(ans).ln();
            }
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

    }

    static class LightScanner implements AutoCloseable {
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

        public void ints(int[]... arrays) {
            int l = Arrays.stream(arrays).mapToInt(a -> a.length).min().orElse(0);
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = ints();
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
}

