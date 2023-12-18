
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        String s = nstr();
        
        long max = 0;
        int len = s.length();
        for (int i = 1; i < len; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i, len);
            max = max(max, sub(a, b, i, len-i));
        }
        System.out.println(max);
    }

    static int sub(String X, String Y, int m, int n) {
        int[][] lcs = new int[m + 1][n + 1];
        int len = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    lcs[i][j] = 0;

                else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                    if (len < lcs[i][j]) {
                        len = lcs[i][j];
                    }
                } else
                    lcs[i][j] = 0;
            }
        }
        return len;
    }
    
    private static int nint() {
        return sc.nextInt();
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static double ndouble() {
        return sc.nextDouble();
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }
    
    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }
    
    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }
    
    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }
    
    private static long abs(long a, long b) {
        return Math.abs(a - b);
    }
}
