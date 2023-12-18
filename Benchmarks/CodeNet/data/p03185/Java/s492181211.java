import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] h = sc.longs(n);
        long[] dp = new long[n];
        ConvexHullTrick cht = new ConvexHullTrick(true);
        cht.add(-2 * h[n - 1], h[n - 1] * h[n - 1] + dp[n - 1]);
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cht.query(h[i]) + h[i] * h[i] + c;
            cht.add((int) (-2 * h[i]), h[i] * h[i] + dp[i]);
        }
        out.writeln(dp[0]);
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


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}



class LongOrderedMap<V> {
    private static Random rnd = new Random();
    RBST<V> root;
    public LongOrderedMap() {}
    private LongOrderedMap(RBST<V> root) {this.root = root;}
    public static <V> LongOrderedMap<V> merge(LongOrderedMap<V> l, LongOrderedMap<V> r) {
        return l.mergeRight(r);
    }
    public LongOrderedMap<V> mergeLeft(LongOrderedMap<V> l) {
        return new LongOrderedMap<>(RBST.merge(l.root, root));
    }
    public LongOrderedMap<V> mergeRight(LongOrderedMap<V> r) {
        return new LongOrderedMap<>(RBST.merge(root, r.root));
    }
    public Pair<LongOrderedMap<V>, LongOrderedMap<V>> splitWithIndex(int k) {
        Pair<RBST<V>, RBST<V>> p = RBST.splitWithIndex(root, k);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.fst);
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.snd);
        return new Pair<LongOrderedMap<V>, LongOrderedMap<V>>(fst, snd);
    }
    public Pair<LongOrderedMap<V>, LongOrderedMap<V>> splitWithElement(long key) {
        Pair<RBST<V>, RBST<V>> p = RBST.splitWithElement(root, key);
        LongOrderedMap<V> fst = new LongOrderedMap<>(p.fst);
        LongOrderedMap<V> snd = new LongOrderedMap<>(p.snd);
        return new Pair<LongOrderedMap<V>, LongOrderedMap<V>>(fst, snd);
    }
    public LongEntry<V> kthEntry(int k) {
        if (k < 0 || k >= size()) return null;
        return RBST.kthEntry(root, k);
    }
    public LongEntry<V> firstEntry() {
        return kthEntry(0);
    }
    public LongEntry<V> lastEntry() {
        return kthEntry(size() - 1);
    }
    public LongEntry<V> lowerEntry(long key) {
        return kthEntry(RBST.ltCount(root, key) - 1);
    }
    public LongEntry<V> floorEntry(long key) {
        return kthEntry(RBST.leqCount(root, key) - 1);
    }
    public LongEntry<V> higherEntry(long key) {
        return kthEntry(RBST.leqCount(root, key));
    }
    public LongEntry<V> ceilEntry(long key) {
        return kthEntry(RBST.ltCount(root, key));
    }
    public V get(long key) {
        return RBST.get(root, key);
    }
    public V getOrDefault(long key, V defaultValue) {
        V res = RBST.get(root, key);
        return res != null ? res : defaultValue;
    }
    public void put(long key, V val) {
        if (RBST.contains(root, key)) {
            RBST.getEntry(root, key).setValue(val);
            return;
        }
        root = RBST.insert(root, key, val);
    }
    public void removeKthElement(int k) {
        root = RBST.eraseWithIndex(root, k);
    }
    public void remove(long key) {
        if (!containsKey(key)) return;
        root = RBST.eraseWithElement(root, key);
    }
    public boolean containsKey(long key) {
        return RBST.contains(root, key);
    }
    public int size() {
        return RBST.size(root);
    }
    public void clear() {
        root = null;
    }
    public Optional<V> safeGet(long key) {
        V res = get(key);
        return res != null ? Optional.of(res) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeFirst() {
        return size() > 0 ? Optional.of(kthEntry(0)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeLast() {
        return size() > 0 ? Optional.of(kthEntry(size() - 1)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeLower(long key) {
        int k = RBST.ltCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeFloor(long key) {
        int k = RBST.leqCount(root, key) - 1;
        return k >= 0 ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeHigher(long key) {
        int k = RBST.leqCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    public Optional<LongEntry<V>> safeCeil(long key) {
        int k = RBST.ltCount(root, key);
        return k < size() ? Optional.of(kthEntry(k)) : Optional.empty();
    }
    static final class RBST<V> extends LongEntry<V> {
        private RBST<V> l, r;
        private int size;
        private RBST(long key, V val) {super(key, val); this.size = 1;}
        private RBST<V> update() {
            size = size(l) + size(r) + 1;
            return this;
        }
        static <V> LongEntry<V> getEntry(RBST<V> t, long key) {
            while (t != null) {
                if (t.key == key) return t;
                t = t.key < key ? t.l : t.r;
            }
            return null;
        }
        static <V> V get(RBST<V> t, long key) {
            while (t != null) {
                if (t.key == key) return t.val;
                t = t.key < key ? t.l : t.r;
            }
            return null;
        }
        static <V> LongEntry<V> kthEntry(RBST<V> t, int k) {
            int c = size(t.l);
            if (k < c) return kthEntry(t.l, k);
            if (k == c) return t;
            return kthEntry(t.r, k - c - 1);
        }
        static <V> int leqCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key < t.key) return leqCount(t.l, key);
            return leqCount(t.r, key) + size(t.l) + 1;
        }
        static <V> int ltCount(RBST<V> t, long key) {
            if (t == null) return 0;
            if (key <= t.key) return ltCount(t.l, key);
            return ltCount(t.r, key) + size(t.l) + 1;
        }
        static <V> RBST<V> merge(RBST<V> l, RBST<V> r) {
            if (l == null) return r;
            if (r == null) return l;
            if (rnd.nextInt(l.size + r.size) < l.size) {
                l.r = merge(l.r, r);
                return l.update();
            } else {
                r.l = merge(l, r.l);
                return r.update();
            }
        }
        static <V> Pair<RBST<V>, RBST<V>> splitWithIndex(RBST<V> x, int k) {
            if (k < 0 || k > size(x)) {
                throw new IndexOutOfBoundsException(
                    String.format("index %d is out of bounds for the length of %d", k, size(x))
                );
            }
            if (x == null) {
                return new Pair<RBST<V>, RBST<V>>(null, null);
            } else if (k <= size(x.l)) {
                Pair<RBST<V>, RBST<V>> p = splitWithIndex(x.l, k);
                x.l = p.snd;
                p.snd = x.update();
                return p;
            } else {
                Pair<RBST<V>, RBST<V>> p = splitWithIndex(x.r, k - size(x.l) - 1);
                x.r = p.fst;
                p.fst = x.update();
                return p;
            }
        }
        static <V> Pair<RBST<V>, RBST<V>> splitWithElement(RBST<V> x, long key) {
            if (x == null) {
                return new Pair<RBST<V>, RBST<V>>(null, null);
            } else if (key <= x.key) {
                Pair<RBST<V>, RBST<V>> p = splitWithElement(x.l, key);
                x.l = p.snd;
                p.snd = x.update();
                return p;
            } else {
                Pair<RBST<V>, RBST<V>> p = splitWithElement(x.r, key);
                x.r = p.fst;
                p.fst = x.update();
                return p;
            }
        }
        static <V> RBST<V> insert(RBST<V> t, long key, V val) {
            Pair<RBST<V>, RBST<V>> p = splitWithElement(t, key);
            return RBST.merge(RBST.merge(p.fst, new RBST<>(key, val)), p.snd);
        }
        static <V> RBST<V> eraseWithIndex(RBST<V> t, int k) {
            Pair<RBST<V>, RBST<V>> p = splitWithIndex(t, k);
            Pair<RBST<V>, RBST<V>> q = splitWithIndex(p.snd, 1);
            return RBST.merge(p.fst, q.snd);
        }
        static <V> RBST<V> eraseWithElement(RBST<V> t, long key) {
            Pair<RBST<V>, RBST<V>> p = splitWithElement(t, key);
            Pair<RBST<V>, RBST<V>> q = splitWithIndex(p.snd, 1);
            return RBST.merge(p.fst, q.snd);
        }
        static <V> boolean contains(RBST<V> t, long key) {
            while (t != null) {
                if (t.key == key) return true;
                else if (t.key < key) t = t.r;
                else t = t.l;
            }
            return false;
        }
        static <V> int size(RBST<V> nd) {
            return nd == null ? 0 : nd.size;
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Pair<E0, E1> {
    public E0 fst;
    public E1 snd;
    public Pair(final E0 fst, final E1 snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o)  return true;
        if (!(o instanceof Pair)) return false;
        final Pair p = (Pair) o;
        return this.fst.equals(p.fst) && this.snd.equals(p.snd);
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst.toString() + ", " + this.snd.toString() + ")";}
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

class ConvexHullTrick {
    final boolean MinQuery;
    final LongOrderedMap<Long> Map;

    public ConvexHullTrick(boolean minQuery) {
        this.MinQuery = minQuery;
        this.Map = new LongOrderedMap<>();
    }

    public void add(long a, long b) {
        if (Map.size() == 0) {
            Map.put(a, b);
            return;
        } else if (Map.size() == 1) {
            if (!Map.containsKey(a) || MinQuery ^ Map.get(a) < b) Map.put(a, b);
            return;
        }
        if (Map.containsKey(a) && MinQuery ^ Map.get(a) < b) Map.put(a, b);
        LongEntry<Long> h = Map.higherEntry(a);
        LongEntry<Long> l = Map.lowerEntry(a);
        long al = l == null ? 0 : l.getKey(), bl = l == null ? 0 : l.getValue();
        long am = a, bm = b;
        long ar = h == null ? 0 : h.getKey(), br = h == null ? 0 : h.getValue();
        if (l != null && h != null && noneed(al, bl, am, bm, ar, br)) return;
        Map.put(a, b);
        if (h != null) {
            al = am; bl = bm;
            while (true) {
                LongEntry<Long> m = h;
                am = m.getKey(); bm = m.getValue();
                h = Map.higherEntry(m.getKey());
                if (h == null) break;
                ar = h.getKey(); br = h.getValue();
                if (!noneed(al, bl, am, bm, ar, br)) break;
                Map.remove(am);
            }
        }
        if (l != null) {
            ar = am; br = bm;
            while (true) {
                LongEntry<Long> m = l;
                am = m.getKey(); bm = m.getValue();
                l = Map.lowerEntry(m.getKey());
                if (l == null) break;
                al = l.getKey(); bl = l.getValue();
                if (!noneed(al, bl, am, bm, ar, br)) break;
                Map.remove(am);
            }
        }
    }

    boolean noneed(long al, long bl, long a, long b, long ar, long br) {
        long l = (ar - a) * (bl - b);
        long r = (a - al) * (b - br);
        if (l == r) return true;
        return MinQuery ^ l > r;
    }

    public long query(long x) {
        int l = -1, r = Map.size();
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (m == 0) l = m;
            else {
                LongEntry<Long> em = Map.kthEntry(m);
                LongEntry<Long> el = Map.kthEntry(m - 1);
                long vl = el.getKey() * x + el.getValue();
                long vm = em.getKey() * x + em.getValue();
                if (MinQuery) {
                    if (vl >= vm) l = m;
                    else r = m;
                } else {
                    if (vl <= vm) l = m;
                    else r = m;
                }
            }
        }
        LongEntry<Long> e = Map.kthEntry(l);
        return e.getKey() * x + e.getValue();
    }

    public static void main(String[] args) {
        ConvexHullTrick cht = new ConvexHullTrick(true);
        cht.add(1, 1);
        cht.add(2, -1);
        cht.add(-1, 1);
        System.out.println(cht.Map.size());
        for (int x = -10; x <= 10; x++) {
            long y = cht.query(x);
            System.out.printf("x = %d => %d\n", x, y);
        }
    }
}

class LongEntry<V> {
    long key;
    V val;
    LongEntry(long key, V val) {
        this.key = key;
        this.val = val;
    }
    public long getKey() {return key;}
    public V getValue() {return val;}
    public V setValue(V val) {
        V oldValue = this.val;
        this.val = val;
        return oldValue;
    }
    public boolean equals(Object o) {
        if (!(o instanceof LongEntry)) return false;
        LongEntry<?> e = (LongEntry<?>) o;
        return key == e.getKey() && (val == null ? e.val == null : val.equals(e.val));
    }
    public int hashCode() {
        int keyHash = (int) (key ^ (key >>> 32));
        int valueHash = (val == null ? 0 : val.hashCode());
        return keyHash ^ valueHash;
    }
    public String toString() {return key + "=" + val;}
}
