import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] hiki = scan.nextLine().split(" ");
    int n = Integer.parseInt(hiki[0]);
    int k = Integer.parseInt(hiki[1]);
    int[] cost = new int[n];
    int[] dp = new int[n];
    hiki = scan.nextLine().split(" ");
    for(int i = 0;i < n;i++){
      cost[i] = Integer.parseInt(hiki[i]);
      dp[i]=Integer.MAX_VALUE;
    }
    dp[0]=0;
    for(int i = 1;i < n;i++){
      for(int j = 1;j < Math.min(i,k)+1;j ++){
        dp[i] = Math.min(dp[i],
        dp[i-j]+Math.abs(cost[i]-cost[i-j]));
      }
    }
    System.out.println(dp[n-1]);
  }
}
