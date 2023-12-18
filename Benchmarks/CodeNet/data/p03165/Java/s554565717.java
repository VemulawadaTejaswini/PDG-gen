import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    int S = s.length();
    int T = t.length();
    int[][] dp = new int[S+1][T+1];
    
    for(int i = 0; i <= S; i++){
      for(int j = 0; j <= T; j++){
        if(i == 0 || j == 0){
          dp[i][j] = 0;
        }else if(s.charAt(i-1) == t.charAt(j-1)){
          dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
        }else{
          dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
          dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
        }
      }
    }
    int i = S;
    int j = T;
    String ans = "";
    while(i > 0 && j > 0){
      if(dp[i][j] == dp[i-1][j]){
        i--;
      }else if(dp[i][j] == dp[i][j-1]){
        j--;
      }else{
        ans = String.valueOf(s.charAt(i-1)) + ans;
        i--;
        j--;
      }
    }
    System.out.println(ans);
  }
}