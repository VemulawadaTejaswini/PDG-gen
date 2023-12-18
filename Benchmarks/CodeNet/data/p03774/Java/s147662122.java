import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.StringTokenizer;
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
        BCheckpoints solver = new BCheckpoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCheckpoints {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), m = in.ints();
            Vec2l[] s = new Vec2l[n];
            in.objs(s, (BiLongFunction<Vec2l>) Vec2l::new);
            Vec2l[] c = new Vec2l[m];
            in.objs(c, (BiLongFunction<Vec2l>) Vec2l::new);
            for (int i = 0; i < n; i++) {
                long min = Long.MAX_VALUE;
                int mi = -1;
                for (int j = 0; j < m; j++) {
                    long d = Math.abs(s[i].getX() - c[j].getX()) + Math.abs(s[i].getY() - c[j].getY());
                    if (d < min) {
                        mi = j;
                        min = d;
                    }
                }
                out.println(mi + 1);
            }
        }

    }

    static class Vec2l {
        private final long x;
        private final long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public long getX() {
            return x;
        }

        public long getY() {
            return y;
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

        public <T> void objs(T[] array, BiLongFunction<T> constructor) {
            for (int i = 0; i < array.length; i++) {
                array[i] = constructor.apply(longs(), longs());
            }
        }

    }

    static interface BiLongFunction<T> {
        T apply(long t, long u);

    }
}

