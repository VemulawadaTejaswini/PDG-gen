import java.util.Scanner;

public class Main {
	
	private static void solve(String s, String t) {
		
		int sl = s.length();
		int tl = t.length();
		
		int[][] dp = new int[sl+1][tl+1];
		String[][] subseq = new String[sl+1][tl+1];
		
		for (int i=0; i<sl; i++) {
			subseq[i][0] = "";
		}
		
		for (int i=0; i<tl; i++) {
			subseq[0][i] = "";
		}
		
		for (int i=1; i<=sl; i++) {
			for (int j=1; j<=tl; j++) {
				
				if (s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
					subseq[i][j] = subseq[i-1][j-1] + s.charAt(i-1);
				}
				else if (dp[i-1][j] > dp[i][j-1]) {
					dp[i][j] = dp[i-1][j];
					subseq[i][j] = subseq[i-1][j];
				}
				else {
					dp[i][j] = dp[i][j-1];
					subseq[i][j] = subseq[i][j-1];
				}
			}
		}
		
		System.out.println(subseq[sl][tl]);
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		String t = scanner.next();
	
		solve( s, t);
		
		scanner.close();
	}

}
 