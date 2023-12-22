import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			scan.nextLine();
			for(int i=0; i<n; i++) {
				String x = scan.nextLine();
				String y = scan.nextLine();
				int ans = solve(x, y);
				System.out.println(ans);
			}
		}
	}
	
	private static int solve(String x, String y) {
		int[][] dp = new int[x.length()+1][y.length()+1];
		for(int i=1; i<=x.length(); i++) {
			for(int j=1; j<=y.length(); j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[x.length()][y.length()];
	}
}

