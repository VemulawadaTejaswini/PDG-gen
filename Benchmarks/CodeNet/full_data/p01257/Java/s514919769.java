import java.util.Scanner;

class Main {
    private static int[][] dp;
    private static int rec(int index, int limit, int[] values, int[] sums, int m) {
        int result = Integer.MAX_VALUE;
        if (index == 0) {
            if (m % values[index] == 0) {
                result = m / values[index];
            }
        } else if (dp[m][index] > 0) {
            result = dp[m][index];
        } else if (m / sums[index] <= limit) {
            for (int i = Math.min(m / values[index], limit); i >= 0; i--) {
                final int ret = rec(index - 1, result, values, sums, m - i * values[index]);
                result = Math.min(result, Math.max(ret, i));
            }
            dp[m][index] = result;
        }
        return result;
    }
    private static int calcMin(int[] values, int m) {
        dp = new int[m + 1][values.length];
        final int[] sums = new int[values.length];
        for (int i = 0, sum = 0; i < values.length; i++) {
            sum += values[i];
            sums[i] = sum;
        }
        return rec(values.length - 1, Integer.MAX_VALUE, values, sums, m);
    }
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int n = scanner.nextInt();
            final int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            final int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = scanner.nextInt();
            }
            System.out.println(calcMin(values, m));
        }
    }

    public static void main(String... args) {
        solve();
    }
}