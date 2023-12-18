import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		WUnionFindTree uf=new WUnionFindTree(N+1);
		for(int i=0; i<N-1; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			uf.union(a, b, 1);
		}
		Long[] Fe=new Long[N+1];
		Long[] Su=new Long[N+1];
		Arrays.fill(Fe, 0);
		Arrays.fill(Su, 0);
		for(int i=2; i<=N; i++) {
			Fe[i]=uf.diff(1, i);
			if(Fe[i]!=null) {
				Fe[i]=Math.abs(Fe[i]);
			}
		}
		for(int i=1; i<N; i++) {
			Su[i]=uf.diff(N, i);
			if(Su[i]!=null) {
				Su[i]=Math.abs(Su[i]);
			}
		}
		int Few=0;
		int Suw=0;
		for(int i=1; i<=N; i++) {
			if(Su[i]>Fe[i]) {
				Few++;
			}
			else if(Su[i]<Fe[i]) {
				Suw++;
			}
		}
		if(Few==Suw) {
			pl("Snuke");
		}
		else {
			if(Few>Suw) {
				pl("Fennec");
			}
			else {
				pl("Snuke");
			}
		}
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
	public static class Vertex2{

		ArrayList <Integer> rinsetu=new ArrayList<Integer>();

		public void add(int V) {

			rinsetu.add(V);

		}
		public void show() {        //隣接リストを出力
			for(int i=0; i<rinsetu.size(); i++) {
				System.out.println(rinsetu.get(i));
			}
		}
		public int get(int i) {
			return rinsetu.get(i);   //Pairをぶっこ抜く
		}
		public int size() {     //次数を返す
			return rinsetu.size();
		}
		public int lowerBound(final int value) {
			int low = 0;
			int high = rinsetu.size();
			int mid;
			while (low < high) {
				mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
				if (rinsetu.get(mid) < value) {
					low = mid + 1;
				} else {
					high = mid;
				}
			}
			if(low<rinsetu.size()) {
				return low;
			}
			else {
				return -1;
			}
		}
	}
	public static class WUnionFindTree{
		int[] par; // 親の番号
		long[] ws;  // 親との重みの差
		public WUnionFindTree(int n){
			par = new int[n+1];
			ws  = new long[n+1];
			for(int i = 0; i <= n; i++){ par[i] = -1; }
		}
		public int find(int x){
			if(par[x] < 0){
				return x;
			}else{
				final int parent = find(par[x]);
				ws[x] += ws[par[x]];
				return par[x] = parent;
			}
		}
		public long weight(int x){
			find(x);
			return ws[x];
		}
		public boolean union(int x, int y, long w){ // x <-(w)- y (x + w = y)
			w += weight(x);
			w -= weight(y);
			x = find(x); y = find(y);
			if(x != y){
				if(par[y] < par[x]) {
					int tmp = x; x = y; y = tmp; w = -w;
				}
				par[x] += par[y]; par[y] = x;
				ws[y] = w;
				return true;
			}else{
				return false;
			}
		}
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		public Long diff(int x, int y){ // y - x を求める. 比較不能ならnull.
			if(!same(x, y)){ return null; }
			return this.weight(y) - this.weight(x);
		}
		public int size(int x){
			return -par[find(x)];
		}
	}
}

