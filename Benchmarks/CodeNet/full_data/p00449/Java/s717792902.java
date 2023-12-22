import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int inf = 1000001;

	public static int dijkstra(int a, int b, int n, int[][] cost){
		int[] d = new int [n];
		Arrays.fill(d, inf);
		d[a] = 0;
		int[] prev = new int [n];
		Arrays.fill(prev, -1);
		boolean[] q = new boolean [n];
		Arrays.fill(q, true);

		for(int i=0; i<n; i++){
			int pmin = inf;
			int u = inf;
			for (int ki=0; ki<n; ki++){
				if(pmin>=d[ki] && q[ki]){
					pmin = d[ki];
					u = ki;
				}
			}

			q[u] = false;
			for (int v=0; v<n; v++){
				if (cost[u][v] != inf){
					if(d[v] > d[u] + cost[u][v]){
						d[v] = d[u] + cost[u][v];
						prev[v] = u;
					}
				}
			}
		}
		return d[b];
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int k = Integer.parseInt(line[1]);
			if(n==0){break;}

			int[][] cost = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					cost[i][j] = inf;
				}
			}

			for(int i=0; i<k; i++){
				String query[] = br.readLine().split(" ");
				int dep = Integer.parseInt(query[1]) - 1;
				int arr = Integer.parseInt(query[2]) - 1;
				if(query[0].equals("1")){
					int price = Integer.parseInt(query[3]);
					if (cost[dep][arr] >= price){
						cost[dep][arr] = cost[arr][dep] = price;
					}
				}else{
					int mon = dijkstra(dep, arr, n, cost);
					if(mon != inf){
						System.out.println(mon);
					}else{
						System.out.println(-1);
					}
				}
			}
		}
	}
}