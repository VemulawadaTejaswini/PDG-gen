import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static class UnionFind {
		int[] par;
		
		public UnionFind(int n){
			par = new int[n];
			for(int i = 0; i < n; i++){
				par[i] = -1;
			}
		}
		
		public int find(int x){
			if(par[x] < 0){
				return x;
			}else{
				return par[x] = find(par[x]);
			}
		}
		
		public boolean union(int x, int y){
			final int root_x = find(x);
			final int root_y = find(y);
			
			if(root_x == root_y){
				return false;
			}
			
			final int size = par[root_x] + par[root_y];
			
			if(par[root_x] < par[root_y]){ // size(root_x) > size(root_y)
				par[root_y] = root_x;
				par[root_x] = size;
			}else{
				par[root_x] = root_y;
				par[root_y] = size;
			}
			
			return true;
		}
		
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		UnionFind uf = new UnionFind(n);
		for(int i = 0; i < m; i++){
			final int s = sc.nextInt();
			final int t = sc.nextInt();
			
			uf.union(s, t);
		}
		
		final int q = sc.nextInt();
		for(int i = 0; i < q; i++){
			final int s = sc.nextInt();
			final int t = sc.nextInt();
			
			System.out.println(uf.same(s, t) ? "yes" : "no");
		}
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}