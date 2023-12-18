
import java.util.*;
public class Main{

public static void main(String[] args) {

        Scanner s = new Scanner(new BufferedInputStream(System.in));
        int n = s.nextInt();
        int k = s.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];

        for (int i = 0;i < n;i++) {
            nums[i] = s.nextInt();
        }

        dp[0] = 0;
        for (int i = 1;i < n;i++) {
            for (int j= 1;j <= k ;j++) {
                if (i -j < 0) break;
                if (j != 1 && i-j>=0) {
                    dp[i] = Math.min(dp[i],dp[i-j] + Math.abs(nums[i]-nums[j]));
                }else
                    dp[i] = dp[i-1] + Math.abs(nums[i]-nums[i-1]);
            }
        }

        System.out.println(dp[n-1]);
    }
}