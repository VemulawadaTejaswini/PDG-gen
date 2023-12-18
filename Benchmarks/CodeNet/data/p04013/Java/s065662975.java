import java.util.*;

public class Main {
    static int n, a;
    static int[] x;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = in.nextInt();
        int maxLim = 50*n;

        x = new int[n];
        for(int i = 0; i < n; i++) x[i] = in.nextInt();

        int[][][] dp = new int[n+1][n+1][maxLim+1];
        for(int i = 0; i < n+1; i++) {
           for(int j = 0; j < n+1; j++) {
               Arrays.fill(dp[i][j], 0);
           }
        }

        dp[0][0][0] = 1;
        for(int j = 1; j < n+1; j++) {
            for(int k = 0; k < n+1; k++) {
                for(int s = 0; s < maxLim+1; s++) {
                    if(k >= 1 && s >= x[j-1]) {
                        dp[j][k][s] = dp[j - 1][k][s] + dp[j - 1][k - 1][s - x[j - 1]];
                    }else if(s < x[j-1]){
                        dp[j][k][s] = dp[j-1][k][s];
                    }
                }
            }
        }

        long cnt = 0;
        for(int k = 1; k < n+1; k++) cnt += dp[n][k][k*a];

        System.out.println(cnt);
    }
}