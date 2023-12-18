import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		UnionFindTree uft=new UnionFindTree(N);
		int M=sc.nextInt();
		int[] arrays=new int[N+1];
		arrays[0]=0;
		for(int i=1; i<=N; i++) {
			arrays[i]=sc.nextInt();
		}
		for(int i=0; i<M; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			uft.union(a, b);
		}
		Vertex[] v=new Vertex[N+1];
		for(int i=0; i<=N; i++) {
			v[i]=new Vertex();
		}

		for(int i=1; i<=N; i++) {
			int k=uft.find(i);
			v[k].add(arrays[i], i);
		}
		int ans=0;
		for(int i=1; i<=N; i++) {
			if(v[i].size()==0) {
				continue;
			}
			else if(v[i].size()==1) {
				if(v[i].getKey(0)==v[i].getValue(0)) {
					ans++;
				}
			}
			else {
				HashSet<Integer> h=new HashSet<Integer>();
				for(int j=0; j<v[i].size(); j++) {
					h.add(v[i].getKey(j));
				}
				for(int j=0; j<v[i].size(); j++) {
					if(h.contains(v[i].getValue(j))) {
						ans++;
					}
				}
			}
		}
		pl(ans);
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	public static class UnionFindTree {
		int nodeNum;	//頂点数
		int [] parent;	//親の頂点の値
		int [] height;	//高さ（祖先からの距離）
		int [] treeSize;	//共通祖先を持つ頂点集合の数（クラスタ内の頂点の数）

		public UnionFindTree(int nodeNum) {
			this.nodeNum = nodeNum;
			parent = new int[nodeNum+1];
			height = new int[nodeNum+1];
			treeSize = new int[nodeNum+1];
			for (int i = 1; i <= nodeNum; i++) {
				parent[i] = i;
				height[i] = 0;
				treeSize[i] = 1;
			}
		}
		int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}
		void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX == rootY) {
				return;
			}
			if (height[rootX] < height[rootY]) {
				parent[rootX] = rootY;
				treeSize[rootY] += treeSize[rootX];
			} else {
				if (height[rootX] == height[rootY]) {
					height[rootX]++;
				}
				parent[rootY] = rootX;
				treeSize[rootX] += treeSize[rootY];
			}
		}
		int size(int vertex) {
			return treeSize[vertex];
		}
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	public static final class Pair<K, V>{        //powered by mikit
		//Pair<任意の型、任意の型>だが、下の機能すべて使うには、Pair<Integer,Integer>でないと不可能
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
	public static class Vertex{
		ArrayList <Pair<Integer,Integer>> rinsetu=new ArrayList<Pair<Integer,Integer>>();
		public void add(int V,int cost) {
			rinsetu.add(new Pair<Integer, Integer>(V,cost));
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
		public int getValue(int i) {
			return Pair.getValue(rinsetu.get(i));   //Valueを取り出す
		}
		public Pair<Integer,Integer> get(int i) {
			return rinsetu.get(i);   //Pairをぶっこ抜く
		}
		public int getKey(int i) {
			return Pair.getKey(rinsetu.get(i)); //Valueを取り出す
		}
		public void changeKey(int i,int value) {	//リストのペアの前の値（Key,Value）のKeyを書き換え
			Pair<Integer,Integer> tmp=new Pair<Integer, Integer>(value,Pair.getValue(rinsetu.get(i)));
			rinsetu.set(i, tmp);
		}
		public void changeValue(int i,int value) {	//リストのペアの後ろの値（Key,Value）のValueを書き換え
			Pair<Integer,Integer> tmp=new Pair<Integer, Integer>(Pair.getKey(rinsetu.get(i)),value);
			rinsetu.set(i, tmp);
		}
		public void changeKeyValue(int i,int key,int value) {	//リストのペアを書き換え（Key,Valueどちらも）
			Pair<Integer,Integer> tmp=new Pair<Integer, Integer>(key,value);
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