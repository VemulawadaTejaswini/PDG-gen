import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    
    int[] heights = new int[n];
    
    for (int i = 0; i < n; i++) {
      	heights[i] = scan.nextInt();
    }
    scan.close();

    int result = solve(n,k,heights);
    System.out.println(result);
  }
  
  private static int solve(int N, int K, int[] heights){
    int[] dp = new int[N+1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
      
    for(int i = 0; i < N; i++){
      for (int j = 1; j <= K && (i+j) < N; j++) {
        dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(heights[i+j] - heights[i]));
      }
    }
    return dp[N-1];
  }
}