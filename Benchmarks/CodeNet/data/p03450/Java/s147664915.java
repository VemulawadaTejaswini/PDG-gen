import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ans = true;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l;
		int r;
		int d;
		int graph[][] = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				graph[i][j] = 999999;
			}
		}
		for (int i = 1; i <= m; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			d = sc.nextInt();
			graph[l][r] = d;
			graph[r][l] = (-1) * d;

		}
		ans = floydWarshall(graph);

		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static boolean floydWarshall(int graph[][]) {

		int V = graph[0].length;
		boolean ans = true;
		int i, j, k;

		for (i = 0; i < V; i++) {
			for (j = 0; j < V; j++) {
				graph[i][j] = graph[i][j];
			}
		}
		for (k = 0; k < V; k++) {

			for (i = 0; i < V; i++) {

				for (j = 0; j < V; j++) {

					if (graph[i][k] + graph[k][j] < graph[i][j]) {
						if (graph[i][j] <= 10000) {
							ans = false;
						}
						graph[i][j] = graph[i][k] + graph[k][j];
					}
				}
			}
		}

		return ans;
	}

}