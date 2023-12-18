import java.io.*;
import java.util.*;
public class Main{
  	public static int max = 1000000009;
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      char grid[][] = new char[r][c];
      
      for(int i=0;i<r;i++){
        String row = sc.next();
        for(int j=0;j<c; j++){
          grid[i][j] = row.charAt(j);
        }
      }
    
      
      System.out.println(countPath(grid,  r,  c));
      
      /*
      String dp[][] =  new String[n.length()][m.length()];
      System.out.println(sub(n, m , 0, 0, dp));
      */
    }
  
  public static int countPath(char grid[][], int r, int c){
    int dp[][] = new int[r][c];
    dp[r-1][c-1] = 1;
      for(int i=r-2; i>=0; i--)
        dp[i][c-1] = grid[i][c-1]=='.' && dp[i+1][c-1] == 1 ? 1 : 0;
    
      for(int j=c-2; j>=0; j--)
        dp[r-1][j] = grid[r-1][j]=='.' && dp[r-1][j+1] == 1 ? 1 : 0;
    
     for(int i=r-2; i>=0; i--){
       for(int j=c-2; j>=0; j--){
       		if(grid[i][j] != '.') 
               dp[i][j] = 0;
         dp[i][j] = (dp[i+1][j] % max + dp[i][j+1]%max)%max;
       }
     }
      return dp[0][0];
  }
   
}
