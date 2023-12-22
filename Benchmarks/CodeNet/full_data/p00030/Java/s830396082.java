import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[][][] dp = new int[11][100][11];
	
	public static void main(String[] args) {
		int s,n;
		while(true) {
			n = sc.nextInt(); s = sc.nextInt();
			if(n == 0 && s == 0) break;
			for(int i = 0; i < 11; i++) 
				for(int j = 0; j < 100; j++)
					Arrays.fill(dp[i][j], -1);
			System.out.println(rec(n, s, 0));
		}
	}
	
	static int rec(int n, int s, int i) {
		if(n < 0 || s < 0 || i > 10) return 0;
		if(dp[n][s][i] >= 0) return dp[n][s][i];
		if(n == 0 && s == 0) return 1;
		int res = 0;
		for(int j = i; j <= 9; j++) {
			res += rec(n-1, s-j, j+1);
		}
		dp[n][s][i] = res;
		return res;
	}
}