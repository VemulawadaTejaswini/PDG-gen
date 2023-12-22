import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	
	final static int INF = 100;
	static int time = 0;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] Graph = new int[n + 1][n];
		int[] depth = new int[n + 1];
		int[] f = new int[n + 1];
		
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			for(int j = 0; j < y; j++){
				Graph[x][j] = Integer.parseInt(str[j + 2]);
			}
		}
		
		for(int i = 1; i <= n; i++){
			if(depth[i] == 0){
				search(Graph, depth, f, i);
			}
		}
		
		for(int i = 1; i <= n; i++){
			System.out.println(i + " " + depth[i] + " " + f[i]);
		}
	}
	
	public static void search(int[][] Graph, int[] depth, int[] f, int x){
		depth[x] = ++time;
		for(int i = 0; i < Graph[x].length && Graph[x][i] > 0; i++){
			if(depth[Graph[x][i]] == 0){
				search(Graph, depth, f, Graph[x][i]);
			}
		}
		f[x] = ++time;
	}
}