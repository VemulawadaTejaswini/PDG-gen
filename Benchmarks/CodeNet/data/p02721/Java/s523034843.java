import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.print(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int k = In.ni();
        int c = In.ni();
        char[] s = In.nc();
        int max = 0;
        int idx = 0;
        while (idx < n) {
            if (s[idx] == 'o') {
                max++;
                idx += c + 1;
            } else {
                idx++;
            }
        }
        if (max > k) {
            out.append("\n");
            return;
        }
        int[] dp = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (s[i] == 'x') {
                if (i < n - 1) {
                    dp[i] = dp[i + 1];
                }
            } else {
                if (i + c + 1 >= n) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i + c + 1] + 1;
                }
            }
        }
        int[] p = new int[k + 1];
        Arrays.fill(p, -1);
        for (int i = 0; i < n; i++) {
            if (p[dp[i]] < 0 && s[i] == 'o') {
                p[dp[i]] = i;
            }
        }
        int[] cp = dp.clone();
        for (int i = 0; i < n; i++) {
            if (s[i] == 'x') {
                cp[i] = 0;
            } else if (dp[i] < k) {
                if (i - c - 1 < p[dp[i] + 1]) {
                    cp[i] = 0;
                }
            }
        }
        IntArrayList[] l = new IntArrayList[k + 1];
        for (int i = 0; i <= k; i++) {
            l[i] = new IntArrayList();
        }
        for (int i = 0; i < n; i++) {
            if (s[i] == 'o') {
                l[cp[i]].add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            if (l[i].size() == 1) {
                ans.add(l[i].get(0) + 1);
            }
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            out.append(ans.get(i) + "\n");
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni (int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(int n, int m, IntUnaryOperator f) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(int n, LongUnaryOperator f) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(int n, int m, LongUnaryOperator f) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(int n, int m) {
        char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(int n, DoubleUnaryOperator f) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(int n, int m, DoubleUnaryOperator f) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(int n) {
        String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(int h, int w, char trueCharacter) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
        }
        return grid;
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
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
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
        StringBuilder sb = new StringBuilder();
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
        long nl = nextLong();
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
class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public IntArrayList(int capacity) {
        this.a = new int[Math.max(1, capacity)];
    }

    public IntArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(int v) {
        if (tail == a.length) {
            resize(2);
        }
        a[tail++] = v;
    }

    public int removeLast() {
        return a[tail--];
    }

    public int get(int i) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        return a[i];
    }

    public void set(int i, int v) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        a[i] = v;
    }

    private void resize(double grow) {
        int[] b = new int[(int) Math.ceil(a.length * grow)];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void setTail(int to) {
        if (to > a.length) {
            resize((double) to / a.length);
        }
        this.tail = to;
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
