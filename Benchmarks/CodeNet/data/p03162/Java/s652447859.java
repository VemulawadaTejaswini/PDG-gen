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
          int l = 0;
          int r = 1;
          	
          if(j == 0) {
            l = 1;
            r = 2;
          } else if (j == 1) {
            r = 2;
          }
          	
          	dp[i][j] = Math.max(dp[i - 1][l] + weights[i][j],
                dp[i - 1][r] + weights[i][j]);
        }
    }
    return Math.max(dp[n-1][0], Math.max(dp[n-1][1],dp[n-1][2]));
  }
}