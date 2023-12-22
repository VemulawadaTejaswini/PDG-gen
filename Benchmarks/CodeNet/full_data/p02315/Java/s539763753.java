import java.util.*;

public class Main {
    static int[][] dp;
    static int[] values;
    static int[] weights;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        values = new int[n];
        weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        dp = new int[n][w + 1];
        System.out.println(dfw(n - 1, w));
    }
    
    static int dfw(int idx, int weight) {
        if (weight < 0) {
            return Integer.MIN_VALUE;
        }
        if (idx < 0) {
            return 0;
        }
        if (dp[idx][weight] != 0) {
            return dp[idx][weight];
        }
        return dp[idx][weight] = Math.max(dfw(idx - 1, weight), dfw(idx - 1, weight - weights[idx]) + values[idx]);
    }
}
