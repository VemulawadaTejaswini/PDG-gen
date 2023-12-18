import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int N = nint();
        final int A = 0, B = 1, C = 2;
        int[][] in = new int[3][N];
        for (int n = 0; n < N; n++) {
            for (int x = A; x <= C; x++) {
                in[x][n] = nint();
            }
        }
        
        int[][] dp = new int[3][N];
        for (int x = A; x <= C; x++) {
            dp[x][0] = in[x][0];
        }
        
        for (int i = 1; i < N; i++) {
            for (int x = A; x <= C; x++) {
                dp[x][i] = max(dp[(x+1) % 3][i-1], dp[(x+2) % 3][i-1]) + in[x][i];
            }
        }
        
        System.out.println(max(dp[A][N-1], dp[B][N-1], dp[C][N-1]));
    }
    static int max(int... ints) {
        int max = -INF;
        for (int i: ints) {
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
