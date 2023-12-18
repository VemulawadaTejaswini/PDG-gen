class Main {
    // dp
    public static long knapsack1(int[] w, long[] v, int C) {
        int n = w.length;
        long[][] dp = new long[n][C+1];
 
        for (int c = 1; c <= C; c++) {
            dp[0][c] = (c >= w[0]) ? v[0] : 0;
        }
 
        for (int i = 1; i < n; i++) {
            for (int c = 1; c <= C; c++) {
                dp[i][c] = dp[i-1][c];
                if (c >= w[i]) {
                    dp[i][c] = Math.max(dp[i][c], v[i] + dp[i-1][c-w[i]]);
                }
            }
        }
 
        return dp[n-1][C];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int C = in.nextInt();
 
        int[] w = new int[N];
        long[] v = new long[N];
        for (int i = 0; i < N; i++) {
            w[i] = in.nextInt();
            v[i]  = in.nextLong();
        }
        in.close();
 
        // call function hear
        long ret = knapsack1(w, v, C);
        System.out.println(ret);
    }
}