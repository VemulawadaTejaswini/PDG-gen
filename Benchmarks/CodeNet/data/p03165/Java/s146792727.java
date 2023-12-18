

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int dp[][] = new int[s.length()+1][t.length()+1];
		int g[][] = new int[s.length()+1][t.length()+1];
		
		for (int i=1;i<=s.length();i++)
			for (int j=1;j<=t.length();j++) {
				char a = s.charAt(i-1);
				char b = t.charAt(j-1);
				dp[i][j] = dp[i-1][j];
				if (dp[i][j] < dp[i][j-1]) {
					dp[i][j] = dp[i][j-1];
					g[i][j] = 1;
				}
				
				if (a==b && dp[i][j] < dp[i-1][j-1]+1) {
					dp[i][j] = dp[i-1][j-1]+1;
					g[i][j] =2;
				}
			}
		int i = s.length();
		int j = t.length();
		String r = "";
		while (i>0 || j>0) {
			if (g[i][j]==2) {
				r=s.charAt(i-1)+r;
				i--;
				j--;
			} 
			if (g[i][j]==1) j--;
			if (g[i][j]==0) i--;
			if (i<0 || j<0) break;
		}
		System.out.println(r);
	}
}
