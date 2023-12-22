import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.function.Function;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BinaryOperator;
import java.io.UncheckedIOException;
import java.io.Writer;
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
        BITVerify solver = new BITVerify();
        solver.solve(1, in, out);
        out.close();
    }

    static class BITVerify {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), q = in.ints();
            AbelianFenwickTree<Long> bit = new AbelianFenwickTree<>(n, (x, y) -> x + y, 0L, x -> -x);
            for (int unused = 0; unused < q; unused++) {
                switch (in.ints()) {
                    case 0: {
                        int i = in.ints() - 1;
                        long v = in.ints();
                        //System.out.println("CAL");
                        bit.add(i, v);
                        break;
                    }
                    case 1: {
                        int l = in.ints() - 1, r = in.ints();
                        out.ansln(bit.query(l, r));
                        break;
                    }
                }
            }
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int extractLsb(int v) {
            return v & (-v);
        }

    }

    static class AbelianFenwickTree<T> extends FenwickTree<T> {
        private UnaryOperator<T> rev;

        public AbelianFenwickTree(int n, BinaryOperator<T> op, T zero, UnaryOperator<T> rev) {
            super(n, op, zero);
            this.rev = rev;
        }

        public T query(int first, int last) {
            if (first == 0) {
                return query(last);
            } else {
                return op.apply(query(last), rev.apply(query(first)));
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

        public LightWriter ansln(long... n) {
            for (long n1 : n) {
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

    static class Reflection {
        @SuppressWarnings("unchecked")
        public static <T> Class<? extends T> getClass(T t) {
            return (Class<? extends T>) t.getClass();
        }

        @SuppressWarnings("unchecked")
        public static <T> T[] newInstance(Class<T> clazz, int length) {
            return (T[]) Array.newInstance(clazz, length);
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

    static class FenwickTree<T> {
        protected final int n;
        private final T[] tree;
        protected final BinaryOperator<T> op;
        protected final T zero;

        public FenwickTree(int n, BinaryOperator<T> op, T zero) {
            this.n = n;
            tree = Reflection.newInstance(Reflection.getClass(zero), n + 1);
            Arrays.fill(tree, zero);
            this.op = op;
            this.zero = zero;
        }

        public void add(int index, T value) {
            for (index++; index <= n; index += BitMath.extractLsb(index)) {
                tree[index] = op.apply(tree[index], value);
            }
        }

        public T query(int last) {
            T res = zero;
            for (; last > 0; last -= BitMath.extractLsb(last)) {
                res = op.apply(res, tree[last]);
            }
            return res;
        }

    }
}


