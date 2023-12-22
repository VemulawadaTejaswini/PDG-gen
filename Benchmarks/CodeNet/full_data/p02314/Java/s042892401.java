
import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[m];

        for (int i = 0; i < m; i++) {
            coins[i] = sc.nextInt();
        }
        // dp[i]をi円支払う時の最小枚数とする.
        int[] dp = new int[60030];
        Arrays.fill(dp, Integer.MAX_VALUE);

        int current = 0;
        dp[0] = 0;
        for (int i = 0; i < 50000; i++) {
            for (int coin: coins) {
                int next = i + coin;
                dp[next] = Math.min(dp[next], dp[i] + 1);
            }
        }

        System.out.println(dp[n]);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

