import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
import java.security.AccessControlException;
import java.io.BufferedReader;
import java.util.regex.Pattern;
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
        CAlternatingPath solver = new CAlternatingPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlternatingPath {
        private static int h;
        private static int w;
        private static String[] s;
        private static int[][] dp;
        private static final Vec2l ZERO = new Vec2l(0, 0);

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            h = in.ints();
            w = in.ints();
            s = in.string(h);
            dp = new int[h][w];

            long ans = 0;
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (dp[y][x] > 0) {
                        continue;
                    }
                    Vec2l r = dfs(x, y);
                    //System.out.println("@@x="+x+" y="+y + " r="+r);
                    ans += r.x * (long) r.y;
                }
            }
            //Arrays.stream(dp).map(Arrays::toString).forEach(System.out::println);
            out.ans(ans).ln();
        }

        private static Vec2l dfs(int x, int y) {
            if (x < 0 || y < 0 || x >= w || y >= h) {
                return ZERO;
            } else if (dp[y][x] > 0) {
                if (dp[y][x] > 1) {
                    return ZERO;
                }
            /*GeoWalker.forEach4i(x, y, (nx, ny) -> {
                if (f(x, y) == f(nx, ny) && dp[ny][nx] == 0) {
                    Arrays.stream(dp).map(Arrays::toString).forEach(System.out::println);
                    throw new RuntimeException("x=" + x + " y=" + y + " nx=" + nx + " ny=" + ny);
                }
            });*/
                return ZERO;
            }
            //System.out.println("x="+x+" y="+y);
            dp[y][x] = 1;
            //Arrays.stream(dp).map(Arrays::toString).forEach(System.out::println);
            Vec2l r;
            if (s[y].charAt(x) == '.') {
                r = new Vec2l(1, 0);
            } else {
                r = new Vec2l(0, 1);
            }

            List<Vec2l> res = new ArrayList<>();
            GeoWalker.forEach4i(x, y, (nx, ny) -> {
                if (f(x, y) == f(nx, ny)) {
                    res.add(dfs(nx, ny));
                }
            });
            for (Vec2l rep : res) {
                r = r.add(rep);
            }
            dp[y][x] = 2;
            return r;
        }

        private static int f(int x, int y) {
            if (x < 0 || y < 0 || x >= w || y >= h) {
                return -1;
            }
            return (s[y].charAt(x) == '.') == ((x + y) % 2 == 0) ? 0 : 1;
        }

    }

    static interface BiIntConsumer {
        void accept(int t, int u);

    }

    static class Vec2l {
        public final long x;
        public final long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public Vec2l add(Vec2l other) {
            return new Vec2l(x + other.x, y + other.y);
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

    static final class GeoWalker {
        private static final int[] DX = {1, 0, -1, 0, 1, 1, -1, -1};
        private static final int[] DY = {0, 1, 0, -1, 1, -1, -1, 1};

        private GeoWalker() {
        }

        public static void forEach4i(int x, int y, BiIntConsumer receiver) {
            for (int i = 0; i < 4; i++) {
                receiver.accept(x + DX[i], y + DY[i]);
            }
        }

    }

    static class LightWriter implements AutoCloseable {
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\(([a-zA-Z0-9]+)\\);.*$";
        private static Pattern debugRegex;
        private final Writer out;
        private boolean autoflush = false;
        private boolean debug = false;
        private boolean breaked = true;
        private final String src;

        public LightWriter(Writer out) {
            this.out = out;
            String src = null;
            try {
                src = System.getProperty(DEBUG_PROPERTY);
            } catch (AccessControlException ex) {
                src = null;
            }
            this.src = src;
            if (src != null) {
                debug = true;
                if (debugRegex == null) {
                    debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
                }
            }
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

        public String[] string(int length) {
            return IntStream.range(0, length).mapToObj(x -> string()).toArray(String[]::new);
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

