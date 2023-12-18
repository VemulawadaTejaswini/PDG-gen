public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), a = scanner.nextInt();
        int[] x = java.util.stream.IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .toArray();
        long[][][] dp = new long[n + 1][n + 1][2501];
        dp[0][0][0]++;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2500; k++) {
                    if (dp[i][j][k] != 0) {
                        dp[i + 1][j + 1][k + x[i]] += dp[i][j][k];
                        dp[i + 1][j][k] += dp[i][j][k];
                    }
                }
            }
        }
        System.out.println(java.util.stream.IntStream.rangeClosed(1, n)
                .mapToLong(i -> dp[n][i][i * a])
                .sum());
    }
}