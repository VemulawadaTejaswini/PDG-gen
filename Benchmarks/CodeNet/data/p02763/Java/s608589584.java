import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.function.LongBinaryOperator;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
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
        ESimpleStringQueries solver = new ESimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESimpleStringQueries {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long[] s = in.string().chars().mapToLong(c -> 1L << (c - 'a')).toArray();
            IntSegmentTree st = new IntSegmentTree(s, (x, y) -> x | y, 0, (x, u) -> 1L << (u - 'a'));
            int q = in.ints();
            for (int i = 0; i < q; i++) {
                if (in.ints() == 1) {
                    st.update(in.ints() - 1, in.string().charAt(0));
                } else {
                    out.ans(BitMath.count(st.query(in.ints() - 1, in.ints()))).ln();
                }
            }
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
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

    static class IntSegmentTree {
        private final int n;
        private final int m;
        private final long[] tree;
        private final LongBinaryOperator op;
        private final LongBinaryOperator up;
        private final long zero;

        public IntSegmentTree(long[] array, LongBinaryOperator op, long zero, LongBinaryOperator up) {
            this.n = array.length;
            int msb = BitMath.extractMsb(n);
            this.m = n == msb ? msb : (msb << 1);
            this.tree = new long[m * 2 - 1];
            this.op = op;
            this.up = up;
            this.zero = zero;
            Arrays.fill(tree, zero);
            System.arraycopy(array, 0, this.tree, m - 1, array.length);
            for (int i = m - 2; i >= 0; i--) {
                tree[i] = op.applyAsLong(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        public void update(int i, long v) {
            i += m - 1;
            tree[i] = up.applyAsLong(tree[i], v);
            while (i > 0) {
                i = (i - 1) / 2;
                tree[i] = op.applyAsLong(tree[2 * i + 1], tree[2 * i + 2]);
            }
        }

        public long query(int l, int r) {
            long left = zero, right = zero;
            l += m - 1;
            r += m - 1;
            while (l < r) {
                if ((l & 1) == 0) {
                    left = op.applyAsLong(left, tree[l]);
                }
                if ((r & 1) == 0) {
                    right = op.applyAsLong(tree[r - 1], right);
                }
                l = l / 2;
                r = (r - 1) / 2;
            }
            return op.applyAsLong(left, right);
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

        public static int count(long v) {
            return Long.bitCount(v);
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
}

