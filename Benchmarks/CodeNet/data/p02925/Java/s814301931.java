//試合を頂点とするグラフに変換して解く方法
//グラフに変換するのが難しい

//試合が行いきれない場合は、グラフ間でループしている場合

import java.util.*;
public class Main {
	static int id[][];
	static List<ArrayList<Integer>> to; //試合のノードとするグラフ 
	static int dp[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[N][N-1];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-1;j++) {
				A[i][j]=sc.nextInt()-1;
			}
		}
		sc.close();
		
		//試合にIdを振っていく
		id = new int[N][N];
		for(int i=0;i<N;i++)Arrays.fill(id[i], -1); //−１で初期化
		int matchId = 0; //頂点番号になる
		//試合に順番にIDを降っていくと、1-4, 4-1などでダブルカウントが発生するので、i<jの時(例なら1-4)の時だけIDをふる。
		for(int i=0;i<N;i++) for(int j=0;j<N;j++) {
			if(i<j)id[i][j] = matchId++;
		}
		
		//連結行列のtoを作っていく
		to = new ArrayList<>();
		for(int i=0;i<N*N;i++)to.add(new ArrayList<Integer>());
		for(int i=0;i<N;i++)for(int j=0;j<N-2;j++) {
			int player1 = i;
			int player2 = A[i][j];
			int next_player2 = A[i][j+1];
			int id1 = toId(player1, player2);
			int id2 = toId(player1, next_player2);
			to.get(id1).add(id2);
		}
	
		//メモ化再帰で探索する。
		dp = new int[N*N]; //ある試合から最後の試合までの日数（グラフでいう距離）
		Arrays.fill(dp, -1);
		long ans = 0;
		for(int i=0;i<matchId;i++) ans = Math.max(ans,rec(i));
		System.out.println(ans);
	}
	//対戦相手２人を入力にして、試合IDを返すメソッド
	static int toId(int x, int y) {
		if(x > y) return toId(y, x);
		return id[x][y];
	}
	
	static int rec(int v) {
		if(dp[v]!=-1)return dp[v];
		int ret = 1;
		for(int next:to.get(v)) {
			ret = Math.max(ret, rec(next)+1);
		}
		return dp[v] = ret;
	}
	
}
