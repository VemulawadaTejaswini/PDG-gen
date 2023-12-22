import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();//頂点数
		int[][] E = new int[V+1][V+1];//a→cに向かうかどうか 1なら向かう
		for(int i = 1; i <= V; i++) {
			int a = sc.nextInt();//頂点番号
			int b = sc.nextInt();//出次数
			for(int k = 0; k < b; k++) {
				int c = sc.nextInt();//出次している番号
				E[a][c] = 1; //a→cに向かうかどうか 1なら向かう
			}
		}
		int[] D = bfs(V, E);
		
		for(int i = 1; i <= V; i++) {
			System.out.println(i + " " + (D[i] -1));
		}
		sc.close();
	}
	
	int[] bfs(int V, int[][] E) { //V:頂点数, E[a][b]:a→bに向かうなら1、そうでないなら0
		Queue<Integer> Q = new ArrayDeque<>();
		Q.add(1);//ノード1から始める
		int D[] = new int[V+1];
		D[1] = 1; //D[a] : ノードaの深さ（D[a]=0ならまだ通過していない）
		while(Q.size() > 0) {//キューに値が入っている間
			int cur = Q.poll();	//cur : 今考えている点
			for(int d = 1; d <= V; d++) { //d : 次向かう点
				if(E[cur][d] == 1 & D[d] == 0) { //E[cur][d]cur→dに向かうかどうか 1なら次向かう
					D[d] = D[cur]+1; //Dに深さを格納
					Q.add(d);//キューに値追加
				}
			}
		}
		return D; //各ノードの深さを返す
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
