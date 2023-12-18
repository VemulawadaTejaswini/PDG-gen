import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[n+1][n+1];
		for(int i = 0; i <= n ; i++){
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
		}
		String[] strArray;
		
		for(int i = 1; i <= n - 1; i++){
			strArray = br.readLine().split(" ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
			int c = Integer.parseInt(strArray[2]);
			matrix[a][b] = c;
			matrix[b][a] = c;
			
//			System.out.println(matrix[a][b]);
		}
		
		strArray = br.readLine().split(" ");
		int question = Integer.parseInt(strArray[0]);
		int via = Integer.parseInt(strArray[1]);
		
		long[] dist = singleSourceShortestDense(matrix, via);
		
		for(int i = 0; i < question ; i++){
			strArray = br.readLine().split(" ");
			int a = Integer.parseInt(strArray[0]);
			int b = Integer.parseInt(strArray[1]);
//			System.out.println(dist[a]);
//			System.out.println(dist[b]);

			System.out.println(dist[a] + dist[b]);

		}
		
	}

	static long[] singleSourceShortestDense(int[][] matrix, int s){
        int n = matrix[0].length;
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
 
        dist[s] = 0;
         
        while(true){
         
            int u = -1;
            long sd = Long.MAX_VALUE;
             
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
                long w = matrix[u][v];
                if(v == u || w == Integer.MAX_VALUE) continue;
                 
                long newLen = dist[u];
                newLen += w;
               // System.out.println("newlen" + newLen);
                if(newLen < dist[v]){
                    dist[v] = newLen;
                }
            }
 
        }
         
        return dist;
    }
}
