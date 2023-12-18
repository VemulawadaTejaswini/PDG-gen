import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      String S = in.nextLine();
      String T = in.nextLine();
      int lenS = S.length();
      int lenT = T.length();
      String[][] dp = new String[lenS+1][lenT+1];
      for(int i=0; i<=lenS; i++){
        for(int j=0; j<=lenT; j++){
          dp[i][j] = "";
        }
      }
      for (int i = 1; i <= lenS; i++) {
        for(int j=1; j<=lenT; j++){
          String str1 = dp[i-1][j-1];
          String str2 = dp[i-1][j];
          String str3 = dp[i][j-1];
          if(S.charAt(i-1) == T.charAt(j-1))
            dp[i][j] = str1 + S.charAt(i-1);
          else
            dp[i][j] = (str2.length() > str3.length()) ? str2 : str3;
        }
      }
      System.out.println(dp[lenS][lenT]);
	}
}