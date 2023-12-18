import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[][] dp = new int[n+1][n*1000+1];

        for (int i=0; i<n+1; i++) {
            for (int j=0; j<n*1000+1; j++) {
                dp[i][j] = (int)1e9 + 10;
            }
        }

        dp[0][0] = 0;

        for (int i=1; i<=n; i++) {
            for (int j=0; j<=n*1000; j++) {
                if (j < arr[i-1][1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-arr[i-1][1]] + arr[i-1][0]);
                }
            }
        }

        int ret = 0;

        for (int i=0; i<=n*1000; i++) {
            if (dp[n][i] <= w) ret = i;
//            System.out.println(dp[n][i]);
        }

        System.out.println(ret);

    }
}

