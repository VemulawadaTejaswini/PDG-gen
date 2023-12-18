import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int N = Integer.parseInt(S[1]);
    
    int[][] val = new int[N][2];
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      val[i][0] = Integer.parseInt(T[0]);
      val[i][1] = Integer.parseInt(T[1]);
    }
    
    int[][] dp = new int[N+1][H+1];
    Arrays.fill(dp[0], 10000000);
    dp[0][0] = 0;
    for(int i = 1; i <= N; i++){
      int hp = val[i-1][0];
      int mp = val[i-1][1];
      for(int j = 1; j <= H; j++){
        int k = j-hp;
        if(k <= 0){
          dp[i][j] = Math.min(mp, dp[i-1][j]);
        }else{
      	  dp[i][j] = Math.min(dp[i][k]+mp, dp[i-1][j]);
        }
      }
    }
    System.out.println(dp[N][H]);
  }
}