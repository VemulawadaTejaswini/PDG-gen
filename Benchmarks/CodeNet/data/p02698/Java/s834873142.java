import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static int n;
    public static long[] a;
    public static Tree t;
    public static LongStack[] dp;
    public static int[] ans;
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        n = In.ni();
        a = In.nl(n);
        t = new Tree(n);
        for (int i = 0; i < n - 1; i++) {
            int u = In.ni() - 1;
            int v = In.ni() - 1;
            t.addEdge(u, v);
        }
        dp = new LongStack[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = new LongStack();
            dp[i].add(Const.LINF);
        }
        dp[0].add(0);
        ans = new int[n];
        dfs(0, 1);
        out.append(IntArrays.join(ans, "\n"));
    }

    public static void dfs(int i, int max) {
        int l = 0, r = n + 1;
        long ai = a[i];
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (ai > dp[m].peek()) {
                l = m;
            } else {
                r = m;
            }
        }
        dp[r].add(a[i]);
        ans[i] = Math.max(max, r);
        int pi = t.parent(i);
        for (int v : t.getEdges(i)) {
            if (v != pi) {
                dfs(v, ans[i]);
            }
        }
        dp[r].poll();
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Stack for long type.
 */
final class LongStack implements Iterable<Long> {
    private static final int DEFAULT_SIZE = 64;
    
    private long[] s;
    private int size;
    private int tail = 0;

    public LongStack(final int capacity) {
        this.s = new long[capacity];
        this.size = capacity;
    }

    public LongStack() {
        this(DEFAULT_SIZE);
    }

    public long peek() {
        if (tail == 0) {
            throw new NoSuchElementException("No Elements.");
        }
        return s[tail - 1];
    }

    public void add(final long v) {
        if (tail == size) {
            grow();
        }
        s[tail++] = v;
    }

    public long poll() {
        if (tail == 0) {
            throw new NoSuchElementException("No Elements.");
        }
        return s[--tail];
    }

    public int size() {
        return tail;
    }

    private void grow() {
        final long[] grown = new long[size << 1];
        System.arraycopy(s, 0, grown, 0, tail);
        s = grown;
        size <<= 1;
    }

    public PrimitiveIterator.OfLong iterator() {
        return new LongStackIterator();
    }

    private class LongStackIterator implements PrimitiveIterator.OfLong {
        private int i = tail - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public long nextLong() {
            return s[i--];
        }
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

    public int diameter() {
        final int[] d = dep();
        int maxd = 0;
        int maxv = root;
        for (int i = 0; i < n; i++) {
            if (maxd < d[i]) {
                maxd = d[i];
                maxv = i;
            }
        }
        final IntQueue q = new IntQueue(n);
        q.add(maxv);
        final int[] dd = new int[n];
        Arrays.fill(dd, -1);
        dd[maxv] = 0;
        int max = 0;
        while (q.size() > 0) {
            final int u = q.poll();
            final PrimitiveIterator.OfInt iter = getEdges(u).iterator();
            while (iter.hasNext()) {
                final int v = iter.nextInt();
                if (dd[v] < 0) {
                    dd[v] = dd[u] + 1;
                    q.add(v);
                    max = Math.max(max, dd[v]);
                }
            }
        }
        return max;
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    private Const(){}
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

    public void add(final int v) {
        if (tail == q.length) {
            grow();
        }
        q[tail++] = v;
    }

    public int poll() {
        if (head == tail) {
            throw new NoSuchElementException("No Elements.");
        }
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
