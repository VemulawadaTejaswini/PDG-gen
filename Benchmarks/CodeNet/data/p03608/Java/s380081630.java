import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はJoisinosTravel

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerJoisinosTravelDaikusutora sc = new FastScannerJoisinosTravelDaikusutora(System.in);

		try {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int R = sc.nextInt();
			int[][] adj = new int[M][3];
			Integer[] travels = new Integer[R];
			for (int i = 0; i < R; i++) {
				travels[i] = sc.nextInt();
			}

			for (int i = 0; i < M; i++) {
				adj[i][0] = sc.nextInt() - 1;
				adj[i][1] = sc.nextInt() - 1;
				adj[i][2] = sc.nextInt();
			}

			//System.out.println(Arrays.deepToString(adj));
			Dijkstra dijkstra = new Dijkstra(N, adj);

			long ans = Long.MAX_VALUE;
			PermutationWarshallFloyd<Integer> p = new PermutationWarshallFloyd<>(travels);
			do {
				//System.out.println(Arrays.toString(p.getObjes()));
				Integer[] per = p.getObjes();
				long eachans = 0;
				for (int i = 0; i < per.length; i++) {
					if (i > 0) {
						eachans += dijkstra.dijkstra(per[i - 1] - 1, per[i] - 1);

					}
				}

				if (ans > eachans) {
					ans = eachans;
				}

			} while (p.next());

			System.out.println(ans);

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
}

class Daikusutora {

}

class Dijkstra {
	int n; //頂点数
	int[][] adj;
	List<Edge>[] edges;
	int[] distance;

	public Dijkstra(int N, int[][] ADJ) {
		//Wikipedia の例(図)をデータにしたもの
		this.n = N; //頂点数
		//this.s = S; //スタート頂点(頂点番号は -1 されている[元は 1])
		/**
		 * { 0, 1, 7 },
		 * { 0, 2, 9 },
		 * { 0, 5, 14 },
		 * { 1, 2, 10 },
		 * { 1, 3, 15 },
		 * { 2, 3, 11 },
		 * { 2, 5, 2 },
		 * { 3, 4, 6 },
		 * { 4, 5, 9 }
		 * s:0 → g:4 のとき、答えは 20
		 */
		this.adj = ADJ;

		//隣接リスト
		@SuppressWarnings("unchecked")
		List<Edge>[] edges = new List[n];
		for (int i = 0; i < n; i++) {
			edges[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < adj.length; i++) {
			edges[adj[i][0]].add(new Edge(adj[i][0], adj[i][1], adj[i][2]));
			edges[adj[i][1]].add(new Edge(adj[i][1], adj[i][0], adj[i][2])); //無向グラフなので、逆方向も接続する
		}
		this.edges = edges;
	}

	static final int INF = 100100100; //INF 値(十分に大きな値)

	//ダイクストラ法[単一始点最短経路(Single Source Shortest Path)]
	int dijkstra(int s, int g) {
		distance = new int[n]; //始点からの最短距離

		Arrays.fill(distance, INF); //各頂点までの距離を初期化(INF 値)
		distance[s] = 0; //始点の距離は０

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(s, s, 0)); //始点を入れる

		while (!q.isEmpty()) {
			Edge e = q.poll(); //最小距離(cost)の頂点を取り出す
			if (distance[e.target] < e.cost) {
				continue;
			}

			//隣接している頂点の最短距離を更新する
			for (Edge v : edges[e.target]) {
				if (distance[v.target] > distance[e.target] + v.cost) { //(始点～)接続元＋接続先までの距離
					distance[v.target] = distance[e.target] + v.cost; //現在記録されている距離より小さければ更新
					q.add(new Edge(e.target, v.target, distance[v.target])); //始点～接続先までの距離
				}
			}
		}

		this.distance = distance;
		return distance[g]; //到達できなかったときは、INF となる
	}
}

//辺情報の構造体
class Edge implements Comparable<Edge> {
	public int source = 0; //接続元ノード
	public int target = 0; //接続先ノード
	public int cost = 0; //重み

	public Edge(int source, int target, int cost) {
		this.source = source;
		this.target = target;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost; //重みの小さい順
	}

	@Override
	public String toString() { //デバッグ用
		return "source = " + source + ", target = " + target + ", cost = " + cost;
	}
}

class PermutationDaikusutora<T extends Serializable> {

	private int baseIndex;
	private int index;
	private T[] objs;

	private PermutationDaikusutora<T> subPermutationDaikusutora;

	public PermutationDaikusutora(T[] objs) {
		this(0, 0, objs.clone());
	}

	private PermutationDaikusutora(int baseIndex, int index, T[] objs) {
		if (objs == null || objs.length == 0) {
			throw new IllegalArgumentException();
		}

		this.baseIndex = baseIndex;
		this.index = index;
		this.objs = objs;

		if (this.index < this.objs.length - 1) {
			this.subPermutationDaikusutora = new PermutationDaikusutora<T>(this.baseIndex + 1, this.index + 1,
					this.objs);
		}
	}

	public T[] getTarget() {
		return this.objs;
	}

	public boolean next() {
		if (this.subPermutationDaikusutora == null) {
			return false;
		}

		boolean result = this.subPermutationDaikusutora.next();
		if (result == true) {
			return true;
		}

		this.swap(this.baseIndex, this.index);

		++this.index;
		if (this.objs.length <= this.index) {
			this.index = this.baseIndex;
			return false;
		}

		this.swap(this.index, this.baseIndex);
		return true;
	}

	public T[] getObjes() {
		return this.objs;
	}

	private void swap(int index1, int index2) {
		T tmp = this.objs[index1];
		this.objs[index1] = this.objs[index2];
		this.objs[index2] = tmp;
	}
}

//高速なScanner
class FastScannerJoisinosTravelDaikusutora {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerJoisinosTravelDaikusutora(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
