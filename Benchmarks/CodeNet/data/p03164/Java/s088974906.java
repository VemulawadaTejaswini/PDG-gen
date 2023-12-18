import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w = sc.nextInt();
    int weight[] = new int[n];
    int value[] = new int[n];
    for(int i=0;i<n;i++){
      weight[i]=sc.nextInt();
      value[i]=sc.nextInt();
    }
    long dp[][]=new long[n+1][w+1];
    for(int i=0;i<=w;i++){
      dp[0][i]=0;
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<=w;j++){
        if(j >= weight[i]){
          dp[i+1][j] = Math.max(dp[i][j-weight[i]] + (long)value[i], dp[i][j]);
        }else{
           dp[i+1][j] = dp[i][j];
        }
      }
    }
    System.out.print(dp[n][w]);            
  }
  

  
}
