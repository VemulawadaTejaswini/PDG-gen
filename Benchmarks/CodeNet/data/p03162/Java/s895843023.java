import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int[][] weights = new int[n][3];
    
    for (int i = 0; i < n; i++) {
      	for (int j = 0; j < 3; j++) {
          	weights[i][j] = scan.nextInt();
        }
    }
    scan.close();

    int result = solve(n, weights);
    System.out.println(result);
  }
  
  private static int solve(int n, int[][] weights){
    int[][] dp = new int[n][3];
    
    dp[0] = weights[0];
    for (int i = 1; i < n; i++) {
      	for (int j = 0; j < 3; j++) {
    		List<Integer> idx = new ArrayList<>(Arrays.asList(0, 1, 2));
          	idx.remove(j);
          	
          	dp[i][j] = Math.max(dp[i - 1][idx.get(0)] + weights[i][j],
                dp[i - 1][idx.get(1)] + weights[i][j]);
        }
    }
    return Math.max(dp[n-1][0], Math.max(dp[n-1][1],dp[n-1][2]));
  }
}