import java.util.*;

public class Main {
    public static double solve(int n, int[] amount) {
      int limit = 301;
      // MR new int[1001], idk how to calc it properly, 300 should be enough
      double[][][] dp = new double[limit][limit / 2][limit / 3];
      
      for(int i = 0; i < limit; i++) {
        for(int j = 0; j < limit / 2; j++) {
            Arrays.fill(dp[i][j],-1);
        }
      }
      
      double result = dfs(dp, n, amount[1], amount[2], amount[3]);
      
      return result;
    }
  
  	private static double dfs (double[][][] dp, int n, int oneSushi, int twoSushi, int threeSushi){
      if(oneSushi == 0 && twoSushi == 0 && threeSushi == 0){
        return 0;
      }
      if(dp[oneSushi][twoSushi][threeSushi] != -1) {
        return dp[oneSushi][twoSushi][threeSushi];
      }
      
      double prob = (double) n / (oneSushi + twoSushi + threeSushi);
      double result = 0;
      
      int sum = oneSushi + twoSushi + threeSushi;
      if (oneSushi > 0){
        result += (prob + dfs(dp, n, oneSushi - 1, twoSushi, threeSushi)) * oneSushi / sum;
      }
      
      if (twoSushi > 0) {
        //if we take one sushi from the plate with two, there would be one additional 
        //table with one sushi, hence oneSushi+1, twoSushi -1
        result += (prob + dfs(dp, n, oneSushi + 1, twoSushi - 1, threeSushi)) * twoSushi / sum;
      }
      if(threeSushi > 0) {
        //same logic here, once we pick up from c, the result would be twoSushi+1, threeSushi-1
        result += (prob + dfs(dp, n, oneSushi, twoSushi + 1,threeSushi-1)) * threeSushi / sum; 
      }
      
      dp[oneSushi][twoSushi][threeSushi] = result;
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
