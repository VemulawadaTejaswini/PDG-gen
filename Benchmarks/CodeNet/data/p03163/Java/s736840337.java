
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_d
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        System.out.println(maxValue(N, W, w, v));
    }

    public static long maxValue(int N, int W, int[] w, int[] v) {
        long[] dp = new long[W + 1];
        for (int i = 0; i < N; i++) {
            long[] temp = new long[W + 1];
            for (int j = 1; j <= W; j++) {
                if (j - w[i] >= 0) {
                    temp[j] = dp[j-w[i]] + v[i];
                }
                temp[j] = Math.max(dp[j], temp[j]);
            }
            dp = temp;
        }
        return Arrays.stream(dp).max().getAsLong();
    }

}
