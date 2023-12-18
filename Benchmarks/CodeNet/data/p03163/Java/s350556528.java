import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int N = nint();
        int W = nint();
        int[] ws = new int[N+1];
        int[] vs = new int[N+1];
        for (int i = 1; i <= N; i++) {
            ws[i] = nint();
            vs[i] = nint();
        }
        long[][] sum = new long[N+1][W+1];
        for (int n = 1; n <= N; n++) {
            for (int w = 1; w <= W; w++) {
                long a = sum[n-1][w];
                long b = (w-ws[n] >= 0) ? sum[n-1][w-ws[n]] + vs[n] : -1;
                sum[n][w] = max(a, b);
            }
        }
        System.out.println(sum[N][W]);
    }
    static long max(long... longs) {
        long max = -INF;
        for (long i: longs) {
            max = Math.max(i, max);
        }
        return max;
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
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

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0);
    }

    private static char[][] nchars2(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
