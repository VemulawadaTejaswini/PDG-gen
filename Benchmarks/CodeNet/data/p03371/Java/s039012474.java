import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[][] dp = new int[x+1][y+1];
    for(int i=0; i<x+1; i++){
      for(int j=0; j<y+1;j++){
        if(i==0&&j==0) dp[i][j] = 0;
        else dp[i][j] = 1000007;
      }
    }

    for(int i=0; i<x+1; i++){
      for(int j=0; j<y+1; j++){
        if(i+1<x+1)dp[i+1][j] = Math.min(dp[i+1][j],dp[i][j] + A);
        if(j+1<y+1)dp[i][j+1] = Math.min(dp[i][j+1],dp[i][j] + B);
        if(i+1<x+1&&j+1<y+1) dp[i+1][j+1] = Math.min(dp[i+1][j+1],dp[i][j]+ 2*C);
      }
    }
    System.out.println(dp[x][y]);
  }
}