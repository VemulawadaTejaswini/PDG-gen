import java.util.Scanner;

public class Main {
	final int INF = Integer.MAX_VALUE / 3;
	final int MAX_N = 200 + 1;
	final int MAX_M = 100000 + 1;
	final int MAX_R = 1000 + 1;

	void test() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n + m == 0)
				break;
			int[][] land = new int[MAX_N][MAX_N];
			int[][] sea = new int[MAX_N][MAX_N];

			for (int i = 0; i < MAX_N; i++)
				for (int j = 0; j < MAX_N; j++)
					land[i][j] = sea[i][j] = INF;
			for (int i = 0; i < MAX_N; i++)
				land[i][i] = sea[i][i] = 0;
			
			for (int i = 0; i < m; i++) {
				int from = scan.nextInt();
				int to = scan.nextInt();
				int dist = scan.nextInt();
				char ls = scan.next().charAt(0);
				if (ls == 'L')
					land[from][to] = land[to][from] = dist;
				else
					sea[from][to] = sea[to][from] = dist;
			}
			
			// WashallFroyd
			for (int k = 1; k <= n; k++) for(int i = 1; i <= n; i++) for (int j = 1; j <= n; j++) {
				land[i][j] = Math.min(land[i][j], land[i][k] + land[k][j]);
				sea[i][j] = Math.min(sea[i][j], sea[i][k] + sea[k][j]);
			}
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= n; j++)
//					System.out.print((land[i][j] != INF ? land[i][j] : "x") + " ");
//				System.out.println();
//			}
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= n; j++)
//					System.out.print((sea[i][j] != INF ? sea[i][j] : "x") + " ");
//				System.out.println();
//			}
			
			// dp
			int r = scan.nextInt();
			int[] z = new int[MAX_R];
			for (int i = 0; i < r; i++)
				z[i] = scan.nextInt();
			
			int[][] dp = new int[MAX_R][MAX_N];
			for (int i = 0; i < MAX_R; i++)
				for (int j = 0; j < MAX_N; j++)
					dp[i][j] = INF;
			
			dp[0][z[0]] = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 1; j <= n; j++) {
					if (dp[i][j] == INF) continue;
					dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + land[z[i]][z[i + 1]]);
					for (int k = 1; k <= n; k++)
						dp[i + 1][k] = Math.min(dp[i + 1][k], dp[i][j] + land[z[i]][j] + sea[j][k] + land[k][z[i + 1]]);
				}
			}
//			for (int i = 0; i < r; i++) {
//				for (int j = 1; j <= n; j++)
//					System.out.print((dp[i][j] != INF ? dp[i][j] : "x") + " ");
//				System.out.println();
//			}
			int ans = INF;
			for (int i = 1; i <= n; i++)
				ans = Math.min(ans, dp[r - 1][i]);
			System.out.println(ans);
		}
	}

	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n + m == 0)
				break;
			int[][] l = new int[MAX_N][MAX_N];
			int[][] s = new int[MAX_N][MAX_N];

			for (int i = 0; i < MAX_N; i++)
				for (int j = 0; j < MAX_N; j++)
					l[i][j] = s[i][j] = INF;
			for (int i = 0; i < MAX_N; i++)
				l[i][i] = s[i][i] = 0;

			for (int i = 0; i < m; i++) {
				int to = scan.nextInt();
				int from = scan.nextInt();
				int dist = scan.nextInt();
				char sl = scan.next().charAt(0);
//				System.out.println(to + " " + from + " " + dist + " " + (sl == 'S'));
				if (sl == 'S')
					s[to][from] = s[from][to] = dist;
				else
					l[to][from] = l[from][to] = dist;
			}

			// WarshallFloyd
			for (int k = 1; k <= n; k++) for (int i = 1; i <= n; i++) for (int j = 1; j <= n; j++) {
				l[i][j] = Math.min(l[i][j], l[i][k] + l[k][j]);
				s[i][j] = Math.min(s[i][j], s[i][k] + s[k][j]);
			}
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= n; j++)
//					System.out.print((s[i][j] != INF ? s[i][j] : "x") + " ");
//				System.out.println();
//			}
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= n; j++)
//					System.out.print((l[i][j] != INF ? l[i][j] : "x") + " ");
//				System.out.println();
//			}

			int r = scan.nextInt();
			int[] z = new int[MAX_R];
			for (int i = 0; i < r; i++)
				z[i] = scan.nextInt();

			// dp
			int[][] dp = new int[MAX_R][MAX_N];
			for (int i = 0; i < MAX_R; i++)
				for (int j = 0; j < MAX_N; j++)
					dp[i][j] = INF;

			dp[0][z[0]] = 0;

			for (int i = 0; i < r - 1; i++) {
				for (int j = 1; j <= n; j++) {
					if (dp[i][j] == INF)
						continue;
					dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + l[z[i]][z[i + 1]]);
					for (int k = 1; k <= n; k++)
						dp[i + 1][k] = Math.min(dp[i + 1][k], dp[i][j] + l[z[i]][j] + s[j][k] + l[k][z[i + 1]]);
				}
//				for (int j = 0; j < r; j++) {
//					for (int k = 1; k <= n; k++)
//						System.out.print((dp[j][k] != INF ? dp[j][k] : "x") + " ");
//					System.out.println();
//				}
//				System.out.println();
			}

			int ans = INF;
			for (int i = 1; i <= n; i++)
				ans = Math.min(ans, dp[r - 1][i]);
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
//		new Main().run();
		new Main().test();
	}
}

