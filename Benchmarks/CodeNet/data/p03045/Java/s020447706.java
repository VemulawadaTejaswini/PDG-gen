import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		UnionFind uft=new UnionFind(N);
		for(int i=0; i<M; i++) {
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			int z=sc.nextInt();
			uft.unite(x, y);
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<N; i++) {
			set.add(uft.root(i));
		}
		pl(set.size());
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
}
class UnionFind {
	int[] par;
	int[] num;

	UnionFind(int n) {
		par = new int[n];
		num = new int[n];
		for(int i = 0; i < n; i++) {
			par[i] = i;
			num[i] = 1;
		}
	}

	int root(int x) {
		if (par[x] == x) return x;
		return par[x] = root(par[x]);
	}

	void unite(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if (rx == ry) return;

		par[rx] = ry;
		num[ry] += num[rx];
	}

	boolean same(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		return rx == ry;
	}

	int getNum(int n) {
		return num[root(n)];
	}
}
