import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
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
        DMovingPiece solver = new DMovingPiece();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMovingPiece {
        static int n;
        static int[][] p;
        static long[][] c;
        static int retNow;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            n = in.ints();
            p = new int[n][30];
            c = new long[n][30];
            long k = in.longs();
            for (int i = 0; i < n; i++) p[i][0] = in.ints() - 1;
            long[] c0 = in.longs(n);
            for (int i = 0; i < n; i++) c[i][0] = c0[p[i][0]];
            for (int i = 1; i < 30; i++) {
                for (int j = 0; j < n; j++) {
                    int t = p[j][i - 1];
                    p[j][i] = p[t][i - 1];
                    c[j][i] = c[j][i - 1] + c[t][i - 1];
                }
            }

            long ans = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int now = i;
                long res = 0;
                for (int j = 0; j < Math.min(n, k); j++) {
                    res += c[now][0];
                    now = p[now][0];
                    ans = Math.max(ans, res);
                }

                long start = Math.max(0, k - n);
                res = sum(i, start);
                now = retNow;
                for (long j = start; j < k; j++) {
                    res += c[now][0];
                    now = p[now][0];
                    ans = Math.max(ans, res);
                }
            }
            out.ans(ans).ln();
        }

        private static long sum(int now, long k) {
            if (k == 0) {
                retNow = now;
                return 0;
            }
            if (k < 0) throw new IllegalArgumentException();
            long res = 0;
            for (int j = 29; j >= 0; j--) {
                if (((1L << j) & k) == 0) continue;
                res += c[now][j];
                now = p[now][j];
            }
            retNow = now;
            return res;
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

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
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

