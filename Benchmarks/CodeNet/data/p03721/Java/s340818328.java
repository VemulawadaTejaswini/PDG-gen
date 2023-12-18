import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static long k;
    static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextLong();
        dp = new long[100000+1];

        for (int i = 0; i < n; i++) {
            dp[sc.nextInt()] += sc.nextLong();
        }
        int ans = 0;
        for (int i = 0; i < dp.length; i++) {
            if (k - dp[i] <= 0) {
                ans = i;
                break;
            } else {
                k -= dp[i];
            }
        }
        System.out.println(ans);
    }
}
