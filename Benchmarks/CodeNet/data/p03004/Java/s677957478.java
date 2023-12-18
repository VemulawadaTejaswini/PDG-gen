import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static long xr, xl, yu, yd, xll, xlr, xrl, xrr, ydd, ydu, yud, yuu;
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
        xr = xrl = xrr = yu = yud = yuu = -Const.IINF;
        xl = xll = xlr = yd = ydd = ydu = Const.IINF;

        for (int i = 0; i < n; i++) {
            long x = In.nl();
            long y = In.nl();
            char d = In.nc()[0];
            if (d == 'R' || d == 'L') {
                if (d == 'R') {
                    xrr = Math.max(xrr, x);
                    xlr = Math.min(xlr, x);
                } else {
                    xrl = Math.max(xrl, x);
                    xll = Math.min(xll, x);
                }
                yu = Math.max(yu, y);
                yd = Math.min(yd, y);
            } else {
                if (d == 'U') {
                    yuu = Math.max(yuu, y);
                    ydu = Math.min(ydu, y);
                } else {
                    yud = Math.max(yud, y);
                    ydd = Math.min(ydd, y);
                }
                xr = Math.max(xr, x);
                xl = Math.min(xl, x);
            }
        }

        double trx = Doubles.max(0., xr - xrr, (xrl - xrr) / 2.);
        double tlx = Doubles.max(0., xl - xlr, (xll - xlr) / 2.);
        double tuy = Doubles.max(0., yu - yuu, (yud - yuu) / 2.);
        double tdy = Doubles.max(0., yd - ydu, (ydd - ydu) / 2.);

        double tx = Doubles.min(trx, tlx);
        double ty = Doubles.min(tuy, tdy);
        double tl = Doubles.min(tx, ty);
        double tr = Doubles.max(tx, ty);
        
        double min = Doubles.min(ts(0, tl), f(tl), f(tr), ts(tr, 1e9));
        out.append(min);
    }

    public static double f(double t) {
        double dx = Doubles.max(xr, xrl - t, xrr + t) - Doubles.min(xl, xll - t, xlr + t);
        double dy = Doubles.max(yu, yud - t, yuu + t) - Doubles.min(yd, ydd - t, ydu + t);
        return dx * dy;
    }

    public static double ts(double l, double r) {
        double eps = 1e-10;
        while (r - l > eps) {
            double d = (r - l) / 3.;
            double m1 = l + d;
            double m2 = r - d;
            if (f(m1) < f(m2)) {
                r = m2;
            } else {
                l = m1;
            }
        }
        return f((l + r) / 2.);
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
class Doubles {
    private Doubles(){}

    public static double[] toArray(Collection<? extends Number> collection) {
        int n = collection.size();
        double[] ret = new double[n];
        Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).doubleValue();
        }
        return ret;
    }

    public static String join(double[] a, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static double max(double... a) {
        double ret = Double.MIN_VALUE;
        for (double e : a) {
            ret = Math.max(ret, e);
        }
        return ret;
    }

    public static double min(double... a) {
        double ret = Double.MAX_VALUE;
        for (double e : a) {
            ret = Math.min(ret, e);
        }
        return ret;
    }

    public static double fold(DoubleBinaryOperator func, double a, double... b) {
        double ret = a;
        for (double c : b) ret = func.applyAsDouble(ret, c);
        return ret;
    }

    public static void swap(double[] a, int u, int v) {
        double tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(double[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(double[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(double[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static double[][] transpose(double[][] a) {
        int n = a.length;
        int m = a[0].length;
        double[][] ret = new double[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static int compare(double[] a, double[] b) {
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

    public static boolean equals(double[] a, double[] b) {
        return compare(a, b) == 0;
    }
}
