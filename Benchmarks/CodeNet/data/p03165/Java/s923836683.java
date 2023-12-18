import java.io.*;
import java.util.*;
public class Main{
  	
	public static void main(String args[]) throws IOException{
      Scanner sc = new Scanner(System.in);
      String n = sc.next();
      String m = sc.next();
      
      String dp[][] =  new String[n.length()][m.length()];
      System.out.println(sub(n, m , 0, 0, dp));
      
    }
  
  public static String sub(String n, String m, int pos1, int pos2, String dp[][]){
    
    dp[n.length() -1][m.length() -1] = n.charAt(n.length() -1) == m.charAt(m.length() -1)? n.charAt(n.length() -1)+"" : "";
    
    
  	for(int i=m.length-2;i>=0; i--)
      dp[n.length()-1][i] = n.charAt(n.length() -1) == m.charAt(i) ? n.charAt(n.length() -1) + ""  : dp[n.length()-1][i+1];
    
    for(int i=n.length-2;i>=0; i--)
      dp[i][m.length()-1] = n.charAt(i) == m.charAt(m.length()-1)? n.charAt(i) + ""  : dp[i+1][m.length()-1];
    
    for(int i=n.length()-2; i>=0; i--){
      for(int j = m.length()-2; j>=0; j--){
        dp[i][j] = n.charAt(i) == m.charAt(j)? n.charAt(i)+dp[i+1][j+1] : (dp[i+1][j].length() > dp[i][j+1].length())? dp[i+1][j] : dp[i][j+1];
      }
  }
}
