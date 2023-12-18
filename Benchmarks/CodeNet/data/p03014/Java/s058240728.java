import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		/*
		 * 照らされるのは1個だけ
		 *
		 */
		int H=sc.nextInt();
		int W=sc.nextInt();
		//int[][] dp=new int[H][W];
		int[][] masu=new int[H][W];
		Vertex2[] yoko=new Vertex2[H];
		Vertex2[] tate=new Vertex2[W];

		for(int i=0; i<H; i++) {
			yoko[i]=new Vertex2();
			yoko[i].add(-1);
		}
		for(int i=0; i<W; i++) {
			tate[i]=new Vertex2();
			tate[i].add(-1);
		}
		//入っている値は壁の座標
		for(int i=0; i<H; i++) {
			String tmp=sc.next();
			int[] tpary=new int[W];
			for(int j=0; j<W; j++) {
				if(tmp.charAt(j)=='.') {
					tpary[j]=0;
					masu[i][j]=0;
				}
				else if(tmp.charAt(j)=='#') {
					tpary[j]=1;
					masu[i][j]=1;
				}
			}
			for(int j=0; j<W; j++) {
				if(tpary[j]==1) {
					yoko[i].add(j);
					tate[j].add( i);
				}
			}
		}
		for(int i=0; i<H; i++) {
			yoko[i].add( W);
		}
		for(int i=0; i<W; i++) {
			tate[i].add(H);
		}
		int maxi=0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(masu[i][j]==1) {
					continue;
				}
				else {
					int y1,y2,t1,t2;
					y2=yoko[i].lowerBound(j);	//右のMAX
					y1=Math.max(yoko[i].lowerBound(j)-1,0);	//右のMIN
					t2=tate[j].lowerBound(i);	//上下のMAX
					t1=Math.max(tate[j].lowerBound(i)-1, 0);
					int tmplight=Math.max(yoko[i].get(y2)-yoko[i].get(y1)-1,0)+Math.max(tate[j].get(t2)-tate[j].get(t1)-1, 0)-1;
					maxi=Math.max(tmplight, maxi);
					//pl(j+" "+i+" "+tmplight);
				}
			}
		}
		pl(maxi);
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
		public int lowerBound(final int value) {
			int low = 0;
			int high = rinsetu.size();
			int mid;
			while (low < high) {
				mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
				if (Pair.getKey(rinsetu.get(mid)) < value) {
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
}