import java.util.*;
public class Main {
		static int Count(char str[], int n){
          int dp[][] = new int[n][n];
          
          boolean p[][] = new boolean[n][n];
          for(int i = 0 ; i<n; i++){
            p[]i[i] = true;
          }
          for(int i =0 ; i<n ;i++){
            if(str[i] == str[i+1]){
             p[i][i+1] = true;
             dp[i][i+1] = 1; 
            }
          }
          for (int gap = 2 ; gap<n ; i++){
            for(int i = 0 ; i<n-gap ; i++){
              int j = gap + i;
              if(str[i] == str[j] && P[i+1][j-1])
                p[i][j] = true;
              if (P[i][j] == true) 
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1 - dp[i+1][j-1]; 
                else
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
            }  
          }  
          return dp[0][n-1];
        }
  public static void main(String[] args) 
    { 
        Scanner sc = new (System.in);
        String str = sc.next(); 
        System.out.println(CountPS(str.toCharArray(), str.length())); 
    } 
  
}