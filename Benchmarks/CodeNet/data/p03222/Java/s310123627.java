import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	static int ans = 0;
	final int MOD = 1000000007;
	void doIt() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		int K = sc.nextInt();
		int dp[][] = new int[h + 1][w];
		for(int i = 0; i < w; i++)Arrays.fill(dp[i],0);
		dp[0][0] = 1;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				//kのビットパターン：横棒
				for(int k = 0; k < 1 << (w - 1); k++) {
					if(validate(k, w)) {
						if(j >= 1 && ((k >> (j - 1)) & 1) == 1) {
							dp[i + 1][j - 1] += dp[i][j];
							dp[i + 1][j - 1] %= MOD;
						}
						else if(j < w - 1 && (k >> j & 1) == 1) {
							dp[i + 1][j + 1] += dp[i][j];
							dp[i + 1][j + 1] %= MOD;
						}
						else {
							dp[i + 1][j] += dp[i][j];
							dp[i + 1][j] %= MOD;
						}
					}
				}
			}
		}
		System.out.println(dp[h][K - 1]);
	}
	
	boolean validate(int num, int w) {
		//validであるかどうかを返す。
		int n = num;
		for(int i = 0; i < 1 << (w - 2); i++) {
			if(((n >> i) & 1) == ((n >> (i + 1)) & 1)){
				return false;
			}
		}
		return true;
	}
	
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}
}

