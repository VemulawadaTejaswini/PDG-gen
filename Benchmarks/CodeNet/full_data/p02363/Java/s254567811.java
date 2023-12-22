import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	long INF = Long.MAX_VALUE / 10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		long[][] D = new long[V][V];
		for (int i = 0; i < V; ++i) {
			Arrays.fill(D[i], INF);
			D[i][i] = 0;
		}
		for (int i = 0; i < E; ++i)
			D[sc.nextInt()][sc.nextInt()] = sc.nextLong();
		for (int t = 1; t < V; t *= 2)
			for (int i = 0; i < V; ++i)
				for (int j = 0; j < V; ++j)
					for (int m = 0; m < V; ++m)
						if (Math.max(D[i][m], D[i][j]) < INF)
							D[i][j] = Math.min(D[i][j], D[i][m] + D[m][j]);
		for (int i = 0; i < V; ++i)
			if (D[i][i] < 0) {
				System.out.println("NEGATIVE CYCLE");
				return;
			}
		for (int i = 0; i < V; ++i)
			for (int j = 0; j < V; ++j)
				System.out.print((D[i][j] >= INF ? "INF" : D[i][j]) + (j == V - 1 ? "\n" : " "));

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}