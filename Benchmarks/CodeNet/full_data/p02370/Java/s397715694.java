import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		Vertex[] graph=new Vertex[N];
		int[] ans=new int[N];
		int ansptr=0;
		int[] to=new int[N];	//矢印の方向が向いている矢印の個数
		for(int i=0; i<N; i++) {
			graph[i]=new Vertex();
			to[i]=0;
			ans[i]=0;
		}
		for(int i=0; i<M; i++) {
			int graph_from=sc.nextInt();
			int graph_to=sc.nextInt();
			graph[graph_from].add(graph_to,1);
			to[graph_to]++;
		}
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=N-1; i>=0; i--) {
			if(to[i]==0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int siraberu=q.poll();
			ans[ansptr]=siraberu;
			ansptr++;
			for(int i=0; i<graph[siraberu].size(); i++) {
				int tmp=graph[siraberu].getKey(i);
				to[tmp]--;
				if(to[tmp]==0) {
					q.add(tmp);
				}
			}
		}
		for(int i=0; i<N; i++) {
			pl(ans[i]);
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
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Pair<?, ?> pair = (Pair<?, ?>) o;
			return Objects.equals(key, pair.key) &&
					Objects.equals(value, pair.value);
		}
		public int hashCode() {
			return Objects.hash(key, value);
		}
		public String toString() {
			return "Pair{" +
					"x=" + key +
					", y=" + value +
					'}';
		}
	}
	public static class Vertex{		//今回は2つの頂点の矢印が向いている方のリストに矢印のソースが来る
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
}
