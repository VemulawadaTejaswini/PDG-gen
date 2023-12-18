
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        // dp[i][j] ... i文字目までで、あまりがjのやつの個数

        int[][] dp = new int[n + 1][2019];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int next = Character.getNumericValue(s.charAt(i));
            dp[i + 1][next] = 1;
            for (int j = 0; j < 2019; j++) {
                dp[i + 1][(10 * j + next) % 2019] += dp[i][j];
            }
            ans += dp[i + 1][0];
        }
        System.out.println(ans);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
