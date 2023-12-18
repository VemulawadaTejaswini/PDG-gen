import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for(int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long[][] dp = new long[2][k + 1];
        for(int i = 0; i < n; i++) {
            dp[1][0] = 0L;
            if(i == 0) {
                for(int j = 1; j <= k; j++) {
                    if(j >= w[i]) {
                        dp[0][j] = v[i];
                    }
                }
                continue;
            }
            for(int j = 1; j <= k; j++) {
                if(j >= w[i]) {
                    dp[i % 2][j] = Math.max(dp[(i - 1) % 2][j], dp[(i - 1) % 2][j - w[i]] + v[i]);
                }
                else {
                    dp[i % 2][j] = dp[(i - 1) % 2][j];
                }
            }
        }
        System.out.println(dp[(n - 1) % 2][k]);
    }
}
