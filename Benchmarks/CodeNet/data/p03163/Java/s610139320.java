import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   	public long knapsack(int n, int capacity, int[] weights, long[] values) {
        long[][] dp = new long[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                long skip = dp[i - 1][j];
                long take = 0;
                if (weights[i - 1] <= j) {
                    take = dp[i - 1][j - weights[i - 1]] + values[i - 1];
                }
                dp[i][j] = Math.max(skip, take);
            }

        }
        return dp[n][capacity];
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
