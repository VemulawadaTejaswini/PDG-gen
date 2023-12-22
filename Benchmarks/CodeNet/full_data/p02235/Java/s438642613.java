import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int n;
	private static char[] x, y;
	private static int[][] dp;
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
			scan.nextLine();
			for(int i=0; i<n; i++) {
				x = scan.nextLine().toCharArray();
				y = scan.nextLine().toCharArray();
				int xLen = x.length;
				int yLen = y.length;
				dp = new int[xLen+1][yLen+1];
				for(int[] row : dp) Arrays.fill(row, -1);
				System.out.println(lcs(xLen-1, yLen-1));
			}
		}
	}
	
	private static int lcs(int i, int j) {
		if(i < 0 || j < 0) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		     if(x[i] == y[j]) dp[i][j] = lcs(i-1, j-1) + 1;
		else if(x[i] != y[j]) dp[i][j] = Math.max(lcs(i-1, j), lcs(i, j-1));
		return dp[i][j];
	}
}

