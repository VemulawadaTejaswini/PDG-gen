import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		int r = Integer.parseInt(tmpArray[2]);

		int[][] matrix = new int[n+1][n+1];

		for(int i = 0; i <= n; i++){
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
		}

		int[] mustVisit = new int[r];

		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < r; i++){
			mustVisit[i] = Integer.parseInt(tmpArray[i]);
		}

		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");

			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			int c = Integer.parseInt(tmpArray[2]);

			matrix[a][b] = c;
			matrix[b][a] = c;
		}

		int[][] newMatrix = new int[r][r];

		for(int i = 0; i < r; i++){
			Arrays.fill(newMatrix[i], -1);
		}

		for(int i = 0; i < r ; i++){
			for(int j = i + 1 ; j < r; j++){
				newMatrix[i][j] = singleSourceShortestDense(matrix, mustVisit[i], mustVisit[j]);
				newMatrix[j][i] = newMatrix[i][j];
			}
		}
	
		//TESTPRINT
//		for(int i = 0; i < r; i++){
//			for(int j = 0; j < r; j++){
//				System.out.print(newMatrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(MyPlim(newMatrix));
	}

	static int MyPlim(int[][] matrix){
		int result = 0;
		int n = matrix[0].length;

		int[] visited = new int[n];
		Arrays.fill(visited, 0);

		visited[0] = 1;
		int checked = 1;

		while(true){
			int min = Integer.MAX_VALUE;
			int minI = -1;
			int minJ = -1;
			for(int i = 0; i < n; i++){
				if(visited[i] == 0){
					continue;
				}
				for(int j = 0; j < n; j++){
					if(min > matrix[i][j] && matrix[i][j] >= 0 && visited[j] == 0){
						min = matrix[i][j];
						minI = i;
						minJ = j;
					}
				}
			}

			result += min;
			//System.out.println("("+minI+","+minJ+") added distance"+min);
			checked++;
			visited[minI] = 1;
			visited[minJ] = 1;
			matrix[minI][minJ] = -1;
			matrix[minJ][minI] = -1;

			if(checked == n){
				break;
			}
		}

		return result;
	}

	static int singleSourceShortestDense(int[][] matrix, int s, int g){
		int n = matrix[0].length;
		int[] dist = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);

		dist[s] = 0;

		while(true){

			int u = -1;
			int sd = Integer.MAX_VALUE;

			for(int i = 0; i < n ; i++){
				if(!visited[i] && dist[i] < sd){
					sd = dist[i];
					u = i;
				}
			}

			if(u == -1){
				break;
			}

			visited[u] = true;
			for(int v = 0; v < n ; v++){
				int w = matrix[u][v];
				if(v == u) continue;

				long newLen = dist[u];
				newLen += w;
				if(newLen < dist[v]){
					dist[v] = (int)newLen;
				}
			}

		}

		return dist[g];
	}


}
