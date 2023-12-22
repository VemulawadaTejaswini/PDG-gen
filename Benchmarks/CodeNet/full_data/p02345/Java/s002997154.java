import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.function.LongBinaryOperator;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.Vector;
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
        DSL_2_A solver = new DSL_2_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSL_2_A {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
        /*
        IntDynamicSegmentTree st = new IntDynamicSegmentTree(16, Math::min, Integer.MAX_VALUE, (i, u) -> u);
        st.update(8, 0);
        st.update(10, 1);
        System.out.println(st.toString());
        System.out.println("RES = " + st.query(9, 10));
        //*/

            //*
            int n = in.ints(), q = in.ints();
            IntDynamicSegmentTree st = new IntDynamicSegmentTree(n, Math::min, Integer.MAX_VALUE, (i, u) -> u);
            for (int i = 0; i < q; i++) {
                if (in.ints() == 0) {
                    st.update(in.ints(), in.ints());
                } else {
                    out.ans(st.query(in.ints(), in.ints() + 1)).ln();
                }
            }
            //System.out.println(st);
            //*/
            //System.out.println(st);
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

    static class LightScanner implements AutoCloseable {
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

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class IntDynamicSegmentTree {
        private final long lb;
        private final long ub;
        private Node root;
        private final LongBinaryOperator op;
        private final LongBinaryOperator up;
        private final long zero;
        private final Stack<Node> reusableStack = new Stack<>();

        public IntDynamicSegmentTree(long lb, long ub, LongBinaryOperator op, long zero, LongBinaryOperator up) {
            if (lb > ub) throw new IllegalArgumentException();
            this.lb = lb;
            this.ub = ub;
            this.root = new Node(zero);
            this.op = op;
            this.up = up;
            this.zero = zero;
        }

        public IntDynamicSegmentTree(long n, LongBinaryOperator op, long zero, LongBinaryOperator up) {
            this(0, n == 1 ? 1 : Long.highestOneBit(n - 1) << 1, op, zero, up);
        }

        public IntDynamicSegmentTree(LongBinaryOperator op, long zero, LongBinaryOperator up) {
            this(Long.MAX_VALUE, op, zero, up);
        }

        public void update(long i, long x) {
            if (i < lb || ub <= i) throw new IndexOutOfBoundsException();
            Stack<Node> update = reusableStack;
            Node node = root;
            long lo = lb, hi = ub;
            while (hi - lo > 1) {
                update.push(node);
                long mid = (lo + hi) >> 1;
                if (i < mid) {
                    if (node.l == null) node.l = new Node(zero);
                    node = node.l;
                    hi = mid;
                } else {
                    if (node.r == null) node.r = new Node(zero);
                    node = node.r;
                    lo = mid;
                }
            }
            node.v = up.applyAsLong(node.v, x);
            while (!update.isEmpty()) update.pop().recalculate();
        }

        public long query(long l, long r) {
            if (l < lb || ub < r || l > r) throw new IndexOutOfBoundsException();
            Node node = root;
            long lo = lb, hi = ub, mid = (lb + ub) >> 1;
            while (node != null && (r < mid || mid < l)) {
                if (r < mid) {
                    node = node.l;
                    hi = mid;
                    mid = (lo + hi) >> 1;
                } else {
                    node = node.r;
                    lo = mid;
                    mid = (lo + hi) >> 1;
                }
            }
            //System.out.println("Queried on ["+l+", "+r+"), Focused on [" + lo + ", " + mid + ", " + hi + ")");
            if (node == null) return zero;
            if (l == lo && hi == r) return node.v;
            return op.applyAsLong(queryL(l, node.l, lo, mid), queryR(r, node.r, mid, hi));
        }

        private long queryL(long l, Node node, long lo, long hi) {
            if (lo == l) return node == null ? zero : node.v;
            long res = zero;
            while (node != null && l < hi) {
                long mid = (lo + hi) >> 1;
                if (mid < l) {
                    lo = mid;
                    node = node.r;
                } else {
                    if (node.r != null) res = op.applyAsLong(node.r.v, res);
                    node = node.l;
                    hi = mid;
                }
            }
            return res;
        }

        private long queryR(long r, Node node, long lo, long hi) {
            if (r == hi) return node == null ? zero : node.v;
            long res = zero;
            while (node != null && lo < r) {
                long mid = (lo + hi) >> 1;
                if (r < mid) {
                    hi = mid;
                    node = node.l;
                } else {
                    if (node.l != null) res = op.applyAsLong(node.l.v, res);
                    node = node.r;
                    lo = mid;
                }
            }
            return res;
        }

        public String toString() {
            System.out.println("Segment Tree [" + lb + ", " + ub + ")");
            return root.toString(lb, ub);
        }

        private static String indent(String s, String indent) {
            s = s.replace("\n", "\n" + indent);
            return indent + s.substring(0, s.length() - indent.length());
        }

        private class Node {
            Node l;
            Node r;
            long v;

            Node(long v) {
                this.v = v;
            }

            void recalculate() {
                if (l == null && r == null) return;
                if (l == null) this.v = r.v;
                else if (r == null) this.v = l.v;
                else this.v = op.applyAsLong(l.v, r.v);
            }

            public String toString(long lo, long hi) {
                long mid = (lo + hi) >> 1;
                return String.format("Node[%d, %d) = %d\n%s%s", lo, hi, v, indent(l == null ? "*\n" : l.toString(lo, mid), "  "), indent(r == null ? "*\n" : r.toString(mid, hi), "  "));
            }

        }

    }
}


