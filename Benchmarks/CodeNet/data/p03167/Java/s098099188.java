import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;
	
	void doIt() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		int dp[][] = new int[h + 1][w + 1];
		for(int i = 0; i < h; i++){
			char c[] = sc.next().toCharArray();
			for(int j = 0; j < w; j++) {
				if(c[j] == '#')dp[i][j] = -1;
			}
			dp[i][w] = -1;
		}
		Arrays.fill(dp[h], -1);
		dp[0][0] = 1;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(dp[i][j] < 0)continue;
				if(dp[i + 1][j] >= 0) dp[i + 1][j] += dp[i][j];
				dp[i + 1][j] %= MOD;
				if(dp[i][j + 1] >= 0) dp[i][j + 1] += dp[i][j];
				dp[i][j + 1] %= MOD;

			}
			
		}
		//for(int i = 0; i <= h; i++)
		//	System.out.println(Arrays.toString(dp[i]));
		System.out.println(dp[h - 1][w - 1]);
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
