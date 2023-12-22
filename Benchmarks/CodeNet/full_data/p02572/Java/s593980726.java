import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] ar = new long[N];
        long[] dp = new long[N];
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextLong();
            if (i == 0) {
                dp[i] = ar[i];
            } else {
                dp[i] = dp[i-1]+ar[i];
            }            
        }
        for (int i = 0; i < N-1; i++) {
            ans += ar[i]*(dp[N-1]-dp[i])%1000000007;
            ans = ans%1000000007;
        }
        System.out.println(ans);
    }
}
