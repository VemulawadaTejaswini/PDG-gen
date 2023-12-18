import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] list = {6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i < n + 1; i++){
            dp[i] = i;
        }
        for(int num : list) {
            for(int i = num; i < n + 1; i++){
                dp[i] = Math.min(dp[i], dp[i - num] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
