import java.util.Scanner;

public class Main {
	static final int nmax = 8;
	static boolean graph[][] = new boolean[nmax][nmax];//辺があるか
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt();//頂点
		m = sc.nextInt();//辺

		for(int i = 0; i < m; i++) {
			int A,B;
			A = sc.nextInt();
			B = sc.nextInt();
			graph[A-1][B-1]=graph[B-1][A-1]=true;//a to b & b to aの辺がある
		}

		boolean visited[] = new boolean[nmax];//頂点を訪れたか
		for(int i = 0; i < n; i++) {//頂点の数回す
			visited[i]=false;//一度も訪れていないで初期化
		}

		visited[0] = true;//最初の頂点を訪問

		System.out.println(dfs(0,n,visited));
	}
	public static int dfs(int v, int n, boolean[] visited) {

		boolean all_visited=true;

		for(int i = 0; i < n; i++) {//全ての頂点を訪れていない場合false代入
			if(visited[i] == false) {
				all_visited=false;
			}
		}

		if(all_visited) {//自分が最後の頂点なら1増やす
			return 1;
		}

		int ret = 0;

		for(int i = 0; i < n; i++) {
			if(graph[v][i]==false) continue;//辺がないなら飛ばす
			if(visited[i]) continue;//既に訪れていたらとばす

			visited[i] = true;//訪れる
			ret+=dfs(i,n,visited);
			visited[i]=false;
		}

		return ret;
	}
}
