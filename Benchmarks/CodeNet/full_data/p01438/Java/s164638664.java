import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int INF = -1;
		int l = 1<<16;
		long[] sat = new long[100];
		int[] time = new int[100];
		long[][] dp = new long[101][l];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				sat[i] = time[i] = 0;
				Arrays.fill(dp[i], INF);
			}
			Arrays.fill(dp[n], INF);
			
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				sat[i] = sc.nextInt();
				for (int j = 0; j < m; j++) {
					int s = sc.nextInt()-6, e = sc.nextInt()-6;
					for (int k = s; k < e; k++) {
						time[i] += (1 << s);
					}
				}
			}
			
			dp[0][0] = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < l; j++) {
					if (dp[i][j] != INF) {
						dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
						if ((j & time[i]) == 0) {
							dp[i+1][j|time[i]] = Math.max(dp[i+1][j|time[i]], dp[i][j]+sat[i]);
						}
					}
				}
			}
			long res = 0;
			for (int i = 0; i < l; i++)
				res = Math.max(res, dp[n][i]);
			
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}