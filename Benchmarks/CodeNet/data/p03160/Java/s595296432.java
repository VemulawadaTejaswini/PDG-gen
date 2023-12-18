import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AFrog1 {
    public static int cost(int i, int j, int[] heights){
        return Math.abs(heights[i] - heights[j]);
    }

    public static int MinCost(int n, int[] heights, int[] dp){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return cost(1, 0, heights);
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = Math.min(MinCost(n-1, heights, dp) + cost(n, n-1, heights), MinCost(n-2, heights, dp) + cost(n, n-2, heights));
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] heights = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = MinCost(n-1, heights, dp);
        System.out.println(ans);
    }
}
