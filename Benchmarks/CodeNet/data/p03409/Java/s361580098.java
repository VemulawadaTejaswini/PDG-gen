import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.Map;
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
        C2DPlane2NPoints solver = new C2DPlane2NPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class C2DPlane2NPoints {
        private static int n;
        private static Vec2i[] red;
        private static Vec2i[] blue;
        private static Map<Pair<Integer, C2DPlane2NPoints.Binary>, Integer> dp = new HashMap<>();

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            n = in.ints();
            red = new Vec2i[n];
            blue = new Vec2i[n];
            for (int i = 0; i < n; i++) {
                red[i] = new Vec2i(in.ints(), in.ints());
            }
            for (int i = 0; i < n; i++) {
                blue[i] = new Vec2i(in.ints(), in.ints());
            }
            out.println(dfs(new Pair<>(0, new C2DPlane2NPoints.Binary(new boolean[n]))));
        }

        private static int dfs(Pair<Integer, C2DPlane2NPoints.Binary> key) {
            if (key.key == n) {
                return 0;
            } else if (dp.containsKey(key)) {
                return dp.get(key);
            }
            int ans = dfs(new Pair<>(key.key + 1, key.value));
            int xmin = Integer.MAX_VALUE, xminIndex = -1;
            int ymin = Integer.MAX_VALUE, yminIndex = -1;
            for (int i = 0; i < n; i++) {
                if (!key.value.a[i] && red[key.key].getX() < blue[i].getX() && red[key.key].getY() < blue[i].getY()) {
                    if (blue[i].getX() < xmin) {
                        xmin = blue[i].getX();
                        xminIndex = i;
                    }
                    if (blue[i].getY() < ymin) {
                        ymin = blue[i].getY();
                        yminIndex = i;
                    }
                }
            }
            if (xminIndex >= 0) {
                boolean[] nb = key.value.a.clone();
                nb[xminIndex] = true;
                ans = Math.max(ans, 1 + dfs(new Pair<>(key.key + 1, new C2DPlane2NPoints.Binary(nb))));
            }
            if (yminIndex >= 0 && xminIndex != yminIndex) {
                boolean[] nb = key.value.a.clone();
                nb[yminIndex] = true;
                ans = Math.max(ans, 1 + dfs(new Pair<>(key.key + 1, new C2DPlane2NPoints.Binary(nb))));
            }
            return ans;
        }

        private static class Binary {
            boolean[] a;

            public Binary(boolean[] a) {
                this.a = a;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                C2DPlane2NPoints.Binary binary = (C2DPlane2NPoints.Binary) o;
                return Arrays.equals(a, binary.a);
            }

            public int hashCode() {
                return Arrays.hashCode(a);
            }

        }

    }

    static final class Pair<K, V> {
        public K key;
        public V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(key, pair.key) &&
                    Objects.equals(value, pair.value);
        }

        public int hashCode() {
            return Objects.hash(key, value);
        }

        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
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

