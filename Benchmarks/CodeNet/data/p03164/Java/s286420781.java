import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long W = sc.nextLong();
        long[] w = new long[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextInt();
        }

        long[][] dp = new long[N + 1][100000];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < 100000; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++) {
            for (int sumv = 0; sumv < 100000; sumv++) {
                if (sumv >= v[i]) {
                    dp[i + 1][sumv] = Math.min(dp[i + 1][sumv], dp[i][sumv - v[i]] + w[i]);
                }
                dp[i + 1][sumv] = Math.min(dp[i + 1][sumv], dp[i][sumv]);
            }
        }
        long ans = 0;
        for (int sumv = 0; sumv < 100000; sumv++) {
            if (dp[N][sumv] <= W) {
                ans = sumv;
            }
        }
        System.out.println(ans);
    }

}
