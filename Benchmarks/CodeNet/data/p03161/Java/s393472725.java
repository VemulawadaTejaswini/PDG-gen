import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int minJumps(int[] heights, int K) {
        int n = heights.length;
        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = 1_000_000_000;
            for (int jumps = 1; jumps <= K; jumps++) {
               if (i - jumps < 0) {
                   continue;
               }
               dp[i] = Math.min(dp[i], Math.abs(heights[i - jumps] - heights[i]) + dp[i - jumps]);
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] strs = br.readLine().split(" ");
            int n = Integer.parseInt(strs[0]);
            int K = Integer.parseInt(strs[1]);
            String heightsStr = br.readLine();
            String[] split = heightsStr.split(" ");
          	int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
              	heights[i] = Integer.parseInt(split[i]);
            }
          	Main app = new Main();
            int result = app.minJumps(heights, K);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
