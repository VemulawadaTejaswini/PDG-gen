import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] nums = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < 3; k++) {
                nums[i][k] = input.nextInt();
            }
        }
        int[][] dp = new int[n + 1][3];
        Arrays.fill(dp[0], 0);
        for(int i = 1; i <= n; i++) {
            for(int k = 0; k < 3; k++) {
                for(int h = 0; h < 3; h++) {
                    if(h == k) {
                        continue;
                    }
                    dp[i][k] = Math.max(dp[i - 1][h] + nums[i - 1][k], dp[i][k]);
                }
            }
        }
        System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
    }
}
