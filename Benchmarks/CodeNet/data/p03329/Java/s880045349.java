import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        System.out.println(solve(n));
    }
    public static int solve(int n) {
        int[] nine = new int[6];
        nine[0] = 9;
        for(int i = 1; i < 6; i++) {
            nine[i] = nine[i-1] * 9;
        }
        int[] six = new int[7];
        six[0] = 6;
        for(int i = 1; i < 7; i++) {
            six[i] = six[i - 1] * 6;
        }
        int[] dp = new int[100001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 0; i < nine.length; i++) {
            if (nine[i] < n) {
                dp[nine[i]] = 1;
            }
        }
        for(int i = 0; i < six.length; i++) {
            if (six[i] < n) {
                dp[six[i]] = 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (dp[i] == -1) {
                continue;
            }
            dp[i+1] = Math.min(dp[i+1], dp[i]+1);
            for(int j = 0; j < nine.length; j++) {
                if (i + nine[j] <= n) {
                    dp[i + nine[j]] = Math.min(dp[i + nine[j]], dp[i] + 1);
                }
            }
            for(int j = 0; j < six.length; j++) {
                if (i + six[j] <= n) {
                    dp[i + six[j]] = Math.min(dp[i + six[j]], dp[i] + 1);
                }
            }
        }
        return dp[n];
    }
}
