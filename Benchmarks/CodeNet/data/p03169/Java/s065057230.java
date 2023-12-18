import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    
    static double[][][] dp;
    static int N;
    static final int MAX = 310;
    public static void main(String[] args) {
        N = nint();
        int[] a = nints(N);
        int n3 = count(a, 3); // sushi が3個乗っている皿の個数
        int n2 = count(a, 2);
        int n1 = count(a, 1);
        
        // sushi1,2,3個の皿がi,j,k皿のとき、全てのsushiを食べるのに必要な操作の回数の期待値
        dp = new double[MAX][MAX][MAX];
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                Arrays.fill(dp[i][j], -1.0);
            }
        }
        
        System.out.println(solve(n1, n2, n3));
    }
    
    static double solve(int n1, int n2, int n3) {
        if (dp[n1][n2][n3] >= 0) return dp[n1][n2][n3];
        if (n1 == 0 && n2 == 0 && n3 == 0) return 0;
        
        double ans = 0;
        if (n1 > 0) ans += solve(n1-1, n2  , n3  ) * n1;
        if (n2 > 0) ans += solve(n1+1, n2-1, n3  ) * n2;
        if (n3 > 0) ans += solve(n1  , n2+1, n3-1) * n3;
        ans += N;
        ans /= (n1 + n2 + n3);
        dp[n1][n2][n3] = ans;
        return ans;
    }
  
    private static int count(int[] a, int toCount) {
        return (int) Arrays.stream(a).filter(i -> i == toCount).count();
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
