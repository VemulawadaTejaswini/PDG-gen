import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INF = 9999999;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ele = sc.nextInt();

		int node, path;
		node = n;
		path = m;

		int dist[][] = new int[n][n];
		int z, x, c;
		int graph[][] = new int[node][node];

		for (int i = 0; i < node; i++) {
			for (int j = 0; j < node; j++) {
				graph[i][j] = INF;
			}
		}
		for (int i = 0; i < path; i++) {
			z = sc.nextInt();
			x = sc.nextInt();
			c = sc.nextInt();
			z--;
			x--;
			graph[z][x] = c;// ここを消すと有向グラフに
			graph[x][z] = c;// graph[from][to]=distance
		}

		floydWarshall(graph, dist);
		int q = sc.nextInt();
		for (int i = 1; i <= q; i++) {

			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (dist[a][b] > 999999) {
				System.out.println(-1);
			} else {
				int ans = dist[a][b] / ele;
				if (dist[a][b] % ele == 0) {
					ans--;
				}
				System.out.println(ans);
			}
		}
	}

	public static void floydWarshall(int graph[][], int dist[][]) {

		int V = graph[0].length;
		int i, j, k;

		for (i = 0; i < V; i++) {
			for (j = 0; j < V; j++) {
				dist[i][j] = graph[i][j];
			}
		}
		for (k = 0; k < V; k++) {

			for (i = 0; i < V; i++) {

				for (j = 0; j < V; j++) {

					if (dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

	}

}