import java.util.*;

public class Main {
	static String[][] dp;
	static String[] arr;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		arr = new String[n];
		dp = new String[n + 1][k + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		System.out.println(dfs(n, k));
	}
	
	static String dfs(int n, int k) {
		if (n < 0 || k < 0) {
			return null;
		}
		if (k == 0) {
			return "";
		}
		if (n == 0) {
			return null;
		}
		if (dp[n][k] != null) {
			return dp[n][k];
		}
		String s1 = dfs(n - 1, k);
		String s2 = dfs(n - 1, k - arr[n - 1].length()) + arr[n - 1];
		if (s1 == null) {
			return s2;
		}
		if (s2 == null) {
			return s1;
		}
		if (s1.compareTo(s2) <= 0) {
			return s1;
		} else {
			return s2;
		}
	}
}
