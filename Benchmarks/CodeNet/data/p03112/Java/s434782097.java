
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final long INF = Long.MAX_VALUE;
    static int A;
    static int B;
    static int Q;
    static long[] s;
    static long[] t;
    static long[] x;
    
    public static void main(String[] args) {
        A = nint();
        B = nint();
        Q = nint();
        s = nlongs(A, 1, 1);
        t = nlongs(B, 1, 1);
        x = nlongs(Q);
        s[0] = -1;
        t[0] = -1;
        s[A+1] = INF;
        t[B+1] = INF;
        
        for (int q = 0; q < Q; q++) {
            System.out.println(solve(q));
        }
    }
    
    static long solve(int q) {
        int bs = lowerBound(s, x[q]);
        int bt = lowerBound(t, x[q]);

        long ans = INF;
        long sr = s[bs];
        long sl = s[bs-1];
        long tr = t[bt];
        long tl = t[bt-1];
        
        if (sr != INF && tr != INF) {
            ans = min(ans, max(sr, tr) - x[q]);
        }
        if (sl != -1 && tl != -1) {
            ans = min(ans, x[q] - min(sl, tl));
        }
        if (sl != -1 && tr != INF) {
            ans = min(ans, (tr-sl) + (tr-x[q]));
            ans = min(ans, (tr-sl) + (x[q]-sl));
        }
        if (tl != -1 && sr != INF) {
            ans = min(ans, (sr-tl) + (sr-x[q]));
            ans = min(ans, (sr-tl) + (x[q]-tl));
        }
        
        return ans;
    }
    
    //探索したいkey以上で最小のindexを返す。
    public static int lowerBound(long[] a, long toFind) {
        int l = 0, r = a.length - 1;
        while (r - l >= 0) {
            int c = (l + r) / 2;
            if (toFind <= a[c]) {
                r = c - 1;
            } else {
                l = c + 1;
            }
        }
        return l;
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
    
    static long max(long... longs) {
        return Arrays.stream(longs).max().getAsLong();
    }
    
    static long min(long... longs) {
        return Arrays.stream(longs).min().getAsLong();
    }
}
