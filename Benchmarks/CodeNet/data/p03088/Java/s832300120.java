import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 3) {
		    System.out.println(61);
		    return;
		}
		int[][][][] dp = new int[n + 1][4][4][4];
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		        for (int k = 0; k < 4; k++) {
		            dp[3][i][j][k] = 1;
		        }
		    }
		}
		for (int a = 4; a <= n; a++) {
    		for (int i = 0; i < 4; i++) {
    		    for (int j = 0; j < 4; j++) {
    		        for (int k = 0; k < 4; k++) {
    		            for (int l = 0; l < 4; l++) {
    		                if (checkNum(i, j, k, l)) {
    		                    continue;
    		                }
    		                dp[a][j][k][l] += dp[a - 1][i][j][k];
    		                dp[a][j][k][l] %= MOD;
    		            }
    		        }
    		    }
    		}
		}
		int ans = 0;
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		        for (int k = 0; k < 4; k++) {
		            ans += dp[n][i][j][k];
		            ans %= MOD;
		        }
		    }
		}
		System.out.println(ans);
    }
    
    static boolean checkNum(int a, int b, int c, int d) {
        return ((a == 0 && b == 1 && c == 2) ||
            (b == 0 && c == 1 && d == 2) ||
            (b == 0 && a == 1 && c == 2) ||
            (a == 0 && c == 1 && d == 2) ||
            (a == 0 && c == 1 && b == 2) ||
            (c == 0 && b == 1 && d == 2) ||
            (a == 0 && b == 1 && d == 2) ||
            (b == 0 && d == 1 && c == 2));
    }
}

