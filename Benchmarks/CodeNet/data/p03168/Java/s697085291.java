import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        double[] p = new double[n];
        for (int i=0; i<n; i++) p[i] = sc.nextDouble();

        double[][] dp = new double[n+1][n+1];

        dp[0][0] = 1;

        for (int i=1; i<=n; i++) {
            for (int j=0; j<=n; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] * (1 - p[i-1]);
                    continue;
                }
                dp[i][j] = dp[i-1][j] * (1 - p[i-1]) + dp[i-1][j-1] * p[i-1];
            }
        }

        double res = 0;

        for (int i=n/2+1; i<=n; i++) {
            res += dp[n][i];
        }

//        System.out.println(dp[1][1]);
//        System.out.println(dp[1][0]);

        System.out.println(res);

    }

}

