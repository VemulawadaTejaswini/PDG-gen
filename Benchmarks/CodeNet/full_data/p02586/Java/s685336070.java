import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.OptionalLong;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.NoSuchElementException;
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
        EPickingGoods solver = new EPickingGoods();
        solver.solve(1, in, out);
        out.close();
    }

    static class EPickingGoods {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int r = in.ints(), c = in.ints(), k = in.ints();
            long[][] v = new long[r][c];
            long[][][] dp = new long[4][r + 1][c + 1];
            for (int i = 0; i < k; i++) v[in.ints() - 1][in.ints() - 1] = in.longs();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    for (int p = 0; p <= 3; p++) {
                        // come up
                        dp[0][i + 1][j + 1] = Math.max(dp[0][i + 1][j + 1], dp[p][i][j + 1]);
                        // come up and pick
                        dp[1][i + 1][j + 1] = Math.max(dp[1][i + 1][j + 1], dp[p][i][j + 1] + v[i][j]);
                        // come right
                        dp[p][i + 1][j + 1] = Math.max(dp[p][i + 1][j + 1], dp[p][i + 1][j]);
                        if (p == 3) continue;
                        // come right and pick
                        dp[p + 1][i + 1][j + 1] = Math.max(dp[p + 1][i + 1][j + 1], dp[p][i + 1][j] + v[i][j]);
                    }
                }
            }
            out.ans(IntMath.max(dp[0][r][c], dp[1][r][c], dp[2][r][c], dp[3][r][c])).ln();
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static long max(long... v) {
            return Arrays.stream(v).max().orElseThrow(NoSuchElementException::new);
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

