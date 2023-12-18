import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static final int M = Integer.MAX_VALUE; // 到達不能点(無限大)

	static int w[][];

	static int N ; // グラフの頂点数
	static boolean S[]; // 頂点集合Sを表す配列
	static int Scount; // 頂点集合Sの要素数
	static int d[] ; // 重みの累積値を表す配列
	static int parent[] ; // 最短路を求めるために使う変数

	/**
	 * 頂点集合 S に頂点 u を追加
	 * @param u 追加する頂点
	 * @param S 頂点集合
	 * @return なし
	 */
	static void add(int u, boolean[] S) {
		S[u] = true;
		Scount++;
	}

	/**
	 * 頂点集合のうち S に追加されていない頂点があるかどうかを確認する
	 * @return S に追加されていない頂点が存在すればtrue, それ以外はfalse
	 */
	static boolean remain() {
		if (Scount < N)
			return true;
		return false;
	}

	/**
	 * p からの最短距離が確定していない頂点のうち d[] が最小の頂点
	 * 適切な頂点がない場合は -1を返す
	 * @param nothing
	 * @return 未確定の d[] が最小の頂点, 適切な頂点がない場合は -1
	 */
	static int selectMin() {
		int min = M;
		int idx = -1;
		for (int i = 0; i < N; i++) {
			if (d[i] < min && d[i] != 0 && !S[i]) {
				min = d[i];
				idx = i;
			}
		}
		if (min != M)
			return idx;
		return -1;
	}

	/**
	 * 頂点 u から頂点 x に接続する辺が存在すれば true, それ以外は false
	 * @param u 頂点
	 * @param x 頂点
	 * @return 辺が存在すれば true, それ以外は false
	 */
	static boolean member(int u, int x) {
		if (w[u][x] > 0 && w[u][x] != M)
			return true;
		return false;
	}

	/**
	 * ダイクストラ法で頂点pから各頂点への最短路の重みを計算
	 * @param p 開始点
	 * @return notthing
	 */
	static void dijkstra(int p) {
		add(p, S);
		for (int i = 0; i < N; i++) {
			d[i] = w[p][i];
			parent[i] = p; // 必須課題3
		}

		while (remain()) {
			int u = selectMin();
			if (u < 0)
				break;
			add(u, S);

			for (int x = 0; x < N; x++) {
				if (member(u, x)) {
					int k = d[u] + w[u][x];
					if (k < d[x]) {
						d[x] = k;
						parent[x] = u;
					}
				}
			}
		}
	}

	/**
	 * 最短路を求める関数
	 * @param p 始点
	 * @return nothing
	 */
	static void shortestPath(int p) {
		for (int i = 0; i < N; i++) {
			//	    if (i != p) {
			System.out.print(p + "->" + i + ": ");
			if (d[i] != M) {
				System.out.print(p);
				printPath(p, i);
				System.out.println();
			} else
				System.out.println("Cannnot Reach");
		}
	}

	static void printPath(int p, int q) {
		if (p != q) {
			printPath(p, parent[q]);
			System.out.print("->" + q);
		}
	}

	/**
	 * 配列の中身を標準出力に表示. 結果出力及びデバッグ用
	 * @param name ラベル (変数名など)
	 * @param ary  配列
	 * @return nothing
	 */
	static void display(String name, int[] ary) {
		System.out.print(name + ":");
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == M)
				System.out.print(" M");
			else
				System.out.print(" " + ary[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N,M,s,t;
	    N=sc.nextInt();
	    M = sc.nextInt();
	    ArrayList<Integer>[] map = new ArrayList[N];
	    w = new int[N][N];
	    boolean reached[][]=new boolean[N][4];
	    for(int i=0;i<N;i++)map[i]=new ArrayList<Integer>();
	    for(int i=0;i<M;i++) {
	    	int u = sc.nextInt()-1;
	    	int v = sc.nextInt()-1;
	    	map[u].add(v);
	    }
	    s = sc.nextInt()-1;
	    t = sc.nextInt()-1;
	    Main.N=N;

		Main.S = new boolean[N]; // 頂点集合Sを表す配列
		Scount = 0; // 頂点集合Sの要素数
		d = new int[N]; // 重みの累積値を表す配列
		parent = new int[N]; // 最短路を求めるために使う変数

		for(int i=0;i<N;i++) {
	    	for(int j=0;j<N;j++) {
		    	w[i][j]=M;
		    }
	    }
	    for(int i=0;i<N;i++) {
	    	DFS(0,i,i,map,reached);
	    }
	    for (int i = 0; i < N; i++) {
		    S[i] = false;
		}

		S[s] = true;
		dijkstra(s);
		if(d[t]==M)d[t]=-1;
		System.out.println(d[t]);
	}

	private static void DFS(int depth, int now, int start, ArrayList<Integer>[] map, boolean[][] reached) {
		if(reached[now][depth])return;
		if(depth==3) {
			w[start][now]=1;
			w[now][start]=1;
			return;
		}
		reached[now][depth]=true;
		for(int i:map[now]) {
			DFS(depth+1,i,start,map,reached);
		}
		reached[now][depth]=false;

	}

}