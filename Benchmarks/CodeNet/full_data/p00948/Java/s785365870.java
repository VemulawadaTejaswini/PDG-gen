import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static class UnionFind {
		int[] par; //

		public UnionFind(int n) {
			par = new int[n];
			for (int i = 0; i < n; i++) {
				par[i] = -1;
			}
		}

		public int find(int x) {
			if (par[x] < 0) {
				return x;
			} else {
				return par[x] = find(par[x]);
			}
		}

		public boolean union(int x, int y) {
			x = find(x);
			y = find(y);

			if (x != y) {
				if (par[y] < par[x]) { // ???????????????????????????????????????????????????.
					int tmp = x;
					x = y;
					y = tmp;
				}
				par[x] += par[y];
				par[y] = x;
				return true;
			} else {
				return false;
			}
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
		}

		public int size(int x) {
			return -par[find(x)];
		}
	}
	
	public static class Pair implements Comparable<Pair> {
		int x, y;
		
		public Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		@Override public int compareTo(Pair arg0){
			return Integer.compare(this.x, arg0.x);
		}
	}

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		UnionFind uf = new UnionFind(n);
		int[] output = new int[n];
		Arrays.fill(output, 1);
		
		Pair[] pair = new Pair[m];
		for(int i = 0; i < m; i++){
			final int x = sc.nextInt();
			final int y = sc.nextInt() - 1;
			
			pair[i] = new Pair(x, y);
		}
		Arrays.sort(pair);
		for(int i = 0; i < m; i++){
			final int x = pair[i].x;
			final int y = pair[i].y;
			
			uf.union(y, y + 1);
			output[y] = output[y + 1] = uf.size(y);
		}
		
		PrintWriter pw = new PrintWriter(System.out);
		for(int i = 0; i < n; i++){
			pw.print(i == 0 ? "" : " ");
			pw.print(output[i]);
		}
		pw.println();
		pw.flush();
		pw.close();
	}

	public static class Scanner implements Closeable {
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

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}
}