import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int INF = 1_000_000_000;
    public int knapsack(int n, int w, int[] weights, int[] values, int sum) {
        int[][] memo = new int[n][sum + 1];
        for (int[] row: memo) {
            Arrays.fill(row, INF);
        }
        for (int i = 0; i <= sum; i++) {
            dfs(weights, values, i, 0, memo);
        }
        int result = 0;
        for (int j = 0; j <= sum; j++) {
            if (memo[0][j] <= w) {
                result = j;
            }
        }
        return result;
    }
    private int dfs(int[] weights, int[] values, int sum, int i, int[][] memo) {
        int n = values.length;
        if (sum == 0) {
            return 0;
        }
        if (i >= n) {
            return INF;
        }
        if (memo[i][sum] != INF) {
            return memo[i][sum];
        }
        int take = INF;
        if (sum >= values[i]) {
            take = weights[i] + dfs(weights, values, sum - values[i], i + 1, memo);
        }
        int skip = dfs(weights, values, sum, i + 1, memo);
        int result = Math.min(take, skip);
        return memo[i][sum] = result;
    }

    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            int w = Integer.parseInt(split[1]);
            int[] weights = new int[n];
            int[] values = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                split = br.readLine().split(" ");
                weights[i] = Integer.parseInt(split[0]);
                values[i] = Integer.parseInt(split[1]);
                sum += values[i];
            }
            Main app = new Main();
            int result = app.knapsack(n, w, weights, values, sum);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
