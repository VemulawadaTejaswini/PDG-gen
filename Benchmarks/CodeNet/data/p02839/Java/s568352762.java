
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //solve_147_C();
        //solve_147_D();
        solve_147_E();
        return;
    }

    private static void solve_147_E() {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        int[][] A = new int[80+1][80+1];
        int[][] B = new int[80+1][80+1];

        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int maxAbs = -1;
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                maxAbs = Math.max(maxAbs, Math.abs( A[i][j]-B[i][j] ));
            }
        }

        int maxSum = maxAbs*(H+W);    //

        boolean dp[][][] = new boolean[H + 1][W + 1][maxSum + 1];
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                for (int k = 0; k <= maxSum; k++) {
                    if (i == 1 && j == 1) {
                        dp[i][j][Math.abs(A[i][j] - B[i][j])] = true;
                        continue;
                    }
                    if (dp[i - 1][j][k]) {
                        if (k + Math.abs(A[i][j] - B[i][j]) <= maxSum)
                            dp[i][j][k + Math.abs(A[i][j] - B[i][j])] = true;
                        if (Math.abs(k - Math.abs(A[i][j] - B[i][j])) <= maxSum)
                            dp[i][j][Math.abs(k - Math.abs(A[i][j] - B[i][j]))] = true;
                    }
                    if (dp[i][j - 1][k]) {
                        if (k + Math.abs(A[i][j] - B[i][j]) <= maxSum)
                            dp[i][j][k + Math.abs(A[i][j] - B[i][j])] = true;
                        if (Math.abs(k - Math.abs(A[i][j] - B[i][j])) <= maxSum)
                            dp[i][j][Math.abs(k - Math.abs(A[i][j] - B[i][j]))] = true;
                    }
                }
            }
        }
        int ans = 0;
        for (int k = 0; k <= maxSum; k++) {
            if (dp[H][W][k]) {
                ans = k;
                break;
            }
        }
        System.out.println(ans);
    }

    private static void solve_147_D() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] Ai = new long[N + 1];
        long sum = 0;

        for (int i = 0; i < N; i++) {
            Ai[i] = sc.nextLong();
        }
        sc.close();

        long surp = 0;
        int mod = (int)1e9+7;
        for( int i=0; i<61; i++ ) { //bitは60桁まで
            int cnt = 0;
            for( int j=0; j<N; j++ ) {
                if(((Ai[j]>>i) & 1) == 1) cnt++;
            }
            surp += (long)cnt * (((long)(N-cnt) * (((long)1<<i)%mod)%mod)%mod);
            surp %= mod;
        }

        System.out.println(surp);
        return;
    }

    private static void solve_147_C() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[20];
        int[][] x = new int[20][20];
        int[][] y = new int[20][20];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            for (int j = 1; j <= A[i]; j++) {
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int bits = 1; bits < (1 << N); bits++) {
            boolean ok = true;
            for (int i = 1; i <= N; i++) {
                if ((bits & (1 << (i - 1))) == 0) continue;
                for (int j = 1; j <= A[i]; j++) {
                    if ((((bits >> (x[i][j] - 1)) & 1) ^ y[i][j]) == 1) ok = false;
                }
            }
            if (ok) ans = Math.max(ans, counter(bits));
        }
        System.out.println(ans);
        return;
    }

    private static int counter(int x) {
        if (x == 0) return 0;
        return counter(x >> 1) + (x & 1);
    }
}