import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.function.LongBinaryOperator;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.function.LongPredicate;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
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
        JSegmentTree solver = new JSegmentTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSegmentTree {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints(), q = in.ints();
            long[] a = in.longs(n);
            IntSegmentTree st = new IntSegmentTree(a, Long::max, -1, (x, u) -> u);
            for (int i = 0; i < q; i++) {
                int t = in.ints();
                if (t == 1) {
                    int x = in.ints() - 1;
                    long v = in.longs();
                    st.update(x, v);
                } else if (t == 2) {
                    int l = in.ints() - 1, r = in.ints();
                    out.ans(st.query(l, r)).ln();
                } else if (t == 3) {
                    int x = in.ints() - 1;
                    long v = in.longs();
                    out.ans(1 + st.maxRight(x, s -> s < v)).ln();
                } else throw new RuntimeException();
            }
        }

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 1024 * 1024;
        private final InputStream stream;
        private final StringBuilder builder = new StringBuilder();
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

        private void loadToken() {
            builder.setLength(0);
            skip();
            for (int b = read(); !isTokenSeparator(b); b = read()) {
                builder.appendCodePoint(b);
            }
        }

        public String string() {
            loadToken();
            return builder.toString();
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

    static class IntSegmentTree {
        private final int n;
        private final int m;
        private final long[] tree;
        private final LongBinaryOperator op;
        private final LongBinaryOperator up;
        private final long zero;

        public IntSegmentTree(long[] array, LongBinaryOperator op, long zero, LongBinaryOperator up) {
            this.n = array.length;
            this.m = n == 1 ? 1 : Integer.highestOneBit(n - 1) << 1;
            this.tree = new long[m + n];
            this.op = op;
            this.up = up;
            this.zero = zero;
            Arrays.fill(tree, zero);
            System.arraycopy(array, 0, this.tree, m, n);
            for (int i = (m + n - 2) >> 1; i > 0; i--) {
                tree[i] = op.applyAsLong(tree[(i << 1)], tree[(i << 1) | 1]);
            }
        }

        public void update(int i, long v) {
            i += m;
            tree[i] = up.applyAsLong(tree[i], v);
            while (i > 0) {
                i >>= 1;
                tree[i] = op.applyAsLong(tree[(i << 1)], tree[(i << 1) | 1]);
            }
        }

        public long query(int l, int r) {
            long left = zero, right = zero;
            l += m;
            r += m;
            while (l < r) {
                if ((l & 1) == 1) {
                    left = op.applyAsLong(left, tree[l++]);
                }
                if ((r & 1) == 1) {
                    right = op.applyAsLong(tree[--r], right);
                }
                l >>= 1;
                r >>= 1;
            }
            return op.applyAsLong(left, right);
        }

        public int maxRight(int l, LongPredicate f) {
            if (!f.test(zero)) {
                throw new IllegalArgumentException("Identity element must satisfy the condition.");
            }
            if (n <= l) return n;
            l += m;
            long sum = zero;
            do {
                l >>= Integer.numberOfTrailingZeros(l);
                if (!f.test(op.applyAsLong(sum, tree[l]))) {
                    while (l < m) {
                        l = l << 1;
                        if (f.test(op.applyAsLong(sum, tree[l]))) {
                            sum = op.applyAsLong(sum, tree[l]);
                            l++;
                        }
                    }
                    return l - m;
                }
                sum = op.applyAsLong(sum, tree[l]);
                l++;
            } while ((l & -l) != l);
            return n;
        }

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

        public LightWriter2 ans(int i) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            print(i);
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

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract String string();

        public long longs() {
            return Long.parseLong(string());
        }

        public final long[] longs(int length) {
            long[] res = new long[length];
            Arrays.setAll(res, ignored -> longs());
            return res;
        }

        public abstract void close();

    }
}

