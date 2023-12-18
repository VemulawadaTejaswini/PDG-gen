import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[][] dp = new int[N][K];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 0;
        if (a[0] <= K) {
            dp[0][a[0]] = 1;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < K; j++) {
                if (a[i] <= j) {
                    if (dp[i - 1][j - a[i]] != -1) {
                        dp[i][j] = dp[i - 1][j - a[i]] | 1 << i;
                    }
                }
            }
            for (int j = 0; j < K; j++) {
                if (dp[i - 1][j] != -1) {
                    if (dp[i][j] != -1) {
                        dp[i][j] &= dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = Math.max(0, K - a[i]); j < K; j++) {
                if (dp[N - 1][j] != -1 && (dp[N - 1][j] >> i) % 2 == 0) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(N - ans);
    }
}
