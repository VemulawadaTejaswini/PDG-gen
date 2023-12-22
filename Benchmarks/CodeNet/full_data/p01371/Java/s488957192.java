import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    int dp[][];
    int INF = 1 << 28;
    int n;
    int[][] ts;

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            if (n == 0)
                break;
            ts = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    ts[i][j] = sc.nextInt();
                }
            }
            dp = new int[1 << (n + 1)][n + 1];
            int min = INF;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < 1 << (n + 1); j++) {
                    Arrays.fill(dp[j], -1);
                }
                min = Math.min(min, tsp(1 | 1 << i, i));
            }
            System.out.println(min);
        }
    }

    int tsp(int S, int v) {
        if (dp[S][v] >= 0) {
            return dp[S][v];
        }
        int min = ts[v][0];
        for (int i = 1; i <= n; i++) {
            if (i == v)
                continue;
            if ((S >> i & 1) == 1) {
                min = Math.min(min, ts[v][i]);
            }
        }
        if (S == (1 << (n + 1)) - 1) {
            return dp[S][v] = min;
        }
        int res = INF;
        for (int u = 1; u <= n; u++) {
            if ((S & (1 << u)) == 0) {

                res = Math.min(res, tsp(S | 1 << u, u) + min);
            }
        }
        return dp[S][v] = res;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}