import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
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
        int m = In.ni();
        int x = In.ni();
        int[] c = new int[n];
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            c[i] = In.ni();
            a[i] = In.ni(m);
        }
        int min = Const.IINF;
        F:
        for (int i = 0; i < 1 << n; i++) {
            int[] u = new int[m];
            int p = 0;
            for (int j = 0; j < n; j++) {
                if (BitUtil.test(i, j)) {
                    for (int k = 0; k < m; k++) {
                        u[k] += a[j][k];
                    }
                    p += c[j];
                }
            }
            for (int k = 0; k < m; k++) {
                if (u[k] < x) {
                    continue F;
                }
            }
            min = Math.min(min, p);
        }
        out.append(min == Const.IINF ? -1 : min);
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
 */
final class BitUtil {
    private static final int[] INT_MASK = {
        0x0000_0000, 
        0x0000_0001, 0x0000_0003, 0x0000_0007, 0x0000_000f, 
        0x0000_001f, 0x0000_003f, 0x0000_007f, 0x0000_00ff, 
        0x0000_01ff, 0x0000_03ff, 0x0000_07ff, 0x0000_0fff,
        0x0000_1fff, 0x0000_3fff, 0x0000_7fff, 0x0000_ffff, 
        0x0001_ffff, 0x0003_ffff, 0x0007_ffff, 0x000f_ffff, 
        0x001f_ffff, 0x003f_ffff, 0x007f_ffff, 0x00ff_ffff, 
        0x01ff_ffff, 0x03ff_ffff, 0x07ff_ffff, 0x0fff_ffff, 
        0x1fff_ffff, 0x3fff_ffff, 0x7fff_ffff, 0xffff_ffff
    };
    private static final long[] LONG_MASK = {
        0x0000_0000_0000_0000l, 
        0x0000_0000_0000_0001l, 0x0000_0000_0000_0003l, 0x0000_0000_0000_0007l, 0x0000_0000_0000_000fl, 
        0x0000_0000_0000_001fl, 0x0000_0000_0000_003fl, 0x0000_0000_0000_007fl, 0x0000_0000_0000_00ffl, 
        0x0000_0000_0000_01ffl, 0x0000_0000_0000_03ffl, 0x0000_0000_0000_07ffl, 0x0000_0000_0000_0fffl,
        0x0000_0000_0000_1fffl, 0x0000_0000_0000_3fffl, 0x0000_0000_0000_7fffl, 0x0000_0000_0000_ffffl, 
        0x0000_0000_0001_ffffl, 0x0000_0000_0003_ffffl, 0x0000_0000_0007_ffffl, 0x0000_0000_000f_ffffl, 
        0x0000_0000_001f_ffffl, 0x0000_0000_003f_ffffl, 0x0000_0000_007f_ffffl, 0x0000_0000_00ff_ffffl, 
        0x0000_0000_01ff_ffffl, 0x0000_0000_03ff_ffffl, 0x0000_0000_07ff_ffffl, 0x0000_0000_0fff_ffffl, 
        0x0000_0000_1fff_ffffl, 0x0000_0000_3fff_ffffl, 0x0000_0000_7fff_ffffl, 0x0000_0000_ffff_ffffl,
        0x0000_0001_ffff_ffffl, 0x0000_0003_ffff_ffffl, 0x0000_0007_ffff_ffffl, 0x0000_000f_ffff_ffffl, 
        0x0000_001f_ffff_ffffl, 0x0000_003f_ffff_ffffl, 0x0000_007f_ffff_ffffl, 0x0000_00ff_ffff_ffffl, 
        0x0000_01ff_ffff_ffffl, 0x0000_03ff_ffff_ffffl, 0x0000_07ff_ffff_ffffl, 0x0000_0fff_ffff_ffffl,
        0x0000_1fff_ffff_ffffl, 0x0000_3fff_ffff_ffffl, 0x0000_7fff_ffff_ffffl, 0x0000_ffff_ffff_ffffl, 
        0x0001_ffff_ffff_ffffl, 0x0003_ffff_ffff_ffffl, 0x0007_ffff_ffff_ffffl, 0x000f_ffff_ffff_ffffl, 
        0x001f_ffff_ffff_ffffl, 0x003f_ffff_ffff_ffffl, 0x007f_ffff_ffff_ffffl, 0x00ff_ffff_ffff_ffffl, 
        0x01ff_ffff_ffff_ffffl, 0x03ff_ffff_ffff_ffffl, 0x07ff_ffff_ffff_ffffl, 0x0fff_ffff_ffff_ffffl, 
        0x1fff_ffff_ffff_ffffl, 0x3fff_ffff_ffff_ffffl, 0x7fff_ffff_ffff_ffffl, 0xffff_ffff_ffff_ffffl
    };

    private BitUtil(){}

    public static boolean test(final long n, final int bit) {
        return (n & (1l << bit)) != 0;
    }

    public static boolean test(final int n, final int bit) {
        return (n & (1 << bit)) != 0;
    }

    public static long set(final long n, final int bit) {
        return n | (1l << bit);
    }

    public static int set(final int n, final int bit) {
        return n | (1 << bit);
    }

    public static long set(final long n, final int from, final int to) {
        return n | (LONG_MASK[to - from] << from);
    }

    public static int set(final int n, final int from, final int to) {
        return n | (INT_MASK[to - from] << from);
    }

    public static long set(final long n, final int bit, final boolean b) {
        return b ? n | (1l << bit) : n & ~(1l << bit);
    }

    public static int set(final int n, final int bit, final boolean b) {
        return b ? n | (1 << bit) : n & ~(1 << bit);
    }

    public static long set(final long n, final int from, final int to, final boolean b) {
        return b ? n | (LONG_MASK[to - from] << from) : n & ~(LONG_MASK[to - from] << from);
    }

    public static int set(final int n, final int from, final int to, final boolean b) {
        return b ? n | (INT_MASK[to - from] << from) : n & ~(INT_MASK[to - from] << from);
    }

    public static long clear(final long n, final int bit) {
        return n & ~(1l << bit);
    }

    public static int clear(final int n, final int bit) {
        return n & ~(1 << bit);
    }

    public static long clear(final long n, final int from, final int to) {
        return n & ~(LONG_MASK[to - from] << from);
    }

    public static int clear(final int n, final int from, final int to) {
        return n & ~(INT_MASK[to - from] << from);
    }

    public static long mask(final long n, final int bit) {
        return n & (1l << bit);
    }

    public static int mask(final int n, final int bit) {
        return n & (1 << bit);
    }

    public static long mask(final long n, final int from, final int to) {
        return n & (LONG_MASK[to - from] << from);
    }

    public static int mask(final int n, final int from, final int to) {
        return n & (INT_MASK[to - from] << from);
    }

    public static int get(final long n, final int bit) {
        return (n & (1l << bit)) == 0 ? 1 : 0;
    }

    public static int get(final int n, final int bit) {
        return (n & (1 << bit)) == 0 ? 1 : 0;
    }

    public static long flip(final long n, final int bit) {
        return n ^ (1l << bit);
    }

    public static int flip(final int n, final int bit) {
        return n ^ (1 << bit);
    }

    public static long flip(final long n, final int from, final int to) {
        return n ^ (LONG_MASK[to - from] << from);
    }

    public static int flip(final int n, final int from, final int to) {
        return n ^ (INT_MASK[to - from] << from);
    }

    public static ArrayList<Integer> ones(final long n) {
        final ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < Long.SIZE; i++) {
            if (test(n, i)) {
                set.add(i);
            }
        }
        return set;
    }

    public static ArrayList<Integer> ones(final int n) {
        final ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < Integer.SIZE; i++) {
            if (test(n, i)) {
                set.add(i);
            }
        }
        return set;
    }

    public static int msbPlace(final long n) {
        return Long.SIZE - Long.numberOfLeadingZeros(n) - 1;
    }

    public static int msbPlace(final int n) {
        return Integer.SIZE - Integer.numberOfLeadingZeros(n) - 1;
    }

    public static int lsbPlace(final long n) {
        return Long.numberOfTrailingZeros(n);
    }

    public static int lsbPlace(final int n) {
        return Integer.numberOfTrailingZeros(n);
    }
}
