import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l[] = new int[m + 1];
		int r[] = new int[m + 1];
		int d[] = new int[m + 1];
		int graph[][] = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(graph[i], 99999999);
		}
		int dist[][] = new int[n + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			d[i] = sc.nextInt();
			graph[l[i]][r[i]] = d[i];
			graph[r[i]][l[i]] = (-1) * d[i];

		}
		dist = floydWarshall(graph);
boolean ans=true;
		for (int i = 1; i <= m; i++) {
			if(graph[l[i]][r[i]] != dist[l[i]][r[i]] ){
ans=false;

			}

		}
if(ans){
	System.out.println("Yes");
}else{
	System.out.println("No");
}


	}

	static int[][] floydWarshall(int graph[][]) {

		int V = graph[0].length;
		int dist[][] = new int[V][V];
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

		return dist;
	}

}