import java.util.*;

public class Main{

		public static boolean[][] isPath;
		public static boolean[] visited;
		public static int ans = 0;
		public static int n;
		public static int m;

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		//N頂点M辺
		n = scan.nextInt();
		m = scan.nextInt();
		

		//頂点カウント
		visited = new boolean[n];

		//組み合わせ格納
		isPath = new boolean[n][n];
		for(int i=0; i<m; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			isPath[a-1][b-1] = true;
			isPath[b-1][a-1] = true; 
		}

		//最初の1は訪問済み
		visited[0] = true;

		dfs(0);

		System.out.println(ans);
		//dfsメソッド

		
	}
	public static void dfs(int v){
			
			//すべての頂点を訪問済みならans++
			int t = 0;
			for(int i=0; i<n; i++){
				if(visited[i]==true){t++;}
			}
			if(t==n){ans++; return;}

			for(int i=0; i<n; i++){
				//隣接してるならtrue 未訪問ならfalse
				if(!(isPath[v][i]==true && visited[i]==false)){continue;}
				visited[i] = true;
				dfs(i);
				visited[i] = false;
			}
		}
}

