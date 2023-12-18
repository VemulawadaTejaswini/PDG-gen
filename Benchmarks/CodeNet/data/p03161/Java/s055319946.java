import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        if(n  < 2){
            System.out.println(0);
            return;
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(nums[0] - nums[1]);
        
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= k && i + k < n; j++){
                dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(nums[i + j] - nums[i]));
            }
        }
        System.out.println(dp[n - 1]);
    }
}
