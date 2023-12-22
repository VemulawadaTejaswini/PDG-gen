import java.util.Scanner;

public class Main {
	static int n;
	static int[][] g;
	static int[] d;
	static int[] f;
	static int[] color;
	static int time;

	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		g = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				g[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			u--;
			int k = sc.nextInt();

			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				v--;
				if (v >= 0) g[u][v] = 1;
			}
		}
		sc.close();

		dfs();

		for (int i = 0; i < n; i++) {
			System.out.print(i + 1);
			System.out.print(" " + d[i] + " " + f[i]);
			System.out.print("\n");
		}
	}

	static void dfs() {
		color = new int[n];
		for (int i = 0; i < n; i++) {
			color[i] = WHITE;
		}
		time = 0;
		d = new int[n];
		f = new int[n];
		for (int i = 0; i < n; i++) {
			if (color[i] == WHITE) dfsVisit(i);
		}
	}

	static void dfsVisit(int i) {
		color[i] = GRAY;
		time++;
		d[i] = time;
		for (int j = 0; j < n; j++) {
			if (color[j] == WHITE && g[i][j] == 1) dfsVisit(j);
		}
		color[i] = BLACK;
		time++;
		f[i] = time;
	}


}