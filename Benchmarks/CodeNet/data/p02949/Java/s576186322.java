

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		//0 origin
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		int p = Integer.parseInt(tmpArray[2]);

		int matrix[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			Arrays.fill(matrix[i], INF);
		}

		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");
			int from = Integer.parseInt(tmpArray[0]) - 1;
			int to = Integer.parseInt(tmpArray[1]) - 1;
			int cost = - Integer.parseInt(tmpArray[2]) + p;

			matrix[from][to] = cost;
		}
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}

		solve(matrix);
	}


	static void solve(int matrix[][]){
		long[][] dist = warshallFloyd(matrix);

		int n = dist.length;
		for(int i = 0; i < n; i++){
			if(dist[i][i] < 0){
//				System.out.println("NEGATIVE CYCLE");
				if(dist[i][n - 1] != INF && dist[0][i] != INF){
//					System.out.println("i = "+i);
					System.out.println(-1);
					return;
				}
			}
		}

//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				if(j != 0){
//					System.out.print(" ");
//				}
//				if(dist[i][j] == INF){
//					System.out.print("INF");
//				}
//				else {
//					System.out.print(dist[i][j]);
//				}
//			}
//			System.out.println();
//		}

		System.out.println(Math.max(-dist[0][n - 1], 0));
	}

	static final int INF = Integer.MAX_VALUE;


	static long[][] warshallFloyd(int[][] matrix){
		int n = matrix.length;

		long[][] dist = new long[n][n];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				//customize
				if(i == j && matrix[i][j] == INF){
					dist[i][j] = 0;
				}
				else {
					dist[i][j] = matrix[i][j];
				}
			}
		}

		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(dist[i][k] == INF || dist[k][j] == INF){
						continue;
					}
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					//	                  System.out.println("test "+dist[i][j]);
				}
			}
		}

		return dist;
	}
}