import java.util.ArrayList;
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
        Arrays.sort(a);
        int lb = -1, ub = N;
        if (ub - lb == 2) {
            lb++;
        }
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            List<Integer> aList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (i != mid) {
                    aList.add(a[i]);
                }
            }
            boolean[][] dp = new boolean[N - 1][K];
            dp[0][0] = true;
            if (aList.get(0) <= K) {
                dp[0][aList.get(0)] = true;
            }
            for (int i = 1; i < N - 1; i++) {
                for (int j = 0; j < K; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (aList.get(i) <= j) {
                        dp[i][j] |= dp[i - 1][j - aList.get(i)];
                    }
                }
            }

            int tmp = lb;
            lb = mid;
            for (int i = Math.max(0, K - a[mid]); i < K; i++) {
                if (dp[N - 2][i]) {
                    ub = mid;
                    lb = tmp;
                    break;
                }
            }
        }
        System.out.println(ub);
    }
}