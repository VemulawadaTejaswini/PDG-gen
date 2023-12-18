import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Collections;
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
        CDifferBy1Bit solver = new CDifferBy1Bit();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferBy1Bit {
        private static final String NO = "NO";

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            int a = in.ints(), b = in.ints();
            if (BitMath.count(a) > BitMath.count(b)) {
                int t = a;
                a = b;
                b = t;
            }

            int[] count = new int[n + 1];
            ModMath mod = new ModMath(Integer.MAX_VALUE);
            for (int i = 0; i <= n; i++) {
                count[i] = (int) mod.ncr(n, i);
            }

            boolean[] used = new boolean[1 << n];
            List<Integer> first = new ArrayList<>(), last = new ArrayList<>();

            for (int i = a; i > 0; ) {
                used[i] = true;
                count[BitMath.count(i)]--;
                first.add(i);
                i &= ~BitMath.extractLsb(i);
            }

            for (int i = b; i < (1 << n) - 1; ) {
                used[i] = true;
                count[BitMath.count(i)]--;
                last.add(i);
                i |= BitMath.extractLsb(~i);
            }
            Collections.reverse(last);

            //System.out.println(Arrays.toString(count));
            // possibility check
            for (int i = 1; i < n; i++) {
                if ((count[i - 1] + count[i]) % 2 == 1) {
                    out.ansln(NO);
                    return;
                }
            }
            throw new RuntimeException();
        }

    }

    static class Vec3i implements Comparable<Vec3i> {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3i o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Integer.compare(z, o.z);
                }
                return Integer.compare(y, o.z);
            }
            return Integer.compare(x, o.x);
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

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            v = (v & 0x55555555) + ((v >> 1) & 0x55555555);
            v = (v & 0x33333333) + ((v >> 2) & 0x33333333);
            v = (v & 0x0f0f0f0f) + ((v >> 4) & 0x0f0f0f0f);
            v = (v & 0x00ff00ff) + ((v >> 8) & 0x00ff00ff);
            v = (v & 0x0000ffff) + ((v >> 16) & 0x0000ffff);
            return v;
        }

        public static int extractLsb(int v) {
            return v & (-v);
        }

    }

    static class Vec3l implements Comparable<Vec3l> {
        public long x;
        public long y;
        public long z;

        public Vec3l(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3l o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Long.compare(z, o.z);
                }
                return Long.compare(y, o.z);
            }
            return Long.compare(x, o.x);
        }

    }

    static class LongEuclidSolver {
        private LongEuclidSolver() {
        }

        public static Vec3l solve(long p, long q) {
            if (q == 0) {
                return new Vec3l(p, 1, p);
            }
            Vec3l vals = solve(q, p % q);
            long a = vals.y;
            long b = vals.x - (p / q) * a;
            return new Vec3l(a, b, vals.z);
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

        public LightWriter ansln(String... n) {
            for (String n1 : n) {
                ans(n1).ln();
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

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod) {
            this.mod = mod;
        }

        public ModMath() {
            this(DEFAULT_MOD);
        }

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
        }

        public long inv(long x) {
            return mod(LongEuclidSolver.solve(x, -mod).x);
        }

        public long npr(int n, int r) {
            if (n < r) {
                return 0;
            }
            long ans = 1;
            for (int i = 0; i < r; i++) {
                ans *= (n - i);
                ans %= mod;
            }
            return ans;
        }

        public long ncr(int n, int r) {
            long div = 1;
            for (int i = 2; i <= r; i++) {
                div *= i;
                div %= mod;
            }
            return mod(npr(n, r) * inv(div));
        }

    }
}

