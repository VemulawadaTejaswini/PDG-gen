import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][3];
    for(int i=0;i<n;i++){
      String[] s = br.readLine().split(" ");
      arr[i][0] = Integer.parseInt(s[0]);
      arr[i][1] = Integer.parseInt(s[1]);
      arr[i][2] = Integer.parseInt(s[2]);
      System.out.println(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]);
    }
    int[][] dp = new int[n][3];
    int max = 0;
    
    for(int i=0;i<3;i++){
      dp[0][i] = arr[0][i];
      max = Math.max(max,arr[0][i]);
    }
    
    if(n==1)
      System.out.println(max);
    else{
      for(int i=1;i<n;i++){
        dp[i][0] = arr[i][0] + Math.max(arr[i-1][1],arr[i-1][2]);
        dp[i][1] = arr[i][1] + Math.max(arr[i-1][0],arr[i-1][2]);
        dp[i][2] = arr[i][2] + Math.max(arr[i-1][0],arr[i-1][1]);
      }
    
    
    for(int i=0;i<3;i++){
      max = Math.max(max,dp[n-1][i]);
    }
    System.out.println(max);
    }
  }
}
