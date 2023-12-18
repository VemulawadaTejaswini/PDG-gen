
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc    = new Scanner(System.in);
    static final int     MOD   = (int) 1E9 + 7;
    static final long    INF_L = (long) 4E18;
    static final int     INF   = Integer.MAX_VALUE;
    
    static long[] damage = new long[(int) 1e7 + 1];
    public static void main(String[] args) {
        int H = nint();
        int N = nint();
        int[] v = new int[N];
        int[] w = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = nint();
            w[i] = nint();
        }
        long[][] a = knapsack_withMaxSumVal(N, H, w, v); 
        System.out.println(a[N][H]);
    }
    
    static long[][] knapsack_withMaxSumVal(int numItems, int maxSumVal, int[] weights, int[] values) {
        int N = numItems;
        int V = maxSumVal;
        
        // 
        int[] ws = new int[N + 1]; // weights が既に番兵を含んでいる場合は int[] ws = weights.clone();
        System.arraycopy(weights, 0, ws, 1, N);
        int[] vs = new int[N + 1]; // values が既に番兵を含んでいる場合は int[] vs = values.clone();
        System.arraycopy(values, 0, vs, 1, N);
        
        long[][] sumW = new long[N+1][V+1];
        for (long[] a : sumW) {
            Arrays.fill(a, INF_L);
        }
        
        for (int n = 0; n <= N; n++) {
            sumW[n][0] = 0;
        }
        
        for (int n = 1; n <= N; n++) {
            for (int v = 1; v <= V; v++) {
                long sumWithoutN = sumW[n-1][v];
                long sumWithN = (v - vs[n] >= 0 ? sumW[n][v - vs[n]] : 0) + ws[n];
                sumW[n][v] = min(sumWithN, sumWithoutN);
            }
        }
        
        return sumW;
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
