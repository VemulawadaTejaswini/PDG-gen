import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
 
public class Main {
	
	public static boolean[][] mul(final int n, final boolean[][] mat1, final boolean[][] mat2){
		boolean[][] ret = new boolean[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					ret[i][j] |= mat1[i][k] && mat2[k][j];
				}
			}
		}
		
		return ret;
	}
	
	public static boolean[][] pow(final int n, final boolean[][] adj, final int a){
		if(a == 1){
			boolean[][] ret = new boolean[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					ret[i][j] = adj[i][j];
				}
			}
			return ret;
		}else if(a % 2 == 0){
			boolean[][] ret = pow(n, adj, a / 2);
			return mul(n, ret, ret);
		}else{
			return mul(n, adj, pow(n, adj, a - 1));
		}
	}
	
	public static int[][] warshallFroyd(final int n, int[][] adj){
		int[][] ret = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				ret[i][j] = adj[i][j];
			}
		}
		
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					ret[i][j] = Math.min(ret[i][j], ret[i][k] + ret[k][j]);
				}
			}
		}
		
		return ret;
	}
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		int[] hops = new int[3];
		for(int i = 0; i < 3; i++){
			hops[i] = sc.nextInt();
		}
		
		boolean[][] adj = new boolean[n][n];
		for(int i = 0; i < m; i++){
			final int u = sc.nextInt() - 1;
			final int v = sc.nextInt() - 1;
			
			adj[u][v] = true;
		}
		
		boolean[][] all_adj = new boolean[n][n];
		for(int i = 0; i < n; i++){ Arrays.fill(all_adj[i], true); }
		
		for(final int hop : hops){
			boolean[][] hop_adj = pow(n, adj, hop);
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					all_adj[i][j] &= hop_adj[i][j];
				}
			}
		}
		
		int[][] distances = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				distances[i][j] = (i == j ? 0 : all_adj[i][j] ? 1 : INF);
			}
		}
		
		distances = warshallFroyd(n, distances);
		
		System.out.println(distances[0][n - 1] >= INF ? "IMPOSSIBLE" : distances[0][n - 1]);
		
	}
}