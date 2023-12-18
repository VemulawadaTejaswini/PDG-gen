import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.Objects;
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
        FEncloseAll solver = new FEncloseAll();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEncloseAll {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            Vec2l[] ps = new Vec2l[n];
            for (int i = 0; i < n; i++) ps[i] = new Vec2l(in.longs(), in.longs());
            double ans = 0.0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    ans = Math.max(ans, ps[i].distanceTo(ps[j]) / 2);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    for (int k = 0; k < j; k++) {
                        Vec2l x = ps[i].sub(ps[j]);
                        Vec2l y = ps[j].sub(ps[k]);
                        Vec2l z = ps[k].sub(ps[i]);
                        long det = x.det(y) * 2;
                        if (det == 0) continue;
                        double r = Math.sqrt(x.lengthSquared() * y.lengthSquared() * z.lengthSquared()) / det;
                        if (x.length() <= 2 * r || y.length() <= 2 * r || z.length() <= 2 * r) continue;
                        ans = Math.max(ans, r);
                    }
                }
            }
            out.ans(ans, 18).ln();
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

        public LightWriter ans(double x, int n) {
            if (!breaked) {
                print(' ');
            }
            if (x < 0) {
                print('-');
                x = -x;
            }
            x += Math.pow(10, -n) / 2;
            print(Long.toString((long) x)).print('.');
            x -= (long) x;
            for (int i = 0; i < n; i++) {
                x *= 10;
                print((char) ('0' + ((int) x)));
                x -= (int) x;
            }
            return this;
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

        public int ints() {
            return Integer.parseInt(string());
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }

    static class Vec2l implements Comparable<Vec2l> {
        public long x;
        public long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public Vec2l sub(Vec2l other) {
            return new Vec2l(x - other.x, y - other.y);
        }

        public long det(Vec2l other) {
            return x * other.y - other.x * y;
        }

        public long lengthSquared() {
            return x * x + y * y;
        }

        public double length() {
            return Math.sqrt(lengthSquared());
        }

        public long distanceSquaredTo(Vec2l other) {
            long dx = x - other.x, dy = y - other.y;
            return dx * dx + dy * dy;
        }

        public double distanceTo(Vec2l other) {
            return Math.sqrt(distanceSquaredTo(other));
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

        public int compareTo(Vec2l o) {
            if (x == o.x) {
                return Long.compare(y, o.y);
            }
            return Long.compare(x, o.x);
        }

        public Vec2l clone() throws CloneNotSupportedException {
            return (Vec2l) super.clone();
        }

    }
}

