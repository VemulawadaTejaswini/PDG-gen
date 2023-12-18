import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.security.AccessControlException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.util.Comparator;
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
        DZabuton solver = new DZabuton();
        solver.solve(1, in, out);
        out.close();
    }

    static class DZabuton {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints();
            Vec2l[] participants = new Vec2l[n];
            for (int i = 0; i < n; i++) {
                participants[i] = new Vec2l(in.longs(), in.longs());
            }
            Arrays.sort(participants, Comparator.comparing(participant -> participant.x + participant.y));
            long[][] dp = new long[2][n + 1];
            ArrayUtil.fill(dp, Long.MAX_VALUE);
            dp[0][0] = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dp[0][j] <= participants[i].x) {
                        dp[1][j + 1] = Math.min(dp[1][j + 1], dp[0][j] + participants[i].y); // 取る
                    }
                    dp[1][j] = Math.min(dp[1][j], dp[0][j]); // 取らない
                }
                dp[1][n] = Math.min(dp[0][n], dp[1][n]); // 取らない

                long[] tmp = dp[0];
                Arrays.fill(tmp, Long.MAX_VALUE);
                dp[0] = dp[1];
                dp[1] = tmp;
            }
            for (int i = n; i >= 0; i--) {
                if (dp[0][i] < Long.MAX_VALUE) {
                    out.ans(i).ln();
                    return;
                }
            }
        }

    }

    static class Vec2l {
        public long x;
        public long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2l vec2i = (Vec2l) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

    }

    static class Debug {
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
            }
        }

        public static boolean autoEnable() {
            try {
                String s = System.getProperty(DEBUG_PROPERTY);
                if (s != null) {
                    enable(s);
                    return true;
                }
            } catch (AccessControlException ex) {
                src = null;
            }
            return false;
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

        public long longs() {
            return Long.parseLong(string());
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

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
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

