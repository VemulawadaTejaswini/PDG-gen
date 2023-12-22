import java.util.Scanner;


public class Main {
	int m, n;
	char[][] map;
	Scanner in = new Scanner(System.in);
	
	String remove_zero(String s) {
		int k;
		for (k = 0; k < s.length(); k++) {
			if (s.charAt(k) != '0') break;
		}
		return s.substring(k, s.length()); 
	}
	
	boolean compare(String s1, String s2) {
		if (s1.length() > s2.length()) return true;
		else if (s1.length() < s2.length()) return false;
		else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) > s2.charAt(i)) return true;
				else if (s1.charAt(i) < s2.charAt(i)) return false;
			}
		}
		return true;
	}
	
	public Main() {
		while (true) {
			int m = in.nextInt();
			int n = in.nextInt();
			if (m == 0 && n == 0) break;
			map = new char[n+1][m+1];
			for (int i = 1; i <= n; i++) {
				String s = in.next();
				for (int j = 0; j < m; j++) {
					map[i][j+1] = s.charAt(j);
				}
			}
			String[][] dp = new String[n+1][m+1];
			for (int i = 0; i <= n; i++) 
				for (int j = 0; j <= m; j++) 
					dp[i][j] = "";
				
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					if (map[i][j] >= 'A' && map[i][j] <= 'Z' || map[i][j] == 0)
						continue;
					else {
						dp[i][j] = (compare(dp[i][j-1] + map[i][j], dp[i][j])) ? dp[i][j-1] + map[i][j] : dp[i][j];
						dp[i][j] = (compare(dp[i-1][j] + map[i][j], dp[i][j])) ? dp[i-1][j] + map[i][j] : dp[i][j];
					}
				}
			}
			String ans = "";
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					ans = remove_zero(ans);
					if (compare(dp[i][j], ans))
						ans = dp[i][j];
				}
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}