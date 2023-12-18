import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.AbstractCollection;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.security.AccessControlException;
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
        DVariousSushi solver = new DVariousSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DVariousSushi {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints();
            int k = in.ints();
            Vec2i[] vs = new Vec2i[n];
            in.objs(vs, Vec2i::new);
            Arrays.sort(vs, Comparator.comparing(e -> -e.y));
            Map<Integer, Integer> max = new HashMap<>();
            PriorityQueue<Integer> removable = new PriorityQueue<>();
            PriorityQueue<Integer> addable = new PriorityQueue<>(Comparator.reverseOrder());
            long t = 0;
            for (int i = 0; i < k; i++) {
                t += vs[i].y;
                if (!max.containsKey(vs[i].x)) {
                    max.put(vs[i].x, vs[i].y);
                } else {
                    removable.add(vs[i].y);
                }
            }
            //System.out.println(Arrays.toString(vs));
            long v = max.size();
            long ans = t + v * v;
            for (int i = k; i < n; i++) {
                if (!max.containsKey(vs[i].x)) {
                    max.put(vs[i].x, vs[i].y);
                    addable.add(vs[i].y);
                }
            }
            //System.out.println(addable);
            //System.out.println(removable);
            for (long d = v + 1; d <= n; d++) {
                //System.out.println("d=" + d + " add=" + addable.size() + " rem=" + removable.size());
                if (addable.isEmpty() || removable.isEmpty()) {
                    break;
                }
                t -= removable.poll();
                t += addable.poll();
                ans = Math.max(ans, t + d * d);
                //System.out.println("ans=" + ans);
            }
            out.ans(ans).ln();
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

    static class Vec2i {
        public final int x;
        public final int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x && y == vec2i.y;
        }

        public int hashCode() {
            return 31 * x + y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
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

        public <T> void objs(T[] array, BiIntFunction<T> constructor) {
            for (int i = 0; i < array.length; i++) {
                array[i] = constructor.apply(ints(), ints());
            }
        }

    }

    static interface BiIntFunction<T> {
        T apply(int t, int u);

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

