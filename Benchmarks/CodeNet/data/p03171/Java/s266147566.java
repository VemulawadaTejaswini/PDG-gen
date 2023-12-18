import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        long[] dp = new long[n * n];
        for (int i=0; i<n; i++) {
            dp[i * n + i] = a[i]; 
        }
        calculate(dp, a, n);
        System.out.println(dp[n - 1]);

    }
    private static void calculate(long[] dp, long[] a, int n) {
        for (int i = n - 2; i > -1; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i * n + j] = Math.max(a[i] - dp[(i + 1) * n + j], a[j] - dp[i * n + (j - 1)]);
            }
        }

    }
}