import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;
    static double[][][] dp;
    
    public static void main(String[] args) {
        int[] a = new int[4];
        int N = nint();
        
        for (int i = 0; i < N; i++) {
            a[nint()]++;
        }
        
        dp = new double[N+2][N+2][N+2];
        for (double[][] d1 : dp) {
            for (double[] d2 : d1) {
                Arrays.fill(d2, -1);
            }
        }
        
        dp[0][0][0] = 0;
        System.out.println(f(N, a[1], a[2], a[3]));
    }
    
    static double f(int N, int i1, int i2, int i3) {
        if (dp[i1][i2][i3] >= 0) {
            return dp[i1][i2][i3];
        }
        double sum = N;
        if (i1 > 0) sum += i1 * f(N, i1-1, i2  ,i3  );
        if (i2 > 0) sum += i2 * f(N, i1+1, i2-1, i3  );
        if (i3 > 0) sum += i3 * f(N, i1  , i2+1, i3-1);
        dp[i1][i2][i3] = sum / (i1 + i2 + i3);
        return dp[i1][i2][i3];
    }
    
    @Deprecated
    static int nint() {
        return sc.nextInt();
    }

    @Deprecated
    static int[] nints(int N) {
        return nints(N, 0, 0);
    }

    @Deprecated
    private static int[] nints(int N, int padL, int padR) {
        int[] a = new int[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nint();
        return a;
    }

    static long nlong() {
        return sc.nextLong();
    }

    static long[] nlongs(int N) {
        return nlongs(N, 0, 0);
    }

    static long[] nlongs(int N, int padL, int padR) {
        long[] a = new long[padL + N + padR];
        for (int i = 0; i < N; i++)
            a[padL + i] = nlong();
        return a;
    }

    static double ndouble() {
        return sc.nextDouble();
    }

    static double[] ndoubles(int N) {
        return ndoubles(N, 0, 0);
    }

    static double[] ndoubles(int N, int padL, int padR) {
        double[] d = new double[N + padL + padR];
        for (int i = 0; i < N; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    static String nstr() {
        return sc.next();
    }

    static char[] nchars() {
        return sc.next().toCharArray();
    }

    static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }

    static char[][] nchars2(int H, int W) {
        return nchars2(H, W, 0, 0);
    }

    static char[][] nchars2(int H, int W, int padLU, int padRD) {
        char[][] a2 = new char[H + padLU + padRD][W + padLU + padRD];
        for (int i = 0; i < H; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, W);
        return a2;
    }

    static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    static long abs(long a) {
        return Math.abs(a);
    }
}
