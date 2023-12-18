import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	public static class Task {
		static final long MOD = (long) 1e9 + 7;
		static List<ArrayList<Pair>> adjList;
		int[] colors;

		public void solve() {
			Scan sc = new Scan();
			int n = (int) sc.scanLong();
			adjList = new ArrayList<ArrayList<Pair>>(n);
			colors = new int[n];
			for (int i = 0; i < n; ++i) {
				adjList.add(new ArrayList<Pair>());
			}
			for (int i = 0; i < n - 1; ++i) {
				int a = -1 + (int) sc.scanLong();
				int b = -1 + (int) sc.scanLong();
				int w = (int) sc.scanLong();
				adjList.get(a).add(new Pair(b, w));
				adjList.get(b).add(new Pair(a, w));
			}
			dfs(0, -1, 0);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; ++i) {
				sb.append(colors[i]).append('\n');
			}
			System.out.println(sb);
		}

		private void dfs(int src, int par, int dist) {
			if (dist % 2 == 1 && par != -1)
				colors[src] = colors[par];
			for (Pair nbrs : adjList.get(src)) {
				int id = nbrs.a;
				int w = nbrs.b;
				if (id == par)
					continue;
				dfs(id, src, w);
			}
		}

		private class Pair {
			int a, b;

			Pair(int a, int b) {
				this.a = a;
				this.b = b;
			}
		}
	}

	public static class Scan {
		private byte[] buf = new byte[1024];
		private int index;
		private InputStream in;
		private int total;

		public Scan() {
			in = System.in;
		}

		public int scan() {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanLong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}

		public String scanString() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}

		public char scanChar() {
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			return (char) n;
		}

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
