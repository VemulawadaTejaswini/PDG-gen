import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   	public long knapsack(int n, int w, int[] weights, long[] values) {
        long[][] memo = new long[n][w + 1];
        for (long[] row: memo) {
            Arrays.fill(row, -1);
        }
        return dfs(weights, values, w, 0, 0, memo);
    }
	private long dfs(int[] weights, long[] values, int maxCapacity, int currPosition, int currWeight, long[][] memo) {
        int n = weights.length;
        if (currPosition >= n) {
            return 0;
        }
        if (memo[currPosition][currWeight] != -1) {
            return memo[currPosition][currWeight];
        }
        long maxVal = 0;
        long take = 0;
        if (currWeight + weights[currPosition] <= maxCapacity) {
            take = values[currPosition] + dfs(weights, values, maxCapacity, currPosition + 1, currWeight + weights[currPosition], memo);
        }
        long skip = dfs(weights, values, maxCapacity, currPosition + 1, currWeight, memo);
        return memo[currPosition][currWeight] = Math.max(take, skip);
    }

    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] split = br.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            int w = Integer.parseInt(split[1]);
          	int[] weights = new int[n];
          	long[] values = new long[n];
            for (int i = 0; i < n; i++) {
                split = br.readLine().split(" ");
                weights[i] = Integer.parseInt(split[0]);
                values[i] = Long.parseLong(split[1]);
            }
          	Main app = new Main();
            long result = app.knapsack(n, w, weights, values);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
