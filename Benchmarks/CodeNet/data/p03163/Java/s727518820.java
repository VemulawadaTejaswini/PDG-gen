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
    int[][] dp=new int[n+1][w+1];
    for(int i=1;i<=n;i++){
      for(int j=1;j<=w;j++){
        if(weights[i]>j){
          dp[i][j]=dp[i-1][j];
        }
        else{
          dp[i][j]=Math.max(dp[i-1][j],value[j]+dp[i-1][j-weights[i]]);
        }
      }
    }
      System.out.println(dp[n][w]);
    }
  }
  
        
        
    
    
      