import java.util.*;

public class Main {
    public static double solve(int n, int[] prob) {
      int limit = 301;
      double[][][] dp = new double[limit][limit][limit];
      
      for(int i = 0; i < limit; i++) {
        for(int j = 0; j < limit; j++) {
          for(int k = 0; k < limit; k++) {
            dp[i][j][k] = -1;
          }
        }
      }
      
      double result = dfs(dp, n, prob[1],prob[2],prob[3]);
      
      return result;
    }
  
  	private static double dfs (double[][][] dp, int n, int a, int b, int c){
      if(a == 0 && b ==0 && c ==0){
        return 0;
      }
      if(dp[a][b][c] != -1) {
        return dp[a][b][c];
      }
      
      double prob = (double) n / (a + b + c);
      double result = 0;
      
      if(a > 0){
        result += (prob + dfs(dp, n, a - 1, b, c)) * a / (a + b + c);
      }
      if(b > 0){
        result += (prob + dfs(dp, n, a + 1, b - 1,c)) * b / (a + b + c);
      }
      if(c > 0){
        result += (prob + dfs(dp, n, a, b + 1,c-1)) * c / (a + b + c); 
      }
      
      dp[a][b][c] = result;
      return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
      	int[] vals = new int[4];
        for (int i = 0; i < n; i++) {
          int val = scanner.nextInt();
          vals[val]++;
        }

      	double result = solve(n, vals);
      
        System.out.println(result);
    }
}
