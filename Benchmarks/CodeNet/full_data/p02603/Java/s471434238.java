import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[][] dp = new int[8000+5][80+5];
        for (int i = 0; i < dp.length; i++ ) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        dp[1000][0] = 0;
        for (int j = 0; j < dp[0].length; j++ ) {
            for (int i = 0; i < dp.length; i++) {
                if (dp[i][j] == -1 || j >= N) continue;
                //if (j == 1) System.out.println(i + ","+j+": "+dp[i][j]);
                int price = A[j];
                // buy
                int num = i/price;
                int remain = i - num*price;
                dp[remain][j+1] = Math.max(dp[remain][j+1], dp[i][j]+num);
                //if (j == 0) System.out.println("remain: " + remain + ", " + num + "," + dp[remain][j+1]);
                // sell
                if (dp[i][j] > 0) {
                    remain = i + dp[i][j]*price;
                    dp[remain][j+1] = Math.max(dp[remain][j+1], 0);
                }
                // notihg
                dp[i][j+1] = Math.max(dp[i][j+1], dp[i][j]);
            }
        }

        int ans = -1;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][N] == -1) continue;
            ans = i;
        }

        System.out.println(ans);
    }
}
