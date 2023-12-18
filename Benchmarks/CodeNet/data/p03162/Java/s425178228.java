import java.util.*;
public class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[][] = new int[n][3];
      int dp[][] = new int[n][3];
      for(int i=0; i<n; i++){
          for(int j=0; j<3; j++){
              arr[i][j] = in.nextInt();
          }
      }
      for(int i=0; i<n; i++){
          for(int j=0; j<3; j++){
              if(i==0){
                  dp[i][j]= arr[i][j];
              }
              else{
                  int max =Integer.MIN_VALUE;
                  if(j==0){
                      max = Math.max(dp[i-1][j+1],dp[i-1][j+2]);
                  }
                  else if(j==1){
                      max = Math.max(dp[i-1][j-1],dp[i-1][j+1]);
                  }
                  else if(j==2){
                      max = Math.max(dp[i-1][j-2],dp[i-1][j-1]);
                  }
                  dp[i][j] = arr[i][j]+max;
                  
                  
              }
          }
      }
      
      int max_res = Integer.MIN_VALUE;
      for(int i=0; i<3; i++){
          max_res = Math.max(dp[n-1][i], max_res);
      }
      System.out.println(max_res);
     
      
    }
}