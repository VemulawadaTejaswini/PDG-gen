import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.function.LongBinaryOperator;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
        EXORPartitioning solver = new EXORPartitioning();
        solver.solve(1, in, out);
        out.close();
    }

    static class EXORPartitioning {
        private static final int MOD = (int) 1e9 + 7;
        private static final int MAX = 32;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            ModMath mod = new ModMath(MOD);
            int n = in.ints();
            int[] a = in.ints(n);
            int xor = 0;
            long[] cnt = new long[MAX];
            int[] app = new int[MAX];
            IntLazySegmentTree st = new IntLazySegmentTree(cnt, Long::sum, 0, Long::sum, Long::sum, 0, (x, y) -> x * y);
            for (int i = 0; i < n; i++) {
                xor ^= a[i];
                if (xor == 0) {
                    st.update(0, MAX, 1);
                } else {
                    app[xor]++;
                    st.update(xor, 1);
                }
            }


            long[] dp = new long[500_001];
            dp[1] = dp[2] = 1;
            for (int i = 3; i <= 500_000; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % MOD;
            }
            if (xor != 0) {
                int c = (int) st.query(xor, xor + 1);
                out.ans(dp[c]).ln();
            } else {
                int zero = (int) st.query(0, 1);
                //System.out.println("zero=" + zero);
                long ans = mod.pow(2, zero - 1);
                for (int i = 1; i < MAX; i++) {
                    if (app[i] == 0) continue;
                    int c = (int) st.query(i, i + 1);
                    //System.out.println("for i=" + i + " c=" + c);
                    ans += dp[c];
                    ans %= MOD;
                }
                out.ans(ans).ln();
            }
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

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int extractMsb(int v) {
            v = (v & 0xFFFF0000) > 0 ? v & 0xFFFF0000 : v;
            v = (v & 0xFF00FF00) > 0 ? v & 0xFF00FF00 : v;
            v = (v & 0xF0F0F0F0) > 0 ? v & 0xF0F0F0F0 : v;
            v = (v & 0xCCCCCCCC) > 0 ? v & 0xCCCCCCCC : v;
            v = (v & 0xAAAAAAAA) > 0 ? v & 0xAAAAAAAA : v;
            return v;
        }

    }

    static class LongEuclidSolver {
        private LongEuclidSolver() {
        }

        public static Vec3l solve(long a, long b) {
            LongEuclidSolver.ReferenceLong p = new LongEuclidSolver.ReferenceLong(), q = new LongEuclidSolver.ReferenceLong();
            long d = solve(a, b, p, q);
            return new Vec3l(p.val, q.val, d);
        }

        private static long solve(long a, long b, LongEuclidSolver.ReferenceLong p, LongEuclidSolver.ReferenceLong q) {
            if (b == 0) {
                p.val = 1;
                q.val = 0;
                return a;
            } else {
                long d = solve(b, a % b, q, p);
                q.val -= (a / b) * p.val;
                return d;
            }
        }

        private static class ReferenceLong {
            private long val;

        }

    }

    static interface Verified {
    }

    static interface LongIntToLongFunction<T, R> {
        long applyAsLong(long x, int y);

    }

    static class IntLazySegmentTree {
        private final int n;
        private final int m;
        private final long[] tree;
        private final long[] lazy;
        private final LongBinaryOperator op;
        private final long zero;
        private final LongBinaryOperator up;
        private final LongBinaryOperator merge;
        private final long nop;
        private final LongIntToLongFunction mul;

        public IntLazySegmentTree(long[] array, LongBinaryOperator op, long zero, LongBinaryOperator up,
                                  LongBinaryOperator merge, long nop,
                                  LongIntToLongFunction mul) {
            this.n = array.length;
            int msb = BitMath.extractMsb(n);
            this.m = n == msb ? msb : (msb << 1);
            this.op = op;
            this.zero = zero;
            this.up = up;
            this.merge = merge;
            this.nop = nop;
            this.mul = mul;
            this.tree = new long[m * 2 - 1];
            Arrays.fill(tree, zero);
            System.arraycopy(array, 0, this.tree, m - 1, array.length);
            this.lazy = new long[m * 2 - 1];
            Arrays.fill(lazy, nop);
            for (int i = m - 2; i >= 0; i--) {
                tree[i] = op.applyAsLong(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        public IntLazySegmentTree(long[] array, LongBinaryOperator op, long zero, LongBinaryOperator up,
                                  LongBinaryOperator merge, long nop) {
            this(array, op, zero, up, merge, nop, (q, n) -> q);
        }

        private void eval(int len, int k) {
            if (lazy[k] == nop) {
                return;
            } else if (k * 2 + 1 < m * 2 - 1) {
                lazy[k * 2 + 1] = merge.applyAsLong(lazy[k * 2 + 1], lazy[k]);
                lazy[k * 2 + 2] = merge.applyAsLong(lazy[k * 2 + 2], lazy[k]);
            }
            tree[k] = up.applyAsLong(tree[k], mul.applyAsLong(lazy[k], len));
            lazy[k] = nop;
        }

        public void update(int i, long v) {
            i += m - 1;
            eval(1, i);
            tree[i] = up.applyAsLong(tree[i], v);
            while (i > 0) {
                i = (i - 1) / 2;
                tree[i] = op.applyAsLong(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        private long update(int l, int r, long q, int k, int sl, int sr) {
            if (r <= sl || sr <= l) {
                eval(sr - sl, k);
                return tree[k];
            }
            if (l <= sl && sr <= r) {
                lazy[k] = merge.applyAsLong(lazy[k], q);
                eval(sr - sl, k);
                return tree[k];
            } else {
                eval(sr - sl, k);
                return tree[k] = op.applyAsLong(
                        update(l, r, q, k * 2 + 1, sl, (sl + sr) / 2),
                        update(l, r, q, k * 2 + 2, (sl + sr) / 2, sr)
                );
            }
        }

        public void update(int l, int r, long q) {
            update(l, r, q, 0, 0, m);
        }

        private long query(int l, int r, int k, int sl, int sr) {
            if (r <= sl || sr <= l) {
                return zero;
            }
            eval(sr - sl, k);
            if (l <= sl && sr <= r) {
                return tree[k];
            } else {
                long left = query(l, r, 2 * k + 1, sl, (sl + sr) / 2);
                long right = query(l, r, 2 * k + 2, (sl + sr) / 2, sr);
                return op.applyAsLong(left, right);
            }
        }

        public long query(int l, int r) {
            return query(l, r, 0, 0, m);
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

        public long pow(long x, long y) {
            if (y < 0) {
                return pow(inv(x), -y);
            } else if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                long z = pow(x, y / 2);
                return (z * z) % mod;
            } else {
                return (x % mod) * pow(x, y - 1) % mod;
            }
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
}

