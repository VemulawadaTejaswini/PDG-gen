import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        long[] a = new long[n];
        ArrayList<Integer> incr = new ArrayList<>();
        ArrayList<Integer> decr = new ArrayList<>();
        long now = 0;
        for (int i = 0; i < n; i++) {
            a[i] = fsc.nextLong();
            if (now < a[i]) {
                incr.add(i);
                now = a[i];
            } else {
                decr.add(i);
            }
        }
        int m = incr.size();
        long[] del = new long[m];
        for (int j = 0; j < m; j++) {
            if (j == 0) {
                del[j] = a[incr.get(j)];
            } else {
                del[j] = a[incr.get(j)] - a[incr.get(j - 1)];
            }
        }
        long[] add = new long[m];
        for (int e : decr) {
            long v = a[e];
            int l = 0;
            int r = m;
            while (r - l > 1) {
                int md = l + (r - l) / 2;
                if (v > a[incr.get(md)]) {
                    l = md;
                } else {
                    r = md;
                }
            }
            add[r] += v - a[incr.get(l)];
        }
        long[] b = a.clone();
        ArrayUtil.compress(b);
        for (int i = 0; i < n; i++) {
            b[i]++;
        }
        int[] ge = new int[n];
        BinaryIndexedTree bit = new BinaryIndexedTree(n);
        for (int i = n - 1; i >= 0; i--) {
            bit.add((int) b[i], 1);
            ge[i] = bit.sum() - bit.sum((int) b[i] - 1);
        }
        StringBuilder sb = new StringBuilder();
        int indx = 0;
        for (int i = 0; i < n; i++) {
            if (indx == m || i != incr.get(indx)) {
                sb.append(0).append('\n');
            } else {
                sb.append(del[indx] * ge[incr.get(indx)] + add[indx]).append('\n');
                indx++;
            }
        }
        System.out.print(sb);
    }
}

/**
 * BinaryIndexedTree(n=10): [ 8 ] [ 4 ] [ 2 ] [ 6 ] [ 10 ] [1] [3] [5] [7] [9]
 * 
 * original array: (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
 * 
 * if you want to get the sum of range (l, r], caluculate S(r)-S(l). (S(n) means
 * \sum_{i=1}^n array[i].)
 * 
 * then, you need to be able to calculate S(n) quickly. actually, you can.
 * 
 * 1. binarize n. Ex: n=5(10)=101(2). 2. decompose
 * n=2**p_1+2**p_2+...+2**p_m.(p_1<...<p_m) Ex: n=1+100. 3. acutually,
 * S(n)=\sum_{i=1}^m{tree[\sum_{j=i}^m 2**p_j]} Ex: S(n)=tree[101]+tree[100].
 * 
 * computational complexity of sum-query is O(log n).
 */

class BinaryIndexedTree {
    private int[] tree;
    private int[] originalArray;
    private int n;

    /**
     * @param array 0-indexed array.
     */
    public BinaryIndexedTree(int[] array) {
        this.originalArray = array.clone();
        this.n = array.length;
        this.tree = new int[n + 1];
        initTree();
    }

    public BinaryIndexedTree(int initial, int n) {
        this.originalArray = new int[n];
        this.n = n;
        this.tree = new int[n + 1];
        for (int i = 0; i < n; i++) {
            originalArray[i] = initial;
        }
        initTree();
    }

    public BinaryIndexedTree(int n) {
        this(0, n);
    }

    private void initTree() {
        for (int i = 1; i <= n; i++) {
            tree[i] += originalArray[i - 1];
            int parent = i + (-i & i);
            if (parent <= n) {
                tree[parent] += tree[i];
            }
        }
    }

    /**
     * Calculate the sum of range (l, r] in array (1-indexed).
     * 
     * @param l left border (open)
     * @param r right border (closed)
     * @return sum of range (l, r] in array (1-indexed).
     */
    public int sum(int l, int r) {
        return sum(r) - sum(l);
    }

    public int sum(int r) {
        int ret = 0;
        for (; r > 0; r -= -r & r) {
            ret += tree[r];
        }
        return ret;
    }

    public int sum() {
        return sum(n);
    }

    /**
     * add v to array[i] and update BIT.
     * 
     * @param i index of array (1-indexed)
     * @param v adding value
     */
    public void add(int i, int v) {
        originalArray[i - 1] += v;
        for (; i <= n; i += -i & i) {
            tree[i] += v;
        }
    }

    /**
     * update the value of array[i] to v and update BIT.
     * 
     * @param i index of array (1-indexed)
     * @param v adding value
     */
    public void update(int i, int v) {
        add(i, v - originalArray[i - 1]);
        originalArray[i] = v;
    }

    @Override
    public String toString() {
        int msb = 31 - Integer.numberOfLeadingZeros(n);
        char[][] c = new char[msb + 1][1 << (2 * msb + 1)];
        int[] indx = new int[msb + 1];
        for (int i = 1; i <= n; i++) {
            int j = Integer.numberOfTrailingZeros(-i & i);
            char[] intc = Integer.toString(tree[i]).toCharArray();
            int intl = intc.length;
            c[j][indx[j]] = '[';
            c[j][indx[j] + (1 << (j + 2)) - 1] = ']';
            int st = indx[j] + (1 << (j + 1)) - intl / 2 - 1;
            for (int l = 0; l < intl; l++) {
                c[j][st + l] = intc[l];
            }
            indx[j] += 1 << (j + 3);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = msb; i >= 0; i--) {
            sb.append(String.valueOf(c[i])).append('\n');
        }
        return sb.toString();
    }
}

class FastScanner {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class ArrayUtil {
    public static int[] map(IntUnaryOperator op, int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = op.applyAsInt(a[i]);
        return b;
    }

    /**
     * s[i] is the sum of the range [0, i) in a.
     * 
     * @param a
     * @return cumulative sum array of a.
     */
    public static int[] cumsum(int[] a) {
        int n = a.length;
        int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++)
            s[i] = s[i - 1] + a[i - 1];
        return s;
    }

    public static int[][] cumsum(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] s = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        return s;
    }

    public static void reverse(int[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++)
            swap(a, i, begin + end - i - 1);
    }

    public static void reverse(int[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int[] nextPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] > ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] > ret[i - 1])
                        pass = mid;
                    else
                        fail = mid;
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    public static int[] predPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] < ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] < ret[i - 1])
                        pass = mid;
                    else
                        fail = mid;
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    public static void swap(int[] a, int u, int v) {
        int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static int compare(int[] a, int[] b) {
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

    public static boolean equals(int[] a, int[] b) {
        return compare(a, b) == 0;
    }

    /*
     * IntArray _________________________ LongArray
     */
    public static long[] map(LongUnaryOperator op, long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = op.applyAsLong(a[i]);
        return b;
    }

    /**
     * s[i] is the sum of the range [0, i) in a.
     * 
     * @param a
     * @return cumulative sum array of a.
     */
    public static long[] cumsum(long[] a) {
        int n = a.length;
        long[] s = new long[n + 1];
        for (int i = 1; i <= n; i++)
            s[i] = s[i - 1] + a[i - 1];
        return s;
    }

    public static long[][] cumsum(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] s = new long[n + 1][m + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        return s;
    }

    public static void reverse(long[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++)
            swap(a, i, begin + end - i - 1);
    }

    public static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static void compress(long[] a) {
        int n = a.length;
        long[] sorted = a.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            int l = 0, r = n;
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sorted[m] <= a[i])
                    l = m;
                else
                    r = m;
            }
            a[i] = l;
        }
    }

    public static void swap(long[] a, int u, int v) {
        long tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static int compare(long[] a, long[] b) {
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

    public static boolean equals(long[] a, long[] b) {
        return compare(a, b) == 0;
    }
}
