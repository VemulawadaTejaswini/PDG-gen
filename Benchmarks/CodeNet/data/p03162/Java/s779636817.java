
import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] nums = new int[n][3];
        int[][] dp = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = scan.nextInt();
                dp[i][j] = MIN_VALUE;
                if(i == 0) {
                    dp[i][j] = nums[i][j];
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            dp[i + 1][0] = max(dp[i+1][0], max(dp[i][1] + nums[i+1][0], dp[i][2] + nums[i+1][0]));
            dp[i + 1][1] = max(dp[i+1][1], max(dp[i][0] + nums[i+1][1], dp[i][2] + nums[i+1][1]));
            dp[i + 1][2] = max(dp[i+1][2], max(dp[i][1] + nums[i+1][2], dp[i][0] + nums[i+1][2]));
        }

        System.out.println(max(dp[n-1][2], max(dp[n-1][0], dp[n-1][1])));


    }

}
