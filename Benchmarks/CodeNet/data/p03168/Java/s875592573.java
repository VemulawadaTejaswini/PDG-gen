import java.util.*;
 
public class Main{
  public static int[] dp;
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] s = sc.nextLine().split(" ");
    double[] p = new double[N];
    for(int i = 0; i< N; i++){
      p[i] = Double.parseDouble(s[i]);
    }
    
    double[][] dp = new double[N+1][N+1];
    dp[0][0] = 1.0;
    
    for(int i = 0; i < N; i++){
      for(int j = 0; j <= i; j++){
        dp[i+1][j+1] += dp[i][j] * p[i];
        dp[i+1][j] += dp[i][j] * (1.0 - p[i]);
      }
    }
    double ans = 0.0;
    for(int i = (N/2)+1; i <= N; i++){
      ans += dp[N][i];
    }
    System.out.println(ans);
  }
}