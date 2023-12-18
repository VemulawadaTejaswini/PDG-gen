public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] h = new int[n], dp = new int[n];
        java.util.Arrays.fill(dp, 1, n, 100000);
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
            for (int j = 1; j <= k; j++)
                if (i >= j)
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i - j] - h[i]));
        }
        System.out.println(dp[n - 1]);
    }
}