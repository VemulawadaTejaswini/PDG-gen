import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        PrintWriter out = new PrintWriter(outputStream);
        C2DPlane2NPoints solver = new C2DPlane2NPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class C2DPlane2NPoints {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            Vec2i[] red = new Vec2i[n];
            Vec2i[] blue = new Vec2i[n];
            for (int i = 0; i < n; i++) {
                red[i] = new Vec2i(in.ints(), in.ints());
            }
            for (int i = 0; i < n; i++) {
                blue[i] = new Vec2i(in.ints(), in.ints());
            }
            Arrays.sort(red, Comparator.comparingInt(Vec2i::getY).thenComparingInt(Vec2i::getX));
            Arrays.sort(blue, Comparator.comparingInt(Vec2i::getY).thenComparingInt(Vec2i::getX));
            int ans = 0;
            for (int r = 0, b = 0; b < n; b++) {
                if (red[r].getX() < blue[b].getX() && red[r].getY() < blue[b].getY()) {
                    ans++;
                    r++;
                }
            }
            out.println(ans);
        }

    }

    static class Vec2i {
        private final int x;
        private final int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
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

    }
}

