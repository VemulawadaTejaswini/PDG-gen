import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
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
		Vertex[] dag=new Vertex[N];
		int[] out=new int[N];	//矢印が頂点から出ていく数
		int[] depth=new int[N];
		for(int i=0; i<N; i++) {
			dag[i]=new Vertex();
			out[i]=0;
			depth[i]=0;
		}
		int from=0;
		int to=0;
		for(int i=0; i<M; i++) {
			from=sc.nextInt()-1;
			to=sc.nextInt()-1;
			dag[to].add(from, 1);
			out[from]++;
		}
		Queue<Integer> q=new LinkedList<>();	//ArrayListよりも値の削除追加が速い
		for(int i=0; i<N; i++) {
			if(out[i]==0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int go_to=q.poll();
			for(int i=0; i<dag[go_to].size(); i++) {
				int go_from=dag[go_to].getKey(i);
				depth[go_from]=Math.max(depth[go_from], depth[go_to]+1);
				if(--out[go_from]==0) {
					q.add(go_from);
				}
			}
		}
		System.out.println(Arrays.stream(depth).max().orElse(-1));
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