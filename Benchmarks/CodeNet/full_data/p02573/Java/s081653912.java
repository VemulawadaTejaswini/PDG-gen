import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		UnionFind uf = new UnionFind(n);
		for(int i = 0; i < m; i++){
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    uf.union(a, b);
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    result = max(result, uf.cnt(i));
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}

class UnionFind {
	int[] parent;
	int[] rank;
	int[] cnt;
	
	UnionFind(int n){
		this.parent = new int[n];
		this.rank = new int[n];
		this.cnt = new int[n];
		for(int i = 0; i < n; i++){
			parent[i] = i;
			rank[i] = 0;
			cnt[i] = 1;
		}
	}
	
	public int find(int i){
		if(i == parent[i]) return i;
		parent[i] = find(parent[i]);
		return parent[i];
	}
	
	public boolean union(int x, int y){
		int xRoot = find(x);
		int yRoot = find(y);
		if(xRoot == yRoot) return false;
		if(rank[xRoot] < rank[yRoot]){
			parent[xRoot] = yRoot;
			cnt[yRoot] += cnt[xRoot];
		}else if(rank[xRoot] > rank[yRoot]){
			parent[yRoot] = xRoot;
			cnt[xRoot] += cnt[yRoot];
		}else{
			parent[yRoot] = xRoot;
			rank[xRoot]++;
			cnt[xRoot] += cnt[yRoot];
		}
		return true;
	}
	
	public boolean same(int x, int y){
		return find(x) == find(y);
	}

	public int cnt(int x){
		return cnt[find(x)];
	}
}

