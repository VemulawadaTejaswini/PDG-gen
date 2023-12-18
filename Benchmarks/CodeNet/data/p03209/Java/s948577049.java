import java.util.*;
public class Main {
	static long bur [][];
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		
		bur = new long [N + 1][2]; /// N levels ... 0: (bun or patty) ... 1: patty
		bur[0][0] = 1; bur[0][1] = 1;
		
		for (int i = 1; i <= N; i++) {
			bur[i][0] = 2 * bur[i - 1][0] + 3;
			bur[i][1] = 2 * bur[i - 1][1] + 1;
		}
		
		solve(X, N);
		System.out.println(pat);
	}
	static long pat = 0;
	public static void solve (long x, int n) {// n is the level and x is the layers
			x--;
			if (n == 0) {pat++; return;}
			
			for (int i = 0; i < 2; i++) {
				if (x > 0 && x < bur[n - 1][0]) {
					solve(x, n -1);
					break;
				}else if (x >= bur[n - 1][0]) {
					x -= bur[n - 1][0];
					pat += bur[n - 1][1];
				}
				if (i == 0 && x > 0)
					{x--; pat++;}
			}
	}
}
