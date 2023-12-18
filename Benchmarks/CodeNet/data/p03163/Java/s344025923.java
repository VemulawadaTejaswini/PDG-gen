import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    int[] weight = new int[N];
    int[] value = new int[N];
    for(int i = 0; i < N; i++){
      String[] t = sc.nextLine().split(" ");
      weight[i] = Integer.parseInt(t[0]);
      value[i] = Integer.parseInt(t[1]);
    }
    
    int[][] dp = new int[N+1][W+1];
    for(int i = 0; i <= N; i++){
      for(int j = 0; j <= W; j++){
        if(i == 0 || j == 0){
          dp[i][j] = 0;
        }else if(weight[i-1] > j){
          dp[i][j] = dp[i-1][j];
        }else{
          dp[i][j] = Math.max(dp[i-1][j], value[i-1]+dp[i-1][j-weight[i-1]]);
        }
      }
    }
    System.out.println(dp[N][W]);
  }
}