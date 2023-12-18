import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws Exception {
        BasicScanner sc = new BasicScanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        double[][] xa = new double[n][2];
        double[][] ya = new double[n][2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            xa[i][0] = (double) a[i] / b[i];
            xa[i][1] = (double) c[i] / b[i];
            ya[i][0] = (double) b[i] / a[i];
            ya[i][1] = (double) c[i] / a[i];
        }
        Arrays.sort(xa, (u, v) -> Double.compare(u[0], v[0]));
        Arrays.sort(ya, (u, v) -> Double.compare(u[0], v[0]));

        OrderedMultiSet<Double> set = new OrderedMultiSet<>(Double::compare);

        final int k = n * (n - 1) / 2;
        final int m = (k + 1) / 2;
        final int max = 60;

        double l, r;

        l = -2.1e8; r = 2.1e8;
        for (int lp = 0; lp < max; lp++) {
            double x = (l + r) / 2;
            set.clear();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                double d = xa[i][1] - x * xa[i][0];
                cnt += set.geqCount(d);
                set.insertKey(d);
            }
            if (cnt < m) l = x;
            else r = x;
        }
        double x = l;

        l = -2.1e8; r = 2.1e8;
        for (int lp = 0; lp < max; lp++) {
            double y = (l + r) / 2;
            set.clear();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                double d = ya[i][1] - y * ya[i][0];
                cnt += set.geqCount(d);
                set.insertKey(d);
            }
            if (cnt < m) l = y;
            else r = y;
        }
        double y = l;

        System.out.printf("%.10f %.10f\n",x ,y);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


class RandomizedBinarySearchTree<T> {
    private Random rnd = new Random();
    Node merge(Node l, Node r) {
        if (l == null) return r;
        if (r == null) return l;
        if (rnd.nextInt() % (l.size + r.size) < l.size) {
            l.r = merge(l.r, r);
            return l.update();
        } else {
            r.l = merge(l, r.l);
            return r.update();
        }
    }
    NodePair split(Node x, int k) {
        if (k < 0 || k > size(x)) {
            throw new IndexOutOfBoundsException(
                String.format("index %d is out of bounds for the length of %d", k, size(x))
            );
        }
        if (x == null) return new NodePair(null, null);
        if (k <= size(x.l)) {
            NodePair p = split(x.l, k);
            x.l = p.sc;
            p.sc = x.update();
            return p;
        } else {
            NodePair p = split(x.r, k - size(x.l) - 1);
            x.r = p.fi;
            p.fi = x.update();
            return p;
        }
    }
    Node insert(Node t, int k, T e) {
        NodePair p = split(t, k);
        return merge(merge(p.fi, new Node(e)), p.sc);
    }
    Node erase(Node t, int k) {
        NodePair p = split(t, k);
        return merge(p.fi, split(p.sc, 1).sc);
    }
    int size(Node nd) {return nd == null ? 0 : nd.size;}
    final class Node {
        public T val;
        Node l, r;
        int size;
        private Node(T val) {this.val = val; this.size = 1;}
        private Node update() {
            size = size(l) + size(r) + 1;
            return this;
        }
    }
    final class NodePair {
        public Node fi, sc;
        private NodePair(Node fi, Node sc) {this.fi = fi; this.sc = sc;}
    }
}

final class Random {
    private static final double DOUBLE_UNIT = 0x1.0p-53;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;
    private int w = 88675123;
    public int nextInt() {
        int t = x ^ (x << 11);
        x = y; y = z; z = w;
        return w = (w ^ (w >> 19)) ^ (t ^ (t >> 8));
    }
    public long nextLong() {
        return ((long) (nextInt()) << 32) + nextInt();
    }
    public int nextInt(int bound) {
        return nextInt() % bound;
    }
    public boolean nextBoolean() {
        return (nextInt() & 1) == 0;
    }
    public double nextDouble() {
        return (((long) (next(26)) << 27) + next(27)) * DOUBLE_UNIT;
    }
    private int next(int bits) {
        int mask = bits == 32 ? -1 : (1 << bits) - 1;
        return nextInt() & mask;
    }
}


class OrderedMultiSet<T> extends RandomizedBinarySearchTree<T> {
    Node root;
    Comparator<T> comparator;
    public OrderedMultiSet(Comparator<T> comparator) {
        this.comparator = comparator;
    }
    T kthElement(Node t, int k) {
        int c = size(t.l);
        if (k < c) return kthElement(t.l, k);
        if (k == c) return t.val;
        return kthElement(t.r, k - c - 1);
    }
    public T kthElement(int k) {
        return kthElement(root, k);
    }
    Node insertKey(Node t, T e) {
        return insert(t, leqCount(t, e), e);
    }
    public void insertKey(T e) {
        root = insertKey(root, e);
    }
    Node eraseKey(Node t, T e) {
        if (count(t, e) == 0) return t;
        return super.erase(t, leqCount(t, e) - 1);
    }
    public void eraseKey(T e) {
        root = eraseKey(root, e);
    }
    int count(Node t, T e) {
        return leqCount(t, e) - ltCount(t, e);
    }
    public int count(T e) {
        return count(root, e);
    }
    int leqCount(Node t, T e) {
        if (t == null) return 0;
        if (comparator.compare(e, t.val) < 0) return leqCount(t.l, e);
        return leqCount(t.r, e) + size(t.l) + 1;
    }
    public int leqCount(T e) {
        return leqCount(root, e);
    }
    int ltCount(Node t, T e) {
        if (t == null) return 0;
        if (comparator.compare(e, t.val) <= 0) return ltCount(t.l, e);
        return ltCount(t.r, e) + size(t.l) + 1;
    }
    public int ltCount(T e) {
        return ltCount(root, e);
    }
    public int geqCount(T e) {
        return size() - ltCount(e);
    }
    public int gtCount(T e) {
        return size() - leqCount(e);
    }
    public int size() {
        return size(root);
    }
    public void clear() {
        root = null;
    }
}
