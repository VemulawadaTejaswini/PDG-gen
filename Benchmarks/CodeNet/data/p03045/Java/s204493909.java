
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		/*
		 *
		 */
		try {
			//String S = sc.next().trim();
			int N = sc.nextInt();
			int M = sc.nextInt();

			UnionFindTree uf = new UnionFindTree(N);

			for (int i = 0; i < M; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				int z = sc.nextInt();

				uf.unite(x, y);
			}
			TreeSet<Integer> ts = new TreeSet<>();

			for (int i = 0; i < N; i++) {
				//out.println(uf.parent[i]);
				ts.add(uf.parent[i]);
			}
			out.println(uf.group);

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			//e.printStackTrace();
			throw new RuntimeException();
		} finally {
			out.flush();
			out.close();
		}

	}

	public class UnionFindTree {

		int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
		int[] rank; //parentと同様に、木の高さを格納
		int[] size; //木の要素の数を格納。最新はparentのindexに
		int group;

		public UnionFindTree(int n) {
			this.parent = new int[n];
			this.rank = new int[n];
			this.size = new int[n];
			group = n;

			for (int i = 0; i < n; i++) {
				makeSet(i);
			}
		}

		public void makeSet(int i) {
			parent[i] = i;
			rank[i] = 0; //集合の高さ
			size[i] = 1;
		}

		public void unite(int x, int y) {
			int xRoot = find(x);
			int yRoot = find(y);
			if (xRoot == yRoot)
				return;
			group--;
			//xが属する木の方が大きい場合
			if (rank[xRoot] > rank[yRoot]) {
				parent[yRoot] = xRoot; //yの親をxに更新
				size[xRoot] += size[yRoot];

			} else if (rank[xRoot] < rank[yRoot]) {
				parent[xRoot] = yRoot;
				size[yRoot] += size[xRoot];
			} else {
				parent[yRoot] = xRoot;
				rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
				size[xRoot] += size[yRoot];
			}
		}

		//引数の属する木のルートのidを返す
		public int find(int i) {
			if (i != parent[i]) {
				parent[i] = find(parent[i]);
			}
			return parent[i];
		}

		//同じ木に属しているか
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}

		// via Oland https://atcoder.jp/contests/abc120/submissions/4452920
		public int size(int i) {
			return size[find(i)];
		}

		public int getGroup() {
			return group;
		}
	}

	///////////////////////////////////////////////////////////
	//Ignore
	///////////////////////////////////////////////////////////
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
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

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
