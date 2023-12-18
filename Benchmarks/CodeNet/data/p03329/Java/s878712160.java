import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[100001];
        dp[0] = 0;
        for(int i = 1; i < 100000; i++) {
            dp[i] = Integer.MAX_VALUE;
            int power = 1;
            while(power <= i) {
                dp[i] = Math.min(dp[i], dp[i - power] + 1);
                power *= 6;
            }
            power = 1;
            while(power <= i) {
                dp[i] = Math.min(dp[i], dp[i - power] + 1);
                power *= 9;
            }
        }
        System.out.println(dp[n]);
    }
}