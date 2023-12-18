
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int[] h = new int[100010];
    static int[] dp = new int[100010];

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

    static int rec(int i) {
        if (dp[i] < INF)
            return dp[i];
        if (i == 0)
            return 0;
        int res = Integer.MAX_VALUE;
        res = chmin(res, rec(i - 1) + Math.abs(h[i] - h[i - 1]));
        if (i > 1)
            res = chmin(res, rec(i - 2) + Math.abs(h[i] - h[i - 2]));

        return dp[i] = res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println(rec(n - 1));
    }
}
