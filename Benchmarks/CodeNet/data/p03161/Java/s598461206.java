import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }

        int[] dp = createArray(n, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
            for (int j = 1; j <= k; j++) {
                if (i >= j) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
                }
            }
        }

        System.out.println(dp[n - 1]);
    }

    private static int[] createArray(int size, int defaultValue) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = defaultValue;
        }
        return array;
    }
}
