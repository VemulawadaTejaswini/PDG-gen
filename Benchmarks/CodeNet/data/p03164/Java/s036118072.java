import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] hiki = scan.nextLine().split(" ");
    int n = Integer.parseInt(hiki[0]);
    int w = Integer.parseInt(hiki[1]);
    int[] weight = new int[n];
    int[] value = new int[n];
    for(int i = 0;i < n;i ++){
      hiki = scan.nextLine().split(" ");
      weight[i] = Integer.parseInt(hiki[0]);
      value[i] = Integer.parseInt(hiki[1]);
    }
    long[][] dp = new long[n][100010];
    dp[0][value[0]]=weight[0];
    for(int i = 1;i < n;i ++){
      for(int j = 0;j < 100010;j ++){
        if(dp[i-1][j] > 0){
          dp[i][j] = Math.min(dp[i-1][j], dp[i][j]);
          if(dp[i-1][j]+weight[i] <= w)
          	dp[i][j+value[i]] = Math.min(dp[i-1][j] + weight[i], dp[i][j+value[i]]);
        }
      }
      dp[i][value[i]] = Math.min(weight[i], dp[i][weight[i]]);
    }
    long max = 0;
    for(int i = 0;i < 100010;i ++){
      if(dp[n-1][i] > 0) max = i;
    }
    System.out.println(max);
  }
}
