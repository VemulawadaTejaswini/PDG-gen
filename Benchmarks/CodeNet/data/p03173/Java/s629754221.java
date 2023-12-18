import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      
		long lsum[][] = new long[n][n]; // local sum:部分和
		for ( int i = 0; i < n; i++ ) {
			lsum[i][i] = in.nextInt();
		}
		for ( int r = 0; r < n; r++ ) {
			for ( int c = r + 1; c < n; c++ ) {
				lsum[r][c] = lsum[r][c - 1] + lsum[c][c];
			}
		}

		long cost[][] = new long[n][n]; // 累積コスト
		for ( int p = 1; p < n; p++ ) {
			for (int r = 0, c = p; c < n; r++, c++ ) {
				Long min = Long.MAX_VALUE;
				for ( int i = r; i <= c - 1; i++ ) {
					min = Math.min(min, cost[r][i] + cost[i + 1][c]);
				}
				cost[r][c] = min + lsum[r][c];
			}
		}

		System.out.println(cost[0][n - 1]);
		in.close();
	}
}