
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int m = 100000;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if( (w|h) == 0) break;
			int[][][][] dp = new int[h+1][w+1][2][2];
			dp[1][0][0][1] = dp[0][1][1][1] = 1;
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				dp[i][j][0][0] = (dp[i][j-1][0][0]+dp[i][j-1][0][1])%m;
				dp[i][j][1][0] = (dp[i-1][j][1][0]+dp[i-1][j][1][1])%m;
				dp[i][j][0][1] = dp[i-1][j][1][0]%m;
				dp[i][j][1][1] = dp[i][j-1][0][0]%m;
//				debug(i, j, dp[i][j]);
			}
			System.out.println( ( dp[h][w][0][0] + dp[h][w][1][0] )%m );
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}