import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int n = s1.length();
		int m = s2.length();
		
		int dp [][] = new int [n+1][m+1];
		
		for (int i=1; i<n+1; i++) dp[i][0]=i;
		for (int j=1; j<m+1; j++) dp[0][j]=j;
		
		int cost=0;
		for (int i=1; i<n+1; i++){
			for (int j=1; j<m+1; j++){
				if (s1.charAt(i-1)==s2.charAt(j-1)) cost=0;
				else cost=1;
				dp[i][j]=Math.min(Math.min(dp[i-1][j]+1, dp[i][j-1]+1), dp[i-1][j-1]+cost);
			}
		}
		System.out.println(dp[n][m]);
	}
}