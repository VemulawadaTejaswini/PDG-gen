import java.util.*;

public class Main {
    static int N;
    static int W;
    static int[] w;
    static int[] v;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        w = new int[N];
        v = new int[N];
        dp = new int[N + 1][W + 1];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        System.out.println(search(0, W));
    }

    static int search(int i, int j) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int res;
        if (i == N) {
            res = 0;
        } else if (j < w[i]) {
            res = search(i + 1, j);
        } else {
            res = Math.max(search(i + 1, j), search(i + 1, j - w[i]) + v[i]);
        }
        return dp[i][j] = res;
    }
}
