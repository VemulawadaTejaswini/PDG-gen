
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m) == 0) break;
			int[] ys = new int[n];
			int[] cs = new int[m];
			for(int i=0;i<m;i++) cs[i] = sc.nextInt();
			for(int i=0;i<n;i++) ys[i] = sc.nextInt();
			int[][] dp = new int[n+1][256];
			for(int[] a: dp) fill(a, INF);
			fill(dp[0], 0);
			for(int i=0;i<n;i++) for(int j=0;j<m;j++) for(int y=0;y<256;y++) {
				int tmp = max(0, min(255, y+cs[j]));
				dp[i+1][tmp] 
				  = min(dp[i+1][tmp], dp[i][y] + (tmp - ys[i]) * (tmp - ys[i]) );
//				if(y==255) debug(dp[i+1]);
			}
			int ans = INF;
			for(int i=0;i<256;i++) ans = min(ans, dp[n][i]);
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}