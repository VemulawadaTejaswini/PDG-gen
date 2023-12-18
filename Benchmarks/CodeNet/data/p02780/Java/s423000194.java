import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int k = sc.nextInt();

        final int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        final double[] evs = new double[1001];
        for (int i = 1; i <= 1000; i++) {
            evs[i] = getExpectedValue(i);
        }

        double ans = Double.MIN_VALUE;
        final double[] sum = new double[n];
        sum[0] = evs[p[0]];
        for (int i = 1; i < n; i++) {
            sum[i] = evs[p[i]] + sum[i-1];
            if (i >= k) {
                ans = Math.max(ans, sum[i] - sum[i - k]);
            }
        }

        if (n == k) {
            ans = Math.max(ans, sum[n-1]);
        }

        System.out.println(ans);
    }

    private static double getExpectedValue(final int max) {
        double result = 0;
        for (double j = 1; j <= max; j++) {
            result += j;
        }
        return result / max;
    }
}
