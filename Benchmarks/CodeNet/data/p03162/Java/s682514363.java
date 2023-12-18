import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        Pair[] dp = new Pair[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new Pair();
        }

        dp[n - 1].ai = arr[n - 1][0];
        dp[n - 1].bi = arr[n - 1][1];
        dp[n - 1].ci = arr[n - 1][2];

        for (int i = n - 2; i >= 0; i--) {

            dp[i].ai = Math.max(dp[i + 1].bi, dp[i + 1].ci) + arr[i][0];
            dp[i].bi = Math.max(dp[i + 1].ai, dp[i + 1].ci) + arr[i][1];
            dp[i].ci = Math.max(dp[i + 1].bi, dp[i + 1].ai) + arr[i][2];

        }

        System.out.println(Math.max(dp[0].ai, Math.max(dp[0].bi, dp[0].ci)));

    }
}

class Pair {
    int ai;
    int bi;
    int ci;

}