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
        int Ma = sc.nextInt();
        int Mb = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        int asum = 0, bsum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            asum += a[i];
            bsum += b[i];
        }
        int[][][] dp = new int[N + 1][asum + 1][bsum + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < asum + 1; j++) {
                Arrays.fill(dp[i][j], Integer.MAX_VALUE / 2);
            }
        }
        dp[0][0][0] = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < asum + 1; j++) {
                for (int k = 0; k < bsum + 1; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= a[i - 1] && k >= b[i - 1]) {
                        dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j - a[i - 1]][k - b[i - 1]] + c[i - 1]);
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE / 2;
        for (int i = 1; i < asum + 1; i++) {
            for (int j = 1; j < bsum + 1; j++) {
                if (i * Mb == j * Ma) {
                    min = Math.min(min, dp[N][i][j]);
                }
            }
        }
        if (min < Integer.MAX_VALUE / 2) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
