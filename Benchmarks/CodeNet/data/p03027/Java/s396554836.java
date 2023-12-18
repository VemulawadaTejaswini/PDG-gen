import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int questionCount = sc.nextInt();
        
        while (questionCount-- > 0) {
            int shokou = sc.nextInt();
            int sa = sc.nextInt();
            int n = sc.nextInt();
            long[] dp = new long[n + 1];
            dp[0] = 1;
            for (int i = 0; i < n; i++) {
                dp[i + 1] = dp[i] * (shokou + i * sa) % 1000003;
            }
            
            System.out.println(dp[n]);
        }
    }
}
