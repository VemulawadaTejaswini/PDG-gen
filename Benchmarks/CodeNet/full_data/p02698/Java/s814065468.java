import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        long[] a = In.nl(n);
        int[] cmp = new Compress(a, false).compress;
        Tree t = new Tree(n);
        for (int i = 1; i < n; i++) {
            int u = In.ni() - 1;
            int v = In.ni() - 1;
            t.addEdge(u, v);
        }
        PersistentIntSegmentTree seg = new PersistentIntSegmentTree(n, new IntMonoid(Math::max, 0));
        PersistentIntSegmentTree.Node rt = seg.getRoot();
        ArrayDeque<PersistentIntSegmentTree.Node> dq = new ArrayDeque<>();
        IntStack st = new IntStack(n);
        st.add(-1, 0);
        dq.add(rt);
        int[] ans = new int[n];
        while (st.size() > 0) {
            int u = st.poll();
            if (u >= 0) {
                int lis = seg.query(0, cmp[u], dq.getLast()) + 1;
                ans[u] = lis;
                dq.addLast(seg.update(cmp[u], lis, dq.getLast()));
                for (int v : t.getEdges(u)) {
                    if (v == t.parent(u)) {
                        continue;
                    }
                    st.add(~v, v);
                }
            } else {
                dq.pollLast();
            }
        }
        System.out.println(IntArrays.join(ans, "\n"));
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns long array.
 */
final class LongArrayGenerator {

    private LongArrayGenerator(){}
    
    public static long[] filled(final int n, final long init) {
        final long[] ret = new long[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static long[][] filled(final int n, final int m, final long init) {
        final long[][] ret = new long[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static long[] generate(final int n, final LongSupplier f) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> f.getAsLong());
        return a;
    }

    public static long[][] generate(final int n, final int m, final LongSupplier f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = generate(m, f);
        }
        return a;
    }

    public static long[] indexToLong(final int n, final IntToLongFunction f) {
        final long[] a = new long[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static long[][] indexToLong(final int n, final int m, final IntToLongBiFunction f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = indexToLong(m, f.curry(i));
        }
        return a;
    }

    public static long[] toArray(final Collection<? extends Number> collection) {
        final int n = collection.size();
        final long[] ret = new long[n];
        final Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).longValue();
        }
        return ret;
    }

    public static long[] unique(final long[] a) {
        final HashSet<Long> set = new HashSet<>();
        for (final long e : a) {
            set.add(e);
        }
        final int m = set.size();
        final long[] b = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }

    public static long[][] transpose(final long[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static long[] map(final long[] a, final LongUnaryOperator f) {
        final long[] b = new long[a.length];
        Arrays.setAll(b, i -> f.applyAsLong(a[i]));
        return b;
    }

    public static long[] filter(final long[] a, final LongPredicate p) {
        final LongArrayList ret = new LongArrayList();
        for (final long e : a) {
            ret.addIf(e, p);
        }
        return ret.toArray();
    }

    public static long[] accumulateFromHead(final long[] a, final LongBinaryOperator op, final long e) {
        final int n = a.length;
        final long[] ret = new long[n + 1];
        ret[0] = e;
        for (int i = 0; i < n; i++) {
            ret[i + 1] = op.applyAsLong(ret[i], a[i]);
        }
        return ret;
    }

    public static long[] accumulateFromTail(final long[] a, final LongBinaryOperator op, final long e) {
        final int n = a.length;
        final long[] ret = new long[n + 1];
        ret[n] = e;
        for (int i = n - 1; i >= 0; i--) {
            ret[i] = op.applyAsLong(ret[i + 1], a[i]);
        }
        return ret;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for long arrays.
 * 2. methods that receives arrays and return some results (except for long arrays).
 */
final class LongArrays {

    private LongArrays(){}

    public static void swap(final long[] a, final int u, final int v) {
        final long tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(final long[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(final long[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(final long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static long reduce(final long[] a, final LongBinaryOperator op) {
        long ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsLong(ret, a[i]);
        }
        return ret;
    }

    public static void map(final long[] a, final LongUnaryOperator op) {
        Arrays.setAll(a, i -> op.applyAsLong(a[i]));
    }

    public static void filter(final long[] src, final long[] dst, final LongPredicate p) {
        int idx = 0;
        for (final long e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(final long[] dst, final int beginIndex, final int endIndex, final LongPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(final long dst[], final int endIndex, final LongPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(final long[] a, final LongBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsLong(a[i - 1], a[i]);
        }
    }

    public static void accumulate(final long[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(long[] a) {
        final HashSet<Long> set = new HashSet<>();
        for (final long e : a) {
            set.add(e);
        }
        final int m = set.size();
        final long[] b = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        a = b;
        return m;
    }

    public static void permute(long[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
    }

    public static void transpose(long[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(final long[] a, final long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(final long[] a, final long[] b) {
        return compare(a, b) == 0;
    }

    public static String join(final long[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(final long[] a, final IntFunction<String> idxToPre,
            final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}



class IntMonoid extends IntMagma implements IntUnital {
    public final int e;
    
    public IntMonoid(final IntBinaryOperator operator, final int e) {
        super(operator, TypicalPropertySets.MONOID);
        this.e = e;
    }

    @Override
    public int identityElement() {
        return e;
    }

    public static <M extends IntMagma & IntUnital> IntMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.MONOID);
        return new IntMonoid(m.operator, m.identityElement());
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
@FunctionalInterface
interface IntToLongBiFunction {
    public long apply(int x, int y);

    public default IntToLongFunction curry(final int x) {
        return y -> apply(x, y);
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public IntArrayList(final int capacity) {
        this.a = new int[Math.max(1, capacity)];
    }

    public IntArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(final int v) {
        if (tail == a.length) {
            resize(2);
        }
        a[tail++] = v;
    }

    public int removeLast() {
        return a[tail--];
    }

    public int get(final int i) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        return a[i];
    }

    public void set(final int i, final int v) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        a[i] = v;
    }

    private void resize(final double grow) {
        final int[] b = new int[(int) Math.ceil(a.length * grow)];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void reverse(final int begin, final int end) {
        IntArrays.reverse(a, begin, end);
    }

    public void reverse() {
        IntArrays.reverse(a, 0, tail);
    }

    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(final int v, final IntPredicate p) {
        if (p.test(v)) {
            add(v);
            return true;
        }
        return false;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntArrayListIterator();
    }

    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;

        public boolean hasNext() {
            return i < tail;
        }

        public int nextInt() {
            return a[i++];
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Queue for int type.
 */
final class IntQueue implements Iterable<Integer> {
    private static final int DEFAULT_SIZE = 64;

    private int[] q;
    private int head = 0;
    private int tail = 0;

    public IntQueue(final int capacity) {
        this.q = new int[capacity];
    }

    public IntQueue() {
        this(DEFAULT_SIZE);
    }

    public int peek() {
        if (head == tail) throw new NoSuchElementException("No Elements.");
        return q[head];
    }

    public int getFromHead(int index) {
        if (head + index >= tail || index < 0) throw new NoSuchElementException("Index out of bounds.");
        return q[head + index];
    }

    public int getFromTail(int index) {
        if (head + index >= tail || index < 0) throw new NoSuchElementException("Index out of bounds.");
        return q[tail - 1 - index];
    }

    public void add(final int v) {
        if (tail == q.length) grow();
        q[tail++] = v;
    }

    public void add(final int... vals) {
        for (int v : vals) add(v);
    }

    public int poll() {
        if (head == tail) throw new NoSuchElementException("No Elements.");
        return q[head++];
    }

    public int size() {
        return tail - head;
    }

    private void grow() {
        final int[] grown = new int[q.length << 1];
        final int len = size();
        System.arraycopy(q, head, grown, 0, len);
        q = grown;
        tail = len;
        head = 0;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntQueueIterator();
    }

    private class IntQueueIterator implements PrimitiveIterator.OfInt {
        private int i = head;

        public boolean hasNext() {
            return i < tail;
        }

        public int nextInt() {
            return q[i++];
        }
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class LongArrayList implements Iterable<Long> {
    private long[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public LongArrayList(final int capacity) {
        this.a = new long[Math.max(1, capacity)];
    }

    public LongArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(final long v) {
        if (tail == a.length) {
            resize();
        }
        a[tail++] = v;
    }

    public long removeLast() {
        return a[tail--];
    }

    public long get(final int i) {
        if (i >= a.length) {
            System.err
                    .println("Error in LongArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + a.length);
        }
        return a[i];
    }

    public void set(final int i, final long v) {
        if (i >= a.length) {
            System.err
                    .println("Error in LongArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + a.length);
        }
        a[i] = v;
    }

    private void resize() {
        final long[] b = new long[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void reverse(final int begin, final int end) {
        LongArrays.reverse(a, begin, end);
    }

    public void reverse() {
        LongArrays.reverse(a, 0, tail);
    }

    public long[] toArray() {
        final long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(final long v, final LongPredicate p) {
        if (p.test(v)) {
            add(v);
            return true;
        }
        return false;
    }

    public PrimitiveIterator.OfLong iterator() {
        return new LongArrayListIterator();
    }

    private class LongArrayListIterator implements PrimitiveIterator.OfLong {
        private int i = 0;
        
        public boolean hasNext() {
            return i < tail;
        }

        public long nextLong() {
            return a[i++];
        }
    }
}



abstract class IntMagma extends PropertyHolder {
    protected final IntBinaryOperator operator;

    public IntMagma(final IntBinaryOperator operator, final EnumSet<Property> properties) {
        super(properties);
        this.operator = operator;
    }

    public IntMagma(final IntBinaryOperator operator, final TypicalPropertySets properties) {
        super(properties);
        this.operator = operator;
    }

    public final int apply(final int left, final int right) {
        return operator.applyAsInt(left, right);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(final IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(final LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(final int n, final int m) {
        final char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(final DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(final int n, final DoubleUnaryOperator f) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(final int n, final int m, final DoubleUnaryOperator f) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (final IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(final int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        final long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
final class IntArrays {

    private IntArrays(){}

    public static void swap(final int[] a, final int u, final int v) {
        final int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(final int[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(final int[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(final int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int reduce(final int[] a, final IntBinaryOperator op) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsInt(ret, a[i]);
        }
        return ret;
    }

    public static void map(final int[] a, final IntUnaryOperator op) {
        Arrays.setAll(a, i -> op.applyAsInt(a[i]));
    }

    public static void filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i - 1], a[i]);
        }
    }

    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(int[] a) {
        final HashSet<Integer> set = new HashSet<>();
        for (final int e : a) {
            set.add(e);
        }
        final int m = set.size();
        final int[] b = new int[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        a = b;
        return m;
    }

    public static void permute(int[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
    }

    public static void transpose(int[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(final int[] a, final int[] b) {
        return compare(a, b) == 0;
    }

    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre,
            final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}



class PersistentIntSegmentTree {
    private final int n;
    private final Node root;
    private final IntBinaryOperator op;
    private final int e;

    public PersistentIntSegmentTree(int[] a, IntMonoid monoid) {
        this.n = a.length;
        this.op = monoid::apply;
        this.e = monoid.e;
        this.root = build(a, 0, n);
    }

    public PersistentIntSegmentTree(int n, IntMonoid monoid) {
        this.n = n;
        this.op = monoid::apply;
        this.e = monoid.e;
        this.root = buildConstant(0, n);
    }

    public Node getRoot() {
        return root;
    }

    private Node merge(Node l, Node r) {
        return new Node(l, r, op.applyAsInt(l.v, r.v));
    }

    private Node build(int[] a, int l, int r) {
        return r - l == 1 ? new Node(a[l]) : merge(build(a, l, (l + r) >> 1), build(a, (l + r) >> 1, r));
    }

    private Node buildConstant(int l, int r) {
        return r - l == 1 ? new Node(e) : new Node(buildConstant(l, (l + r) >> 1), buildConstant((l + r) >> 1, r), e);
    }

    public Node update(final int i, final int v, final Node nd) {
        return apply(i, x -> v, nd);
    }

    public Node apply(final int i, final IntUnaryOperator f, final Node nd) {
        return apply(i, f, nd, 0, n);
    }

    private Node apply(final int i, final IntUnaryOperator f, final Node nd, final int l, final int r) {
        if (l < i + 1 && i < r) {
            if (i <= l && r <= i + 1) {
                return new Node(f.applyAsInt(nd.v));
            } else {
                return merge(apply(i, f, nd.l, l, (l + r) >> 1), apply(i, f, nd.r, (l + r) >> 1, r));
            }
        } else {
            return nd;
        }
    }

    public int query(final int l, final int r, final Node rt) {
        return query(l, r, rt, 0, n);
    }

    private int query(final int ql, final int qr, final Node nd, final int tl, final int tr) {
        if (ql < tr && tl < qr) {
            if (ql <= tl && tr <= qr) {
                return nd.v;
            } else {
                final int lv = query(ql, qr, nd.l, tl, (tl + tr) >> 1);
                final int rv = query(ql, qr, nd.r, (tl + tr) >> 1, tr);
                return op.applyAsInt(lv, rv);
            }
        } else {
            return e;
        }
    }
    
    public static final class Node {
        private final Node l, r;
        private final int v;
        private Node(int v){this.l = null; this.r = null; this.v = v;}
        private Node(Node l, Node r, int v) {this.l = l; this.r = r; this.v = v;}
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Stack for int type.
 */
final class IntStack implements Iterable<Integer> {
    private static final int DEFAULT_SIZE = 64;
    
    private int[] s;
    private int tail = 0;

    public IntStack(final int capacity) {
        this.s = new int[capacity];
    }

    public IntStack() {
        this(DEFAULT_SIZE);
    }

    public int peek() {
        if (tail == 0) throw new NoSuchElementException("No Elements.");
        return s[tail - 1];
    }

    public int getFromHead(int index) {
        if (index >= tail || index < 0) throw new NoSuchElementException("index out of Bounds.");
        return s[index];
    }

    public int getFromTail(int index) {
        if (index >= tail || index < 0) throw new NoSuchElementException("index out of Bounds.");
        return s[tail - 1 - index];
    }

    public void add(final int v) {
        if (tail == s.length) grow();
        s[tail++] = v;
    }

    public void add(final int... vals) {
        for (int v : vals) add(v);
    }

    public int poll() {
        if (tail == 0) throw new NoSuchElementException("No Elements.");
        return s[--tail];
    }

    public int size() {
        return tail;
    }

    private void grow() {
        final int[] grown = new int[s.length << 1];
        System.arraycopy(s, 0, grown, 0, tail);
        s = grown;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntStackIterator();
    }

    private class IntStackIterator implements PrimitiveIterator.OfInt {
        private int i = tail - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public int nextInt() {
            return s[i--];
        }
    }
}

enum Property {
    ANNIHILATED_BY_ZERO,
    ASSOCIATIVE,
    CANCELLATIVE,
    COMMUTATIVE,
    DISTRIBUTIVE,
    IDEMPOTENT;
}


enum TypicalPropertySets {
    ABELIAN_GROUP(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.CANCELLATIVE,
        Property.COMMUTATIVE
    )),
    BOUNDED_SEMI_LATTICE(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.COMMUTATIVE,
        Property.IDEMPOTENT
    )),
    COMMUTATIVE_MONOID(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.COMMUTATIVE
    )),
    GROUP(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.CANCELLATIVE
    )),
    MONOID(EnumSet.of(
        Property.ASSOCIATIVE
    )),
    SEMI_GROUP(EnumSet.of(
        Property.ASSOCIATIVE
    )),
    SEMI_LATTICE(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.IDEMPOTENT,
        Property.COMMUTATIVE
    )),
    SEMI_RING(EnumSet.of(
        Property.DISTRIBUTIVE,
        Property.ANNIHILATED_BY_ZERO
    )),
    RING(EnumSet.of(
        Property.DISTRIBUTIVE,
        Property.ANNIHILATED_BY_ZERO
    ));

    private final EnumSet<Property> properties;

    private TypicalPropertySets(EnumSet<Property> properties) {
        this.properties = properties;
    }

    public final EnumSet<Property> getProperties() {
        return properties.clone();
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class Tree {
    public final int n;
    public final int root;

    private final IntArrayList[] adj;
    private final int[] par;
    private final int[] dep;

    protected boolean bfs = false;

    public Tree(final int n, final int root) {
        this.n = n;
        this.root = root;
        this.adj = new IntArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new IntArrayList();
        }
        this.par = new int[n];
        this.dep = new int[n];
    }

    public Tree(final int n) {
        this(n, 0);
    }

    public void addEdge(final int from, final int to) {
        adj[from].add(to);
        adj[to].add(from);
    }

    public int getEdge(final int from, final int index) {
        return adj[from].get(index);
    }

    public IntArrayList getEdges(final int i) {
        return adj[i];
    }

    public int out(final int i) {
        return adj[i].size();
    }

    public int parent(final int i) {
        return parent()[i];
    }

    public int[] parent() {
        if (!bfs) {
            bfs();
            bfs = true;
        }
        return par;
    }

    public int dep(final int i) {
        return dep()[i];
    }

    public int[] dep() {
        if (!bfs) {
            bfs();
            bfs = true;
        }
        return dep;
    }

    private void bfs() {
        final IntQueue que = new IntQueue(n);
        que.add(root);
        par[root] = root;
        while (que.size() > 0) {
            final int v = que.poll();
            final PrimitiveIterator.OfInt iter = getEdges(v).iterator();
            while (iter.hasNext()) {
                final int u = iter.nextInt();
                if (u != par[v]) {
                    dep[u] = dep[v] + 1;
                    par[u] = v;
                    que.add(u);
                }
            }
        }
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class Compress {
    public int n;
    public int[] compress;
    public long[] sorted;
    public boolean oneIndexed;

    public Compress(final long[] a, final boolean oneIndexed) {
        this.n = a.length;
        this.compress = new int[n];
        this.oneIndexed = oneIndexed;
        build(a);
    }

    private void build(final long[] a) {
        this.sorted = LongArrayGenerator.unique(a);
        Arrays.sort(this.sorted);
        final int size = this.sorted.length;
        for (int i = 0; i < n; i++) {
            int l = 0, r = size;
            while (r - l > 1) {
                final int m = l + (r - l) / 2;
                if (this.sorted[m] <= a[i]) {
                    l = m;
                } else {
                    r = m;
                }
            }
            this.compress[i] = this.oneIndexed ? l + 1 : l;
        }
    }
}

interface IntUnital {
    public int identityElement();
}


abstract class PropertyHolder {
    private final EnumSet<Property> properties;

    public PropertyHolder(final EnumSet<Property> properties) {
        this.properties = properties;
    }

    public PropertyHolder(final TypicalPropertySets typicalSet) {
        this(typicalSet.getProperties());
    }

    public final EnumSet<Property> getProperties() {
        return properties;
    }

    public final void addProperties(final Property... props) {
        for (Property prop : props) {
            properties.add(prop);
        }
    }

    public final void addProperties(final EnumSet<Property> props) {
        for (Property prop : props) {
            properties.add(prop);
        }
    }

    public final void addProperties(final TypicalPropertySets props) {
        addProperties(props.getProperties());
    }

    public final boolean hasProperties(final Property... props) {
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasProperties(final EnumSet<Property> props) {
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasProperties(final TypicalPropertySets props) {
        return hasProperties(props.getProperties());
    }

    public final void requireProperties(final EnumSet<Property> props, final Property... ps) {
        final ArrayList<Property> unmet = new ArrayList<>();
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                unmet.add(prop);
            }
        }
        for (final Property prop : ps) {
            if (!properties.contains(prop)) {
                unmet.add(prop);
            }
        }
        if (unmet.size() > 0) {
            throw new UnsatisfiedRequiredPropertiesException(unmet);
        }
    }

    public final void requireProperties(final TypicalPropertySets props, final Property... ps) {
        requireProperties(props.getProperties(), ps);
    }

    private static final class UnsatisfiedRequiredPropertiesException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        private UnsatisfiedRequiredPropertiesException(final Collection<Property> props) {
            for (final Property prop : props) {
                System.err.println(prop.name() + "should be satisfied.");
            }
        }
    }
}
