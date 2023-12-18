import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Main{
	static int N;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		/*
		 * D - Restoring Road Network
		 *
		 * 制約からワーシャルフロイドがとおる(O(N^3))
		 * 条件文から（仮定）から都市の集合Vと道の集合EからなるグラフG(V,E)は無向の連結グラフである。
		 * 最小全域木を求める
		 *
		 */
		N=sc.nextInt();
		long[][] wf=new long[N][N];
		for(int i=0; i<N;i++) {
			for(int j=0; j<N; j++) {
				wf[i][j]=sc.nextLong();
			}
		}
		if(wf(wf)) {
			Vertex[] graph=new Vertex[N];
			for(int i=0; i<N; i++) {
				graph[i]=new Vertex();
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i!=j) {
						graph[i].add(j, wf[i][j]);
					}
				}
			}
			PriorityQueue<Pair<Integer,Long>> Q=new PriorityQueue<Pair<Integer,Long>>(Comparator.comparing(v -> v.value));
			Q.add(new Pair<Integer,Long>(0,0L));
			boolean[] use=new boolean[N];
			long total=0;
			while(!Q.isEmpty()) {
				Pair<Integer,Long> tmp=Q.poll();
				if(use[tmp.key]) {
					continue;
				}
				else {
					use[tmp.key]=true;
					total+=tmp.value;
					for(int i=0; i<graph[tmp.key].size(); i++) {
						Q.add(graph[tmp.key].get(i));
					}
				}
			}
			pl(total);
		}
		else {
			pl(-1);
		}
	}
	static boolean wf(long[][] a) {
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i!=j) {
						if(!((a[i][j]==a[i][k]+a[k][j])|| (a[i][k]==a[i][j]+a[k][j])|| (a[k][j]==a[i][k]+a[i][j]))) {
							//pl(a[i][j]+" "+a[i][k]+" "+a[k][j]+" "+i+" "+j+" "+k);
							return false;
						}
					}
				}
			}
		}
		return true;
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
	public static final class Pair<K, V>{        //powered by mikit

		//Pair<任意の型、任意の型>だが、下の機能すべて使うには、Pair<Integer,Long>でないと不可能
		public K key;
		public V value;
		public Pair(K  key, V value) {
			this.key = key;
			this.value = value;
		}
		public static long getValue(Pair<Integer,Long> a) {
			return a.value;
		}
		public static int getKey(Pair<Integer,Long> a) {
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
	}
	public static class Vertex{
		ArrayList <Pair<Integer,Long>> rinsetu=new ArrayList<Pair<Integer,Long>>();
		public void add(int V,long cost) {
			rinsetu.add(new Pair<Integer, Long>(V,cost));
		}
		public void show() {        //隣接リストを出力
			for(int i=0; i<rinsetu.size(); i++) {
				System.out.println(rinsetu.get(i));
			}
		}
		public void sort_by_cost() {        //コストの低い順にソートします
			rinsetu.sort(Comparator.comparing(p -> p.value));
		}
		public void sort_by_Vertex() {      //向かう頂点の番号順にソートします
			rinsetu.sort(Comparator.comparing(p -> p.key));
		}
		public long getValue(int i) {
			return Pair.getValue(rinsetu.get(i));   //Valueを取り出す
		}
		public Pair<Integer,Long> get(int i) {
			return rinsetu.get(i);   //Pairをぶっこ抜く
		}
		public int getKey(int i) {
			return Pair.getKey(rinsetu.get(i)); //Valueを取り出す
		}
		public void changeKey(int i,int value) {	//リストのペアの前の値（Key,Value）のKeyを書き換え
			Pair<Integer,Long> tmp=new Pair<Integer, Long>(value,Pair.getValue(rinsetu.get(i)));
			rinsetu.set(i, tmp);
		}
		public void changeValue(int i,long value) {	//リストのペアの後ろの値（Key,Value）のValueを書き換え
			Pair<Integer,Long> tmp=new Pair<Integer, Long>(Pair.getKey(rinsetu.get(i)),value);
			rinsetu.set(i, tmp);
		}
		public void changeKeyValue(int i,int key,long value) {	//リストのペアを書き換え（Key,Valueどちらも）
			Pair<Integer,Long> tmp=new Pair<Integer, Long>(key,value);
			rinsetu.set(i, tmp);
		}
		public int size() {     //次数を返す
			return rinsetu.size();
		}
		public int find_Vertex(int a) {     //ある頂点から本当に特定の辺に行くか？  逐次探索なので速さはお察し
			for(int i=0; i<rinsetu.size(); i++) {
				if(a==Pair.getKey(rinsetu.get(i))) {
					return i;
				}
			}
			return -1;
		}
	}
}