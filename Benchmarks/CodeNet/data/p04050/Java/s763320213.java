import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = sc.nextIntArray(M);
		sort(A);
		
		UnionFind uf = new UnionFind(N);
		{
			int left = 0;
			for (int i = 0; i < M; i++) {
				int a = A[i];
				for (int k = 0; k <= a/2; k++) {
					uf.link(left + k, left + a - 1 - k);
				}
				left += A[i];
			}
		}
		
		int[] B = new int[N];
		int bsize = 0;
		
		for (int i = 0; i < N; i++) {
			if (uf.root(i) == uf.root(0)) {
				boolean found = false;
				for (int j = i+1; j < N; j++) {
					if (uf.root(j) != uf.root(0)) {
						found = true;
						B[bsize++] = (j - i + 1);
						uf.link(i, j);
						i = j;
						break;
					}
				}
				if (!found) {
					B[bsize++] = 1;
				}
			} else {
				boolean found = false;
				for (int j = i+1; j < N; j++) {
					if (uf.root(0) == uf.root(j)) {
						found = true;
						B[bsize++] = (j - i + 1);
						uf.link(i, j);
						i = j;
						break;
					}
				}
				if (!found) {
					B[bsize++] = 1;
				}
			}
		}
		
		boolean possible = uf.size(0) == N;
		if (possible) {
			print(A);
			out.println(bsize);
			print(Arrays.copyOf(B, bsize));
		} else {
			out.println("Impossible");
		}
		
	}
	
	public static class UnionFind {
		int[] data;

		public UnionFind(int n) {
			data = new int[n];
			fill(data, -1);
		}

		boolean link(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (data[y] < data[x]) {
					data[y] += data[x];
					data[x] = y;
				} else {
					data[x] += data[y];
					data[y] = x;
				}
			}
			return x != y;
		}

		int root(int x) {
			return data[x] < 0 ? x : (data[x] = root(data[x]));
		}

		int size(int x) { // 要素xが含まれる集合の大きさ
			return -data[root(x)];
		}

		boolean same(int x, int y) { // 同じ集合ならtrue
			return root(x) == root(y);
		}

		int num() { // 異なる集合の数
			int res = 0;
			for (int i = 0; i < data.length; i++)
				res += (root(i) == i) ? 1 : 0;
			return res;
		}
	}
	
	static void tr(Object... os) { System.err.println(deepToString(os)); }
	static void tr(int[][] as) { for (int[] a : as) tr(a); }

	void print(int[] a) {
		out.print(a[0]);
		for (int i = 1; i < a.length; i++) out.print(" " + a[i]);
		out.println();
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
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
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}