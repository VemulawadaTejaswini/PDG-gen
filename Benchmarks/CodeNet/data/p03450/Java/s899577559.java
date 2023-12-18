import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ans = true;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l;
		int r;
		short d;
		short graph[][] = new short[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				graph[i][j] = 31999;
			}
		}
		for (int i = 1; i <= m; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			d = sc.nextShort();
			graph[l][r] = d;
			graph[r][l] = (short) (d-d-d);

		}
		ans = floydWarshall(graph);

		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static boolean floydWarshall(short graph[][]) {

		int V = graph[0].length;
		boolean ans = true;
		int i, j, k;

		for (k = 0; k < V; k++) {

			for (i = 0; i < V; i++) {

				for (j = 0; j < V; j++) {

					if (graph[i][k] + graph[k][j] < graph[i][j]) {
						if (graph[i][j] <= 10000) {
							ans = false;
						}
						graph[i][j] = (short) (graph[i][k] + graph[k][j]);
					}
				}
			}
		}

		return ans;
	}

}