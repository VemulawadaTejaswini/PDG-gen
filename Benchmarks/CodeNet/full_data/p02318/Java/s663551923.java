import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		String s2 = br.readLine();

		int len1 = s1.length();
		int len2 = s2.length();

		int[][] dp = new int[len1+1][len2+1];

		for (int i=0; i<len1; i++)
			dp[i][0] = i;

		for (int j=0; j<len2; j++)
			dp[0][j] = j;

		for (int i=1; i<=len1; i++) {
			for (int j=1; j<=len2; j++) {
				dp[i][j] = dp[i-1][j-1] + (s1.charAt(i-1) == s2.charAt(j-1) ? 0 : 1);
				dp[i][j] = Math.min(dp[i][j],Math.min(dp[i-1][j]+1,dp[i][j-1]+1));
			}
		}

		System.out.println(dp[len1][len2]);

		br.close();
	}
}