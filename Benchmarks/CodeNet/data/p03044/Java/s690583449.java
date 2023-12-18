import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		//重み付きUFっぽくねぇか
		int N=sc.nextInt();
		WUnionFindTree uft=new WUnionFindTree(N);
		for(int i=0; i<N-1; i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			long w=sc.nextLong();
			uft.union(u,v,w);
		}
		int[] nurinuri=new int[N+1];
		nurinuri[1]=0;
		for(int i=2; i<=N; i++) {
			if(uft.diff(1,i)!=null && Math.abs((long) uft.diff(1, i))%2==0){
				nurinuri[i]=0;
			}
			else {
				nurinuri[i]=1;
			}
		}
		for(int i=1; i<=N; i++) {
			pl(nurinuri[i]);
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