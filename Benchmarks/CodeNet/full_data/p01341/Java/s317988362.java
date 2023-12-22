import java.util.Scanner;

public class Main {
	class Pair {
		int y, x;
		Pair(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	final int MIN = -100000;

	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		Pair[] pairs = new Pair[n + 1];
		for (int i = 1; i <= n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			pairs[i] = new Pair(y, x);
		}

		float[][] cost = new float[n + 1][n + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= n; j++)
				cost[i][j] = MIN;

		float[] mincost = new float[n + 1];
		boolean[] used = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			mincost[i] = MIN;
			used[i] = false;
		}

		double sum = 0;
		for (int i = 0; i < m; i++) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			int _y = Math.abs(pairs[p].y - pairs[q].y);
			int _x = Math.abs(pairs[p].x - pairs[q].x);
			double c = Math.sqrt(_y * _y + _x * _x);
			sum += cost[p][q] = cost[q][p] = (float)c;
		}
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++)
//				System.out.print((cost[i][j] == MIN ? "X" : (int)cost[i][j]) + " ");
//			System.out.println();
//		}
		mincost[1] = 0;
		double res = 0;
		
		while (true) {
			int v = -1;
			for (int u = 1; u <= n; u++)
				if (!used[u] && (v == -1 || mincost[u] > mincost[v]))
					v = u;
			
			if (v == -1)
				break;

			used[v] = true;
			if (mincost[v] != MIN)
				res += mincost[v];
			
			for (int u = 1; u <= n; u++)
				mincost[u] = Math.max(mincost[u], cost[v][u]);
		}
		System.out.printf("%.4f", sum - res);
	}
	public static void main(String[] args) {
		new Main().run();
	}

}
