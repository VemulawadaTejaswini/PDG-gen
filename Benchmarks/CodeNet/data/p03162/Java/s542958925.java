
import java.util.Arrays;
import java.util.Scanner;





public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 10][3];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        }

        int[][] dp = new int[n + 10][3];
//        dp[0][0] = arr[0][0];
//        dp[0][1] = arr[0][1];
//        dp[0][2] = arr[0][2];
        // dp[i][j] ... i日目にjをする場合に得られる最大の幸福度 => ans = dp[n]
        for (int i = 0; i < n; i++) {
            dp[i + 1][0] = Math.max(dp[i][1], dp[i][2]) + arr[i][0];
            dp[i + 1][1] = Math.max(dp[i][0], dp[i][2]) + arr[i][1];
            dp[i + 1][2] = Math.max(dp[i][0], dp[i][1]) + arr[i][2];
        }
//        debug(dp);
        int ans = Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]);
        System.out.println(ans);

    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
