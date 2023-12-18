import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int[] a = new int[1 << n];
        for (int i = 0; i < 1 << n; i++) {
            a[i] = fsc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        int[][] m = new int[1 << n][2];
        int[] ans = new int[1 << n];
        m[0][0] = 0;
        m[0][1] = 0;
        m[1][0] = a[1] > a[0] ? 1 : 0;
        m[1][1] = a[1] > a[0] ? 0 : 1;
        ans[1] = a[0] + a[1];
        for (int k = 2; k < 1 << n; k++) {
            int max = ans[k - 1];
            int m1 = a[k] > a[0] ? k : 0;
            int m2 = a[k] > a[0] ? 0 : k;
            for (int b = 0; b < 32; b++) {
                if ((k & (1 << b)) != 0) {
                    int c1 = m[k - (1 << b)][0];
                    int c2 = m[k - (1 << b)][1];
                    if (a[c1] > a[m1]) {
                        m2 = m1;
                        m1 = c1;
                        if (a[c2] > a[m2] && c2 != c1) {
                            m2 = c2;
                        }
                    } else if (a[c1] > a[m2] && c1 != m1) {
                        m2 = c1;
                    } else if (a[c2] > a[m2] && c2 != m1) {
                        m2 = c2;
                    }
                }
            }
            m[k][0] = m1;
            m[k][1] = m2;
            ans[k] = IntUtil.max(max, a[m1] + a[m2]);
        }
        for (int k = 1; k < 1<< n; k++) {
            sb.append(ans[k]).append('\n');
        }
        System.out.print(sb);
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}


class IntUtil {
    public static int min(int... a) {
        int ret = Const.IINF;
        for (int c : a) ret = Math.min(ret, c);
        return ret;
    }

    public static int max(int... a) {
        int ret = -Const.IINF;
        for (int c : a) ret = Math.max(ret, c);
        return ret;
    }

    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static int cld(int a, int b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        else if (a < 0 && b < 0) return (a + b + 1) / b;
        else return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static int fld(int a, int b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        else if (a > 0 && b <= 0) return (a - b - 1) / b;
        else return a / b;
    }

    public static int fold(IntBinaryOperator func, int a, int... b) {
        int ret = a;
        for (int c : b) ret = func.applyAsInt(ret, c);
        return ret;
    }
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;
    public static long MOD = MOD7;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;

    public static void setMod(long mod) {
        MOD = mod;
    }
}
