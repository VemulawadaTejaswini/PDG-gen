import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int w=s.nextInt();
    int[] weights=new int[n];
    int[] value=new int[n];
    for(int i=0;i<n;i++){
      weights[i]=s.nextInt();
      value[i]=s.nextInt();
    }
    long[][] dp=new long[n+1][w+1];
    for(int i=1;i<=n;i++){
      for(int j=1;j<=w;j++){
        if(weights[i-1]>j){
          dp[i][j]=dp[i-1][j];
        }
        else{
          dp[i][j]=Math.max(dp[i-1][j],value[i-1]+dp[i-1][j-weights[i-1]]);
        }
      }
    }
    long max=Long.MIN_VALUE;
    for(int i=1;i<=w;i++)
      max=Math.max(dp[n][i],max);
      System.out.println(max);
    }
  }
  