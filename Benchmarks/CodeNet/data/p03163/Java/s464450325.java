
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] wArr = new int[n];
        int[] vArr = new int[n];

        for (int i = 0 ; i < n; i ++) {
            wArr[i] = sc.nextInt();
            vArr[i] = sc.nextInt();
        }

        long[][] dp = new long[n + 1][w + 1];
        // dp[i][j] ... i番目までの荷物をつかって、重さがjを超えないような最大の価値

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j <= w; j++) {
                if (wArr[i] <= j) {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - wArr[i]] + vArr[i]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }
//        debug(dp);
        System.out.println(dp[n][w]);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
