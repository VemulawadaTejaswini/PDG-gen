
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int[] h = new int[100010];
    static int[] dp = new int[100010];
    static int k;

    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        Arrays.fill(dp, Integer.MAX_VALUE);
        int res = Integer.MAX_VALUE;
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i + j] = chmin(dp[i + j], dp[i] + Math.abs(h[i] - h[i + j]));
            }
        }
        System.out.println(dp[n - 1]);
    }
}
