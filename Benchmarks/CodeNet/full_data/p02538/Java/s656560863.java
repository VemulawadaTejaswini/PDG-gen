import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.util.function.BinaryOperator;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.security.AccessControlException;
import java.io.Writer;
import java.io.InputStream;

/**
 * Built using CHelper reloaded plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner2 in = new LightScanner2(inputStream);
        LightWriter2 out = new LightWriter2(outputStream);
        EReplaceDigits solver = new EReplaceDigits();
        solver.solve(1, in, out);
        out.close();
    }

    static class EReplaceDigits {
        private static final int MOD = 998244353;

        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints(), q = in.ints();
            long[][] cont = new long[10][n + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < 10; j++) {
                    cont[j][i + 1] = (cont[j][i] * 10 + j) % MOD;
                }
            }
            ModMath mod = new ModMath(MOD);
            //System.out.println(mod.inv(9));
            EReplaceDigits.Digits[] init = new EReplaceDigits.Digits[n];
            Arrays.fill(init, new EReplaceDigits.Digits(1));
            LazySegmentTree<EReplaceDigits.Digits, Integer> st = new LazySegmentTree<EReplaceDigits.Digits, Integer>(
                    init,
                    EReplaceDigits.Digits::merge,
                    EReplaceDigits.Digits.NOP,
                    EReplaceDigits.Digits::fill,
                    (u1, u2) -> u2,
                    -1
            );
            for (int i = 0; i < q; i++) {
                int l = in.ints() - 1, r = in.ints(), d = in.ints();
                st.update(l, r, d);
                out.ans(st.total().v).ln();
            }
        }

        private static class Digits {
            private static final EReplaceDigits.Digits NOP = new EReplaceDigits.Digits(0, 1);
            long v;
            long e;

            public Digits(int d) {
                this.v = d;
                this.e = 10;
            }

            Digits(long v, long e) {
                this.v = v;
                this.e = e;
            }

            private EReplaceDigits.Digits fill(int d) {
                return new EReplaceDigits.Digits((e + MOD - 1) * 443664157L % MOD * d % MOD, e);
            }

            private static EReplaceDigits.Digits merge(EReplaceDigits.Digits d1, EReplaceDigits.Digits d2) {
                return new EReplaceDigits.Digits(
                        (d1.v * d2.e + d2.v) % MOD,
                        (d1.e * d2.e) % MOD
                );
            }

        }

    }

    static interface ObjIntFunction<T, R> {
        R apply(T x, int y);

    }

    static class LightWriter2 implements AutoCloseable {
        private static final int BUF_SIZE = 1024 * 1024;
        private static final int BUF_THRESHOLD = 64 * 1024;
        private final OutputStream out;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private final Field fastStringAccess;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter2(OutputStream out) {
            this.out = out;
            Field f;
            try {
                f = String.class.getDeclaredField("value");
                f.setAccessible(true);
                if (f.getType() != byte[].class) f = null;
            } catch (ReflectiveOperationException | AccessControlException ignored) {
                f = null;
            }
            this.fastStringAccess = f;
        }

        public LightWriter2(Writer out) {
            this.out = new LightWriter2.WriterOutputStream(out);
            this.fastStringAccess = null;
        }

        private void allocate(int n) {
            if (ptr + n <= BUF_SIZE) return;
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (BUF_SIZE < n) throw new IllegalArgumentException("Internal buffer exceeded");
        }

        public void close() {
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.flush();
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

        public LightWriter2 print(char c) {
            allocate(1);
            buf[ptr++] = (byte) c;
            breaked = false;
            return this;
        }

        public LightWriter2 print(String s) {
            byte[] bytes;
            if (this.fastStringAccess == null) bytes = s.getBytes();
            else {
                try {
                    bytes = (byte[]) fastStringAccess.get(s);
                } catch (IllegalAccessException ignored) {
                    bytes = s.getBytes();
                }
            }
            int n = bytes.length;
            if (n <= BUF_THRESHOLD) {
                allocate(n);
                System.arraycopy(bytes, 0, buf, ptr, n);
                ptr += n;
                return this;
            }
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.write(bytes);
                out.flush();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        private int print(long l) {
            if (l == 0) {
                print('0');
                return 1;
            } else if (l < 0) {
                print('-');
                l = -l;
            }
            int n = 0;
            long t = l;
            while (t > 0) {
                t /= 10;
                n++;
            }
            allocate(n);
            for (int i = 1; i <= n; i++) {
                buf[ptr + n - i] = (byte) (l % 10 + '0');
                l /= 10;
            }
            ptr += n;
            return n;
        }

        public LightWriter2 ans(long l) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            print(l);
            return this;
        }

        public LightWriter2 ln() {
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

        private static class WriterOutputStream extends OutputStream {
            final Writer writer;
            final CharsetDecoder decoder;

            WriterOutputStream(Writer writer) {
                this.writer = writer;
                this.decoder = StandardCharsets.UTF_8.newDecoder();
            }

            public void write(int b) throws IOException {
                writer.write(b);
            }

            public void write(byte[] b) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b)).array());
            }

            public void write(byte[] b, int off, int len) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b, off, len)).array());
            }

            public void flush() throws IOException {
                writer.flush();
            }

            public void close() throws IOException {
                writer.close();
            }

        }

    }

    static class Reflection {
        public static <T> Class<? extends T> getComponentClass(T[] a) {
            return (Class<? extends T>) a.getClass().getComponentType();
        }

        public static <T> Class<? extends T> getClass(T t) {
            return (Class<? extends T>) t.getClass();
        }

        public static <T> T[] newInstance(Class<T> clazz, int length) {
            return (T[]) Array.newInstance(clazz, length);
        }

    }

    static class LazySegmentTree<T, U> {
        private final int n;
        private final int m;
        private final int log;
        private final BinaryOperator<T> op;
        private final T zero;
        private final BiFunction<T, U, T> up;
        private final BinaryOperator<U> merge;
        private final U nop;
        private final ObjIntFunction<U, U> mul;
        private final T[] tree;
        private final U[] lazy;

        public LazySegmentTree(T[] array, BinaryOperator<T> op, T zero, BiFunction<T, U, T> up, BinaryOperator<U> merge, U nop, ObjIntFunction<U, U> mul) {
            this.n = array.length;
            this.log = n == 1 ? 0 : 32 - Integer.numberOfLeadingZeros(n - 1);
            this.m = 1 << this.log;
            this.op = op;
            this.zero = zero;
            this.up = up;
            this.merge = merge;
            this.nop = nop;
            this.mul = mul;
            this.tree = Reflection.newInstance(Reflection.getComponentClass(array), 2 * m);
            this.lazy = Reflection.newInstance(Reflection.getClass(nop), m);
            Arrays.fill(tree, this.zero);
            Arrays.fill(lazy, this.nop);
            System.arraycopy(array, 0, tree, m, n);
            for (int i = m - 1; i > 0; i--) {
                tree[i] = op.apply(tree[(i << 1)], tree[(i << 1) | 1]);
            }
        }

        public LazySegmentTree(T[] array, BinaryOperator<T> op, T zero, BiFunction<T, U, T> up, BinaryOperator<U> merge, U nop) {
            this(array, op, zero, up, merge, nop, (u, w) -> u);
        }

        private int width(int k) {
            return m >> (31 - Integer.numberOfLeadingZeros(k));
        }

        private void push(int k, int len) {
            if (lazy[k] == nop) return;
            int lk = (k << 1), rk = (k << 1) | 1;
            U widen = mul.apply(lazy[k], len >> 1);
            tree[lk] = up.apply(tree[lk], widen);
            tree[rk] = up.apply(tree[rk], widen);
            if (lk < m) lazy[lk] = merge.apply(lazy[lk], lazy[k]);
            if (rk < m) lazy[rk] = merge.apply(lazy[rk], lazy[k]);
            lazy[k] = nop;
        }

        private void pushTo(int l, int r) {
            for (int i = log; i > 0; i--) {
                int len = 1 << i;
                if (((l >> i) << i) != l) push(l >> i, len);
                if (((r >> i) << i) != r) push(r >> i, len);
            }
        }

        public T total() {
            return tree[1];
        }

        public void update(int l, int r, U v) {
            if (l >= r) return;
            l += m;
            r += m;
            pushTo(l, r);
            for (int lo = l, hi = r; lo < hi; ) {
                if ((lo & 1) == 1) {
                    tree[lo] = up.apply(tree[lo], mul.apply(v, width(lo)));
                    if (lo < m) lazy[lo] = merge.apply(lazy[lo], v);
                    lo++;
                }
                if ((hi & 1) == 1) {
                    hi--;
                    tree[hi] = up.apply(tree[hi], mul.apply(v, width(hi)));
                    if (hi < m) lazy[hi] = merge.apply(lazy[hi], v);
                }
                lo >>= 1;
                hi >>= 1;
            }
            for (int i = 1; i <= log; i++) {
                if (((l >> i) << i) != l) {
                    int lki = l >> i;
                    tree[lki] = op.apply(tree[(lki << 1)], tree[(lki << 1) | 1]);
                }
                if (((r >> i) << i) != r) {
                    int rki = (r - 1) >> i;
                    tree[rki] = op.apply(tree[(rki << 1)], tree[(rki << 1) | 1]);
                }
            }
        }

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 1024 * 1024;
        private final InputStream stream;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private int len;

        public LightScanner2(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (ptr < len) return buf[ptr++];
            try {
                ptr = 0;
                len = stream.read(buf);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (len == -1) return -1;
            return buf[ptr++];
        }

        private void skip() {
            int b;
            while (isTokenSeparator(b = read()) && b != -1) ;
            if (b == -1) throw new NoSuchElementException("EOF");
            ptr--;
        }

        public int ints() {
            long x = longs();
            if (x < Integer.MIN_VALUE || Integer.MAX_VALUE < x) throw new NumberFormatException("Overflow");
            return (int) x;
        }

        public long longs() {
            skip();
            int b = read();
            boolean negate;
            if (b == '-') {
                negate = true;
                b = read();
            } else negate = false;
            long x = 0;
            for (; !isTokenSeparator(b); b = read()) {
                if ('0' <= b && b <= '9') x = x * 10 + b - '0';
                else throw new NumberFormatException("Unexpected character '" + b + "'");
            }
            return negate ? -x : x;
        }

        public void close() {
            try {
                stream.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        private static boolean isTokenSeparator(int b) {
            return b < 33 || 126 < b;
        }

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

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

    }
}

