import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            if (((i - 4 >= 0) && dp[i-4]) || ((i - 7 >= 0) && dp[i-7])) {
                dp[i] = true;
            }
        }

        System.out.println(dp[n] ? "Yes" : "No");
    }
}