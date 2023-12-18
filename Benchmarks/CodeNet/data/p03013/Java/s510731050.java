import java.util.*;

public class Main {
    //Typical Stairs
    //DP?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int mod = 1000000007;
        int[] broken = new int[m];
        for (int i = 0; i < m; i++) broken[i] = sc.nextInt();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i == broken[index]) {
                dp[i] = 0;
                index++;
                if (index >= m) index = 0;
            } else {
                if (i == 1) {
                    dp[i] = 1;
                } else dp[i] = (dp[i - 1] % mod + dp[i - 2] % mod) % mod;
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
