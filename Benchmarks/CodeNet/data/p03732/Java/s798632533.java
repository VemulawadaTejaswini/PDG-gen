import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N+1];
        int[] v = new int[N+1];
        for(int i = 1; i < N+1; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        long[][] dp = new long[W+1][N+1];

        Arrays.fill(dp[0], 0);
        for(int j = 1; j < W+1; j++){
            dp[j][0] = 0;
        }
        dp[0][0] = (w[0] > 1)? 0 : v[0];
        for(int i = 1; i < W+1; i++){
            for(int j = 1; j < N+1; j++){
                long x = (i-w[j] >= 0) ? dp[i-w[j]][j-1] + v[j] : dp[0][j-1];
                dp[i][j] = Math.max(dp[i][j-1], x);
            }
        }
        System.out.println(dp[W][N]);
    }
}