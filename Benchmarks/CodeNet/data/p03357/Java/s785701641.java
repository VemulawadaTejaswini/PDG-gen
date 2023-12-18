import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, m, k;
	static long mod = 998244353;
	static Boolean[][] memo;
	static String s;
	static ArrayList<Integer>[] ad;
	static long inf = Long.MAX_VALUE;
	static int[] color;
	static ArrayList<Integer> o;
	static char[][] g;
	static boolean[] vis, vis1;
	static long[] f;
	static long[] a, dest;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int ans = 0;
		TreeSet<Integer> w = new TreeSet<>();
		TreeSet<Integer> b = new TreeSet<>();
		for (int i = 1; i <= n; i++) {
			w.add(i);
			b.add(i);
		}
		ArrayList<pair> all = new ArrayList<>();
		for (int i = 0; i < 2 * n; i++) {
			if (sc.nextChar() == 'W') {
				all.add(new pair(0, sc.nextInt()));
			} else {
				all.add(new pair(1, sc.nextInt()));
			}
		}
		while (!all.isEmpty()) {
			pair cur = all.get(0);
			int id = 0;
			for (int i = 0; i < all.size(); i++) {
				if (cur.x == 0) {
					if (all.get(i).x == 0) {
                         if(w.first()==all.get(i).y) {
                        	 id=i;
                        	 w.pollFirst();
                        	 break;
                         }
					}
				} else {
					if (all.get(i).x == 1) {
						if(b.first()==all.get(i).y) {
							b.pollFirst();
                       	 id=i;
                       	 break;
                        }
					}
				}
			}
			ans += id;
			all.remove(id);
		//	System.out.println(all);
		}
		System.out.println(ans);
		out.flush();
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return x + " " + y;
		}

		@Override
		public int compareTo(pair o) {
			return 0;
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}