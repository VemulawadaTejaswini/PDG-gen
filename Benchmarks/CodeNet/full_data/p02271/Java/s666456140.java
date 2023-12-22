import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int n, m;
	private static int[] a, b;
	private static int[][] dp;
	
	public static void main(String[] args) {
		inputData();
		solve();
	}
	
	private static void inputData() {
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
			a = new int[n];
			for(int i=0; i<n; i++) a[i] = scan.nextInt();
			m = scan.nextInt();
			b = new int[m];
			for(int i=0; i<m; i++) b[i] = scan.nextInt();
		}
		for(int[] row : dp) Arrays.fill(row, -1);
	}
	
	private static void solve() {
		for(int i=0; i<m; i++) {
			if(serchNumber(0, b[i]) == 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	
	private static int serchNumber(int i, int m) {
		if(dp[i][m] != -1) return dp[i][m];
		     if(m == 0)                        dp[i][m] = 1;
		else if(m < 0)                         dp[i][m] = 0;
		else if(i == n)                        dp[i][m] = 0;
		else if(serchNumber(i+1, m) == 1)      dp[i][m] = 1;
		else if(serchNumber(i+1, m-a[i]) == 1) dp[i][m] = 1;
		else                                   dp[i][m] = 0;     
		return dp[i][m];     
	}
}

