import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean[] dp = genTable();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = (dp[x]) ? 1 : 0;
        System.out.println(ans);
    }

    static boolean[] genTable() {
        boolean[] dp = new boolean[100005];
        for(int i = 0, f = dp.length; i < f; ++i) {
            if(i == 0) dp[i] = true;
            else if(i < 100) dp[i] = false;
            else if(dp[i - 100] || dp[i - 101] || dp[i - 102] || dp[i - 103] || dp[i - 104] || dp[i - 105]) dp[i] = true;
            else dp[i] = false;
        }
        return dp;
    }
}