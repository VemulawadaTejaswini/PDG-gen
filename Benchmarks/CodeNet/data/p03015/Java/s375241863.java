import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int length = arr.length;
        long[][] dp = new long[length + 1][2];
        dp[0][0] = 1;
        for (int i = 1; i <= length; i++) {
            if (arr[i - 1] == '1') {
                dp[i][0] = dp[i - 1][0] * 2 % MOD;
                dp[i][1] = (dp[i - 1][0] + dp[i - 1][1] * 3) % MOD;
            } else {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = (dp[i - 1][1] * 3) % MOD;
            }
        }
        System.out.println((dp[length][0] + dp[length][1]) % MOD);
    }
}