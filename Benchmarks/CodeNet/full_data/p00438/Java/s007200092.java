import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    new Main();
  }
  public Main(){
    Scanner sc = new Scanner(System.in);
    while(true){
      int w = sc.nextInt();
      int h = sc.nextInt();
      if(h==0 && w==0)break;
      int[][] dp = new int[h][w];
      dp[0][0] = 1;
      int n = sc.nextInt();
      while(n-->0){
        int x = sc.nextInt();
        int y = sc.nextInt();
        dp[y-1][x-1] = -1;
      }
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          if(dp[i][j]==-1)continue;
          if(i>0 && dp[i-1][j]!=-1) dp[i][j] += dp[i-1][j];
          if(j>0 && dp[i][j-1]!=-1) dp[i][j] += dp[i][j-1];
        }
      }
      System.out.println(dp[h-1][w-1]);
    }
  }
}