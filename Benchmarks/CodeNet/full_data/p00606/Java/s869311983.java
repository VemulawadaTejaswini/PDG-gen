import java.math.BigDecimal;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static char s, t, b;
	static int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1};
	
	public static void main(String[] args) {
		while (read()) {
			solve();
		}
	}

	static boolean read() {
		n = sc.nextInt();
		if (n == 0) return false;
		
		s = sc.next().charAt(0);
		t = sc.next().charAt(0);
		b = sc.next().charAt(0);
		
		return true;
	}

	static void solve() {
		double[][][] dp = new double[n + 1][5][5];
		for (int i = 0; i <= n; i++) { 
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					dp[i][j][k] = 0.0;
				}
			}
		}
	
		int pos_s = s - 'A', pos_t = t - 'A', pos_b = b - 'A';
		int sx = pos_s % 3 + 1, sy = pos_s / 3 + 1;
		int gx = pos_t % 3 + 1, gy = pos_t / 3 + 1;
		int bx = pos_b % 3 + 1, by = pos_b / 3 + 1;
		
		dp[n][sy][sx] = 1.0;
		
		for (int i = n; i > 0; i--) {
			for (int y = 1; y <= 3; y++) {
				for (int x = 1; x <= 3; x++) {
					for (int l = 0; l < 4; l++) {
						int ty = y + dy[l], tx = x + dx[l];
						if (((ty == by) && (tx == bx)) || (tx == 0 || tx == 4 || ty == 0 || ty == 4)){
							ty = y; tx = x;
						}
						dp[i - 1][ty][tx] += dp[i][y][x] * 0.25; 
					}
				}
			}
		}
		
		System.out.printf("%.8f", dp[0][gy][gx]);
		System.out.println();
	}
}