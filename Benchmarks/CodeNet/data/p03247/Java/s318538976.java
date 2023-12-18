import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	FastScanner in;
	PrintWriter out;
	boolean systemIO = true;

//	public int dfs(int v, int father) {
//		int d = 0;
//		if (to[v].length == 1) {
//			return 0;
//		}
//		int n = 0;
//		for (int i : to[v]) {
//			if (i != father) {
//				int x = dfs(i, v) + 1;
//				if (x <= 0) {
//					continue;
//				}
//				if (x + d > k) {
//					ans++;
//					d = Math.min(d, x);
//				} else {
//					d = Math.max(d, x);
//					n++;
//				}
//			}
//		}
//		if (n == 0) {
//			return -1;
//		}
//		return d;
//	}
//	
//	public class Info {
//		int v;
//		int father;
//		int d;
//		int n;
//		int i;
//		
//		public Info(int v, int father, int d, int n, int i) {
//			this.v = v;
//			this.father = father;
//			this.d = d;
//			this.n = n;
//			this.i = i;
//		}
//		
//	}
	
//	public class Info {
//		long sum;
//		ArrayList<Long> 
//	}
	
	public class Pair {
		int v;
		int i;

		public Pair(int v, int i) {
			this.v = v;
			this.i = i;
		}
	}
	
	int[][] to;
	int ans = 0;
	int k;
	
	public void solve() {
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] len = new int[n];
		int max = 0;
		for (int i = 0; i < len.length; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			len[i] = Math.abs(x[i]) + Math.abs(y[i]);
			max = Math.max(max, len[i]);
		}
		int n0 = 0;
		int n1 = 0;
		for (int i = 0; i < len.length; i++) {
			if (len[i] % 2 == 0) {
				n0++;
			} else {
				n1++;
			}
		}
		if (n1 > 0 && n0 > 0) {
			out.println(-1);
			return;
		}
		max += 2;
		out.println(max);
		for (int i = 0; i < max; i++) {
			out.print("1 ");
		}
		out.println();
		for (int i = 0; i < len.length; i++) {
			for (int j = 0; j < (max - len[i]) / 2; j++) {
				out.print("RL");
			}
			for (int j = 0; j < Math.abs(x[i]); j++) {
				if (x[i] < 0) {
					out.print("L");
				} else {
					out.print("R");
				}
			}
			for (int j = 0; j < Math.abs(y[i]); j++) {
				if (y[i] < 0) {
					out.print("D");
				} else {
					out.print("U");
				}
			}
			out.println();
		}
	}

	public void run() {
		try {
			if (systemIO) {
				in = new FastScanner(System.in);
				out = new PrintWriter(System.out);
			} else {
				in = new FastScanner(new File("input.txt"));
				out = new PrintWriter(new File("output.txt"));
			}
			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public static void main(String[] arg) {
		new Main().run();
	}
}