import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskC {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int p = 200003;
            Modular mod = new Modular(p);
            Modular powMod = mod.getModularForPowerComputation();
            int n = in.readInt();
            int[] a = new int[n];
            in.populate(a);
            int root = new PrimitiveRoot(p).findMinPrimitiveRoot();
            int[] invPow = new int[p];
            int[] pow = new int[p];
            for (int i = 0, val = 1; i < p - 1; i++, val = mod.mul(val, root)) {
                invPow[val] = i;
                pow[i] = val;
            }
            int proper = Log2.ceilLog(p - 1 + p - 1 + 1);
            double[][] poly = new double[2][1 << proper];
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    continue;
                }
                poly[0][invPow[a[i]]]++;
            }
            FastFourierTransform.dft(poly, proper);
            FastFourierTransform.dotMul(poly, poly, poly, proper);
            FastFourierTransform.idft(poly, proper);
            long sum = 0;
            for (int i = 0; i < 1 << proper; i++) {
                long cnt = Math.round(poly[0][i]);
                if (cnt == 0) {
                    continue;
                }
                int val = pow[powMod.valueOf(i)];
                sum += cnt * val;
            }

            for (int x : a) {
                sum -= mod.mul(x, x);
            }

            sum /= 2;
            out.println(sum);
        }

    }

    static class Log2 {
        public static int ceilLog(int x) {
            return 32 - Integer.numberOfLeadingZeros(x - 1);
        }

    }

    static interface InverseNumber {
    }

    static class SequenceUtils {
        public static void swap(double[] data, int i, int j) {
            double tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

        public static boolean equal(int[] a, int al, int ar, int[] b, int bl, int br) {
            if ((ar - al) != (br - bl)) {
                return false;
            }
            for (int i = al, j = bl; i <= ar; i++, j++) {
                if (a[i] != b[j]) {
                    return false;
                }
            }
            return true;
        }

    }

    static class IntegerArrayList implements Cloneable {
        private int size;
        private int cap;
        private int[] data;
        private static final int[] EMPTY = new int[0];

        public IntegerArrayList(int cap) {
            this.cap = cap;
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new int[cap];
            }
        }

        public IntegerArrayList(IntegerArrayList list) {
            this.size = list.size;
            this.cap = list.cap;
            this.data = Arrays.copyOf(list.data, size);
        }

        public IntegerArrayList() {
            this(0);
        }

        public void ensureSpace(int req) {
            if (req > cap) {
                while (cap < req) {
                    cap = Math.max(cap + 10, 2 * cap);
                }
                data = Arrays.copyOf(data, cap);
            }
        }

        public void add(int x) {
            ensureSpace(size + 1);
            data[size++] = x;
        }

        public void addAll(int[] x, int offset, int len) {
            ensureSpace(size + len);
            System.arraycopy(x, offset, data, size, len);
            size += len;
        }

        public void addAll(IntegerArrayList list) {
            addAll(list.data, 0, list.size);
        }

        public int[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public String toString() {
            return Arrays.toString(toArray());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IntegerArrayList)) {
                return false;
            }
            IntegerArrayList other = (IntegerArrayList) obj;
            return SequenceUtils.equal(data, 0, size - 1, other.data, 0, other.size - 1);
        }

        public int hashCode() {
            int h = 1;
            for (int i = 0; i < size; i++) {
                h = h * 31 + Integer.hashCode(data[i]);
            }
            return h;
        }

        public IntegerArrayList clone() {
            IntegerArrayList ans = new IntegerArrayList();
            ans.addAll(this);
            return ans;
        }

    }

    static class FastFourierTransform {
        private static double[][] realLevels = new double[30][];
        private static double[][] imgLevels = new double[30][];

        private static void prepareLevel(int i) {
            if (realLevels[i] == null) {
                realLevels[i] = new double[1 << i];
                imgLevels[i] = new double[1 << i];
                for (int j = 0, s = 1 << i; j < s; j++) {
                    realLevels[i][j] = Math.cos(Math.PI / s * j);
                    imgLevels[i][j] = Math.sin(Math.PI / s * j);
                }
            }
        }

        public static void dotMul(double[][] a, double[][] b, double[][] c, int m) {
            for (int i = 0, n = 1 << m; i < n; i++) {
                mul(a[0][i], a[1][i], b[0][i], b[1][i], c, i);
            }
        }

        public static void dft(double[][] p, int m) {
            int n = 1 << m;

            int shift = 32 - Integer.numberOfTrailingZeros(n);
            for (int i = 1; i < n; i++) {
                int j = Integer.reverse(i << shift);
                if (i < j) {
                    SequenceUtils.swap(p[0], i, j);
                    SequenceUtils.swap(p[1], i, j);
                }
            }

            double[][] t = new double[2][1];
            for (int d = 0; d < m; d++) {
                int s = 1 << d;
                int s2 = s << 1;
                prepareLevel(d);
                for (int i = 0; i < n; i += s2) {
                    for (int j = 0; j < s; j++) {
                        int a = i + j;
                        int b = a + s;
                        mul(realLevels[d][j], imgLevels[d][j], p[0][b], p[1][b], t, 0);
                        sub(p[0][a], p[1][a], t[0][0], t[1][0], p, b);
                        add(p[0][a], p[1][a], t[0][0], t[1][0], p, a);
                    }
                }
            }
        }

        public static void idft(double[][] p, int m) {
            dft(p, m);

            int n = 1 << m;
            div(p[0][0], p[1][0], n, p, 0);
            div(p[0][n / 2], p[1][n / 2], n, p, n / 2);
            for (int i = 1, until = n / 2; i < until; i++) {
                double a = p[0][n - i];
                double b = p[1][n - i];
                div(p[0][i], p[1][i], n, p, n - i);
                div(a, b, n, p, i);
            }
        }

        public static void add(double r1, double i1, double r2, double i2, double[][] r, int i) {
            r[0][i] = r1 + r2;
            r[1][i] = i1 + i2;
        }

        public static void sub(double r1, double i1, double r2, double i2, double[][] r, int i) {
            r[0][i] = r1 - r2;
            r[1][i] = i1 - i2;
        }

        public static void mul(double r1, double i1, double r2, double i2, double[][] r, int i) {
            r[0][i] = r1 * r2 - i1 * i2;
            r[1][i] = r1 * i2 + i1 * r2;
        }

        public static void div(double r1, double i1, double r2, double[][] r, int i) {
            r[0][i] = r1 / r2;
            r[1][i] = i1 / r2;
        }

    }

    static class Factorization {
        public static IntegerArrayList factorizeNumberPrime(int x) {
            IntegerArrayList ans = new IntegerArrayList();
            for (int i = 2; i * i <= x; i++) {
                if (x % i != 0) {
                    continue;
                }
                ans.add(i);
                while (x % i == 0) {
                    x /= i;
                }
            }
            if (x > 1) {
                ans.add(x);
            }
            return ans;
        }

    }

    static class Power implements InverseNumber {
        final Modular modular;

        public Power(Modular modular) {
            this.modular = modular;
        }

        public int pow(int x, int n) {
            if (n == 0) {
                return modular.valueOf(1);
            }
            long r = pow(x, n >> 1);
            r = modular.valueOf(r * r);
            if ((n & 1) == 1) {
                r = modular.valueOf(r * x);
            }
            return (int) r;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(long c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static class Modular {
        int m;

        public int getMod() {
            return m;
        }

        public Modular(int m) {
            this.m = m;
        }

        public Modular(long m) {
            this.m = (int) m;
            if (this.m != m) {
                throw new IllegalArgumentException();
            }
        }

        public Modular(double m) {
            this.m = (int) m;
            if (this.m != m) {
                throw new IllegalArgumentException();
            }
        }

        public int valueOf(int x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return x;
        }

        public int valueOf(long x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return (int) x;
        }

        public int mul(int x, int y) {
            return valueOf((long) x * y);
        }

        public Modular getModularForPowerComputation() {
            return new Modular(m - 1);
        }

        public String toString() {
            return "mod " + m;
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        public void populate(int[] data) {
            for (int i = 0; i < data.length; i++) {
                data[i] = readInt();
            }
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }

    static class PrimitiveRoot {
        private int[] factors;
        private Modular mod;
        private Power pow;
        int phi;

        public PrimitiveRoot(Modular x) {
            phi = x.getMod() - 1;
            mod = x;
            pow = new Power(mod);
            //factors = rho.findAllFactors(phi).keySet().stream().mapToInt(Integer::intValue).toArray();
            factors = Factorization.factorizeNumberPrime(phi).toArray();
        }

        public PrimitiveRoot(int x) {
            this(new Modular(x));
        }

        public int findMinPrimitiveRoot() {
            if (mod.getMod() == 2) {
                return 1;
            }
            return findMinPrimitiveRoot(2);
        }

        private int findMinPrimitiveRoot(int since) {
            for (int i = since; i < mod.m; i++) {
                boolean flag = true;
                for (int f : factors) {
                    if (pow.pow(i, phi / f) == 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
            return -1;
        }

    }
}

