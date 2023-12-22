
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			int[][] dp = new int[n+1][n+1];
			int max = 0;
			for(int i=1;i<=n;i++) {
				String line = sc.next();
				for(int j=1;j<=n;j++) if( line.charAt(j-1) == '.' ) {
					dp[i][j] = min( min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1] ) + 1;
					max = max(max, dp[i][j]);
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}