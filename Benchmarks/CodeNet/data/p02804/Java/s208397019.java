import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.LongStream;
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
        EMaxMinSums solver = new EMaxMinSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMaxMinSums {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), k = in.ints();
            long[] a = in.longs(n);
            IntroSort.sort(a);
            for (int i = 0; i < n; i++) a[i] = (a[i] % MOD + MOD) % MOD;
            ModMath mod = new ModMath();
            Factorial fact = mod.getFactorial(n + 1);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += a[i] * fact.ncr(i, k - 1) % MOD;
                ans += (MOD - a[i]) * fact.ncr(n - i - 1, k - 1) % MOD;
                ans %= MOD;
            }
            out.ans(ans).ln();
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

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            return Integer.bitCount(v);
        }

        public static int msb(int v) {
            if (v == 0) {
                throw new IllegalArgumentException("Bit not found");
            }
            v |= (v >> 1);
            v |= (v >> 2);
            v |= (v >> 4);
            v |= (v >> 8);
            v |= (v >> 16);
            return count(v) - 1;
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void swap(long[] a, int x, int y) {
            long t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static void sort(long[] a, int low, int high) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && a[j - 1] > a[j]; j--) {
                    ArrayUtil.swap(a, j - 1, j);
                }
            }
        }

    }

    static interface Verified {
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

    static class QuickSort {
        private QuickSort() {
        }

        private static void med(long[] a, int low, int x, int y, int z) {
            if (a[z] < a[x]) {
                ArrayUtil.swap(a, low, x);
            } else if (a[y] < a[z]) {
                ArrayUtil.swap(a, low, y);
            } else {
                ArrayUtil.swap(a, low, z);
            }
        }

        static int step(long[] a, int low, int high) {
            int x = low + 1, y = low + (high - low) / 2, z = high - 1;
            if (a[x] < a[y]) {
                med(a, low, x, y, z);
            } else {
                med(a, low, y, x, z);
            }

            int lb = low + 1, ub = high;
            while (true) {
                while (a[lb] < a[low]) {
                    lb++;
                }
                ub--;
                while (a[low] < a[ub]) {
                    ub--;
                }
                if (lb >= ub) {
                    return lb;
                }
                ArrayUtil.swap(a, lb, ub);
                lb++;
            }
        }

    }

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod, boolean unsafe) {
        /*if (!unsafe && !IntMath.isPrime(mod)) {
            throw new RuntimeException("This class is designed for primes!");
        }*/
            this.mod = mod;
        }

        public ModMath(long mod) {
            this(mod, false);
        }

        public ModMath() {
            this(DEFAULT_MOD, true);
        }

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
        }

        public long inv(long x) {
            //return pow(x, mod - 2);
            return mod(LongEuclidSolver.solve(x, mod).x);
        }

        public Factorial getFactorial(int n) {
            return new Factorial(this, n);
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

    static class IntroSort {
        private static int INSERTIONSORT_THRESHOLD = 16;

        private IntroSort() {
        }

        static void sort(long[] a, int low, int high, int maxDepth) {
            while (high - low > INSERTIONSORT_THRESHOLD) {
                if (maxDepth-- == 0) {
                    HeapSort.sort(a, low, high);
                    return;
                }
                int cut = QuickSort.step(a, low, high);
                sort(a, cut, high, maxDepth);
                high = cut;
            }
            InsertionSort.sort(a, low, high);
        }

        public static void sort(long[] a) {
            if (a.length <= INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(a, 0, a.length);
            } else {
                sort(a, 0, a.length, 2 * BitMath.msb(a.length));
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

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

    }

    static class Factorial {
        private final ModMath mod;
        private final long[] natural;
        private final long[] reverse;

        public Factorial(ModMath mod, int max) {
            this.mod = mod;
            this.natural = new long[max];
            this.reverse = new long[max];
            natural[0] = 1;
            for (int i = 1; i < max; i++) {
                natural[i] = mod.mod(natural[i - 1] * i);
            }
            reverse[max - 1] = mod.inv(natural[max - 1]);
            for (int i = max - 1; i > 0; i--) {
                reverse[i - 1] = mod.mod(reverse[i] * i);
            }
        }

        public long fact(long x) {
            return natural[(int) x];
        }

        public long factinv(long x) {
            return reverse[(int) x];
        }

        public long npr(long n, long r) {
            return n < r ? 0 : mod.mod(fact(n) * factinv(n - r));
        }

        public long ncr(long n, long r) {
            return mod.mod(npr(n, r) * factinv(r));
        }

        public String toString() {
            return "Factorial{" +
                    "natural=" + Arrays.toString(natural) +
                    ", reverse=" + Arrays.toString(reverse) +
                    '}';
        }

    }

    static class HeapSort {
        private HeapSort() {
        }

        private static void heapfy(long[] a, int low, int high, int i, long val) {
            int child = 2 * i - low + 1;
            while (child < high) {
                if (child + 1 < high && a[child] < a[child + 1]) {
                    child++;
                }
                if (val >= a[child]) {
                    break;
                }
                a[i] = a[child];
                i = child;
                child = 2 * i - low + 1;
            }
            a[i] = val;
        }

        static void sort(long[] a, int low, int high) {
            for (int p = (high + low) / 2 - 1; p >= low; p--) {
                heapfy(a, low, high, p, a[p]);
            }
            while (high > low) {
                high--;
                long pval = a[high];
                a[high] = a[low];
                heapfy(a, low, high, low, pval);
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
}

