import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;
	static int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt(), m = fs.nextInt();
		UnionFind uf = new UnionFind(n);
		for(int i=0;i<m;i++) {
			int x = fs.nextInt()-1, y = fs.nextInt()-1, z = fs.nextInt();
			uf.unite(x, y);
		}
		System.out.println(uf.getGroupNum());
	}
}

class UnionFind{
	int parent[];
	UnionFind(int n){
		parent = new int[n];
		Arrays.fill(parent,  -1);
	}
	
	int getGroupNum(){
		int cnt = 0;
		for(int i=0;i<parent.length;i++) {
			if(parent[i]<0)cnt++;
		}
		return cnt;
	}
	
	
	int root(int x) {
		if(parent[x]<0)return x;
		return parent[x] = root(parent[x]);
	}
	
	boolean same(int x, int y) {
		return root(x) == root(y);
	}
	
	int size(int x) {
		return -parent[root(x)];
	}
	
	void unite(int x, int y) {
		if(same(x,y)) return;
		if(size(x)>size(y)) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		parent[root(y)] += parent[root(x)];
		parent[root(x)] = y;
	}
	
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
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