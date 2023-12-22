import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static final int INF = 99999;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			int[][] dist = new int[10][10];
			int numOfTown = 0;
			for(int i = 0; i < dist.length; i++){
				Arrays.fill(dist[i], INF);
			}

			for(int i = 0; i < n; i++){
				String[] tmpArray = br.readLine().split(" ");

				int a = Integer.parseInt(tmpArray[0]);
				int b = Integer.parseInt(tmpArray[1]);
				int c = Integer.parseInt(tmpArray[2]);

				dist[a][b] = c;
				dist[b][a] = c;

				numOfTown = Math.max(numOfTown, a + 1);
				numOfTown = Math.max(numOfTown, b + 1);


			}

			//debug
//			for(int i = 0; i < numOfTown; i++){
//				for(int j = 0; j < numOfTown; j++){
//					System.out.print(dist[i][j]+" ");
//				}
//				System.out.println();
//			}
//
//			System.out.println("------");

			int[][] shortestPath = allPairsShortestPath(dist, numOfTown);

			solve(shortestPath);
		}
	}

	static void solve(int[][] matrix){
		int n = matrix.length;

		int minId = 0;
		int minSum = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++){
			int tmpSum = 0;

			for(int j = 0; j < n; j++){
//				if(matrix[i][j] != Integer.MAX_VALUE){
					tmpSum += matrix[i][j];
//				}
			}

			if(minSum > tmpSum){
				minId = i;
				minSum = tmpSum;
			}

//			System.out.println("i = "+ i+" "+minId+" "+minSum);
		}

		System.out.println(minId+" "+minSum);
	}

	static int[][] allPairsShortestPath(int[][] input, int n){
//		int n = input[0].length;

		int dist[][] = new int[n][n];

		for(int u = 0; u < n; u++){
			for(int v = 0; v < n; v++){
				dist[u][v] = INF;
			}
			dist[u][u] = 0;

			for(int v = 0; v < n; v++){
				if(u != v && input[u][v] < INF){
					dist[u][v] = input[u][v];
				}
			}
		}

		for(int k = 0; k < n; k++){
			for(int u = 0; u < n; u++){
				for(int v = 0; v < n; v++){
					dist[u][v] = Math.min(dist[u][v], dist[u][k] + dist[k][v]);
				}
			}
		}


		//debug
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				System.out.print(dist[i][j]+" ");
//			}
//			System.out.println();
//		}
		return dist;
	}

}

