import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    static final long INF = (long) 4E18;

    public static void main(String[] args) {
        int N = nint();
        int K = nint();
        
        long[] h = nlongs(N, 1, 0);
        long[] cost = new long[N+1];
        Arrays.fill(cost, INF);
        cost[1] = 0;
        
        for (int i = 1; i < N; i++) {
            for (int k = 1; k <= K; k++) {
                int next = i + k;
                if (N < next) continue;
                cost[next] = min(cost[next], cost[i] + cost(h, next, i));
            }
        }
        
        System.out.println(cost[N]);
    }
    
    static long cost(long[] h, int from, int to) {
        return abs(h[to] - h[from]);
    }

    private static int nint() {
        return sc.nextInt();
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

    private static long abs(long a) {
        return Math.abs(a);
    }
}
