import java.util.*;
import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 998244353;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n, s;
	static int[][][] memo;
	static int[] a;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		PriorityQueue<pair> pq = new PriorityQueue<>((yu, xu) -> xu.v - yu.v);
		for (int i = 0; i < a; i++)
			pq.add(new pair(1, sc.nextInt()));
		for (int i = 0; i < b; i++)
			pq.add(new pair(2, sc.nextInt()));
		for (int i = 0; i < c; i++)
			pq.add(new pair(3, sc.nextInt()));
		PriorityQueue<Integer> p = new PriorityQueue<>((oo, ii) -> ii - oo);
		int xx = 0;
		long ans = 0;
		while (x > 0 && y > 0) {
			if (xx == y + x)
				break;
			if (pq.peek().id == 3) {
				p.add(pq.poll().v);
				xx++;
			} else if (pq.peek().id == 1) {
				x--;
				ans += pq.poll().v;
			} else {
				y--;
				ans += pq.poll().v;
			}

		}
		if (x > 0 && y > 0) {
			while (!p.isEmpty())
				ans += p.poll();
		} else if (y == 0) {
			while (!p.isEmpty() && x > 0) {
				ans += p.poll();
				x--;
			}
			while (!pq.isEmpty() && x>0) {
				if (pq.peek().id == 2)
					pq.poll();
				else {
					x--;
					ans += pq.poll().v;
				}
			}
		} else {
			while (!p.isEmpty() && y > 0) {
				ans += p.poll();
				y--;
			}
			while (!pq.isEmpty() && y>0) {
				if (pq.peek().id == 1)
					pq.poll();
				else {
					y--;
					ans += pq.poll().v;
				}
			}
		}
		System.out.println(ans);
		out.close();
	}

	static class pair {
		int id;
		int v;

		public pair(int i, int vi) {
			id = i;
			v = vi;
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
				a[i] = nextInt();
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
