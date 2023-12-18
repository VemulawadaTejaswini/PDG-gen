import java.util.Scanner;

class Main{
	static boolean[] visited;
	static int N;
	static int M;
	static boolean[][] graph;
	static boolean[][] test;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		visited=new boolean[N+1];
		graph=new boolean[N+1][N+1];	//隣接行列
		test=new boolean[N+1][N+1];
		int[][] path=new int[M][2];

		for(int i=0; i<=N; i++) {		//グラフの初期化
			for(int j=0; j<=N; j++) {
				graph[i][j]=false;
			}
		}

		for(int i=0; i<M; i++) {		//入力
			int from=sc.nextInt();
			int to=sc.nextInt();
			graph[from][to]=true;
			graph[to][from]=true;
			path[i][0]=from;
			path[i][1]=to;
		}

		boolean connected=true;		//連結であるという過程で解く
		int count=0;		//橋の数

		visited[0]=true;	//ぬさもとりあへず
		for(int h=0; h<M; h++) {
			for(int i=0; i<=N; i++) {
				for(int j=0; j<=N; j++) {
					test[i][j]=graph[i][j];		//データをコピー
				}
			}
			connected=true;
			test[path[h][0]][path[h][1]]=false;		//パスを引っこ抜く
			test[path[h][1]][path[h][0]]=false;

			for(int i=1; i<=N; i++) {		//訪問初期化
				visited[i]=false;
			}
			dfs(1);	//1から始める（実際問題どこでもいい）

			for(int i=1; i<=N; i++) {		//連結判定
				if(!visited[i]) {
					connected=false;
					break;
				}
			}
			//System.out.println(connected);	//for debug
			if(connected==false) {
				count++;
			}
		}
		System.out.println(count);

	}
	static void dfs(int x) {		//訪問していくDFS
		if(visited[x]) {
			return;		//すでに訪問している時はみない
		}
		visited[x]=true;		//まだ訪れてないなら　今訪れたのでtrueにする
		for(int i=1; i<=N; i++) {
			if(test[x][i]) {		//訪問できるところを訪問する
				dfs(i);
			}
		}
	}

}