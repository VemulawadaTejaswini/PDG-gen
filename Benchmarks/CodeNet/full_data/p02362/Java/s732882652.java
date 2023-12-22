import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int V=sc.nextInt();
		int E=sc.nextInt();
		int start=sc.nextInt();
		Vertex[] graph=new Vertex[V];	//隣接リスト
		for(int i=0; i<V; i++) {
			graph[i]=new Vertex();
		}
		for(int i=0; i<E; i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			int cost=sc.nextInt();
			//グラフの頂点が0始まりか、1始まりかによって数字を1増やしたり減らしたりし、適宜調整
			graph[from].add(to, cost);
		}
		int[] distance=new int[V];
		int INF=1000000007;
		for(int i=0; i<V; i++) {
			distance[i]=INF;
		}
		distance[start]=0;
		for(int i=0; i<V; i++) {
			boolean update=false;
			for(int j=0; j<V; j++) {	//隣接リストの特徴上こうする
				for(int k=0; k<graph[j].size(); k++) {	//次数
					if(distance[j]!=INF && distance[graph[j].getKey(k)]>distance[j]+graph[j].getValue(k)) {
						distance[graph[j].getKey(k)]=distance[j]+graph[j].getValue(k);
						update=true;
					}
				}
			}
			if(update==true) {
				if(i==V-1) {
					pl("NEGATIVE CYCLE");
					System.exit(0);
				}
				else {
					//続行
				}
			}
			else {
				//更新が全て終わってるなら終了
				break;
			}
		}
		for(int i=0; i<V; i++) {
			if(distance[i]>=INF) {
				pl("INF");
			}
			else if(distance[i]<INF) {
				pl(distance[i]);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static final class Pair<K, V> {		//powered by mikit
		public K key;
		public V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public static int getValue(Pair<Integer,Integer> a) {
			return a.value;
		}

		public static int getKey(Pair<Integer,Integer> a) {
			return a.key;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Pair<?, ?> pair = (Pair<?, ?>) o;
			return Objects.equals(key, pair.key) &&
					Objects.equals(value, pair.value);
		}
		@Override
		public int hashCode() {
			return Objects.hash(key, value);
		}

		@Override
		public String toString() {
			return "Pair{" +
					"x=" + key +
					", y=" + value +
					'}';
		}
	}
	public static class Vertex{
        	ArrayList <Pair<Integer,Integer>> rinsetu=new ArrayList<Pair<Integer,Integer>>();
		public void add(int V,int cost) {
			rinsetu.add(new Pair<Integer, Integer>(V,cost));
		}
		public void show() {		//隣接リストを出力
			for(int i=0; i<rinsetu.size(); i++) {
				System.out.println(rinsetu.get(i));
			}
		}
		public void sort_by_cost() {		//コストの低い順にソートします
			rinsetu.sort(Comparator.comparing(p -> p.value));
		}
		public void sort_by_Vertex() {		//向かう頂点の番号順にソートします
			rinsetu.sort(Comparator.comparing(p -> p.key));
		}
                public int getValue(int i) {
			return Pair.getValue(rinsetu.get(i));	//Valueを取り出す
		}
		public int getKey(int i) {
			return Pair.getKey(rinsetu.get(i));	//Valueを取り出す
		}
		public int size() {		//次数（無向なら）　でていく数（有向なら）を返す
			return rinsetu.size();
		}
		public int find_Vertex(int a) {		//ある頂点から本当に特定の辺に行くか？
			for(int i=0; i<rinsetu.size(); i++) {
				if(a==Pair.getKey(rinsetu.get(i))) {
					return i;
				}
			}
			return -1;
		}
	}
}
