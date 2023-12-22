import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static final int INF = 1 << 25;
	static int N, M, S, G1, G2;
	static int[][] W = new int[101][101];
	static boolean read() {
		N = sc.nextInt();
		M = sc.nextInt();
		S = sc.nextInt();
		G1 = sc.nextInt();
		G2 = sc.nextInt();
		if (N == 0 && M == 0) return false;
		
		for (int i = 0; i <= 100; i++) {
			fill(W[i], INF);
			W[i][i] = 0;
		}
		
		for (int i = 0; i < M; i++) {
			int b1, b2, c;
			b1 = sc.nextInt();
			b2 = sc.nextInt();
			c = sc.nextInt();
			W[b1][b2] = c;
		}
		
		return true;
	}

	static void solve() {
		// WF
		for (int k = 0; k < 101; k++) {
			for (int i = 0; i < 101; i++) {
				for (int j = 0; j < 101; j++) {
					W[i][j] = min(W[i][j], W[i][k] + W[k][j]);
				}
			}
		}
		
		int ans = INF * 2;
		for (int i = 0; i < 101; i++) {
			ans = min(ans, W[S][i] + W[i][G1] + W[i][G2]);
		}
		System.out.println(ans);
	}	
}