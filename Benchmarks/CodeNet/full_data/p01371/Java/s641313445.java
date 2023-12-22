import java.util.*;
import static java.lang.System.*;

public class Main {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[][] t = new int[n][n+1];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n+1; j++) {
					t[i][j] = sc.nextInt();
				}
			}
			
			int[] dp = new int[1<<n];
			Arrays.fill(dp, Integer.MAX_VALUE);
			dp[0] = 0;
			
			for (int i = 0; i < (1<<n); i++) {
				
				for (int j = 0; j < n; j++) {
					if ((i & (1<<j)) == 0) continue;
					int min = t[j][0];
					for (int k = 0; k < n; k++) {
						if (k != j && (i & (1<<k)) > 0)
							min = Math.min(min, t[j][k+1]);
					}
					dp[i] = Math.min(dp[i], dp[i^(1<<j)]+min);
				}
			}
			
			out.println(dp[(1<<n)-1]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}