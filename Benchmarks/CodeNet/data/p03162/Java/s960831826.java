import java.util.Scanner;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] h = new int[N][3];
        for (int i = 0; i < N; i++) {
            h[i][0] = in.nextInt();
            h[i][1] = in.nextInt();
            h[i][2] = in.nextInt();
        }
        System.out.println(maxHappiness(h, N));
    }

    public static int maxHappiness(int[][] h, int N) {
        int[] dp = h[0];
        for (int i = 1; i < N; i++) {
            int[] c = new int[3];
            c[0] = h[i][0] + Math.max(dp[1], dp[2]);
            c[1] = h[i][1] + Math.max(dp[0], dp[2]);
            c[2] = h[i][2] + Math.max(dp[0], dp[1]);
            dp = c;
        }
        return Math.max(dp[0], Math.max(dp[1], dp[2]));
    }
}
