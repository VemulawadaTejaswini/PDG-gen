import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++) arr[i] = scn.nextInt();
    int[] dp = new int[n];
    Arrays.fill(dp , Integer.MAX_VALUE);
    dp[0] = 0;
    for(int i = 0 ; i < n ; i++){
      for(int j = i + 1 ; j <= i + 2 ; j++){
        if(j < n){
          dp[j] = Math.min(dp[j] , dp[i] + Math.abs(arr[i] - arr[i]));
        }
      }
    }
    System.out.println(Math.min(dp[0] , dp[1]));
  }
}
