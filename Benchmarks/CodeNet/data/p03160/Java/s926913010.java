
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return b;
        }
        return a;
    }

    static int chmax(int a, int b) {
        if (a < b) {
            a = b;
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = chmin(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
            if (i > 1)
                dp[i] = chmin(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
        }
        System.out.println(dp[n - 1]);
    }
}
