import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		String ans = solve(a,b);
		
		System.out.println(ans);
	}

	private static String solve(String a, String b) {
		
		int[][] lcs = getLcs(a,b);
		
		int n = a.length();
		int m = b.length();
		
		StringBuilder sb = new StringBuilder();
		
		while(n>0 && m>0) {
			if(a.charAt(n-1)==b.charAt(m-1)) {
				sb.append(a.charAt(n-1));
				n--;
				m--;
			}else {
				if(lcs[n][m-1]>lcs[n-1][m])
					m--;
				else
					n--;
			}
		}
		
		return sb.reverse().toString();
	}

	private static int[][] getLcs(String a, String b) {
		
		int[][] dp = new int[a.length()+1][b.length()+1];
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(a.charAt(i-1)==b.charAt(j-1))
					dp[i][j] = 1+dp[i-1][j-1];
				else
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		
		return dp;
	}
}