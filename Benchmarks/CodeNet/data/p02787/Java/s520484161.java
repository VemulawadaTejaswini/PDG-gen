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
    
    int[][] dp = new int[N+1][H*2+1];
    Arrays.fill(dp[0], 10000000);
    for(int i = 0; i <= N; i++){
      dp[i][0] = 100000000;
    }
    for(int i = 1; i <= N; i++){
      int hp = val[i-1][0];
      int mp = val[i-1][1];
      for(int j = 1; j <= H*2; j++){
        int k = Math.max(j-hp, 0);
        int p = 10000000;
        for(int l = 1; l <= i; l++){
          p = p > dp[l][k]+mp ? dp[l][k]+mp : p;
        }
        dp[i][j] = Math.min(Math.min(p, dp[i-1][j]), mp*((j+hp-1)/hp));
      }
    }
    int ans = dp[N][H];
    for(int i = H; i <= H*2; i++){
      if(ans > dp[N][i]){
        ans = dp[N][i];
      }
    }
    System.out.println(ans);
  }
}