
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	int[][] t;
	int[] dp;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if( n == 0 ) break;
			t = new int[n][n+1];
			for(int i=0;i<n;i++) for(int j=0;j<=n;j++) {
				t[i][j] = sc.nextInt();
			}
			
			dp = new int[1<<n];
			fill(dp, -1);
			System.out.println(solve( (1<<n)-1 ));
			
		}
	}
	
	int solve(int S) {
		if( dp[S] >= 0 ) return dp[S];
		if( S == 0 ) return dp[S] = 0;
		int min = INF;
		for(int i=0;i<n;i++) if( ((S>>i)&1) == 1 ) {
			int v = t[i][0];
			for(int j=0;j<n;j++) if( i!=j && ((S>>j)&1) == 1 ){
				v = min(v, t[i][j+1]);
			}
			
			min = min(min, v + solve(S-(1<<i)));
		}
		
		return dp[S] = min;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}