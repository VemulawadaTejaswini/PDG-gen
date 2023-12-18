

import java.io.*;
import java.util.*;

public class Main{

	static List<Integer> g[];
	static int F[];
	static int N = 200200;

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(Integer x, Integer y) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(pair o) {
			if (x < o.x)
				return -1;
			else if (x == o.x) {
				if (y < o.y)
					return -1;
			}
			return 1;
		}

	}

	public static void addTree(int r) {
		for (; r < N; r |= r + 1) {
			F[r]++;
		}
	}

	public static int sum(int r) {
		int su = 0;
		for (; r >= 0; r = (r & (r + 1)) - 1) {

			su += F[r];
		}
		return su;
	}

	public static int sumTree(int l, int r) {
		return sum(r - 1) - sum(l - 1);
	}

	public static void main(String args[]) throws Exception {

		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		String s = sc.next();
		int f[] = new int[26];
		F = new int[N];
		g = new LinkedList[26];
		for (int i = 0; i < f.length; i++) {
			g[i] = new LinkedList<>();
		}

		for (int i = 0; i < s.length(); i++) {
			g[s.charAt(i) - 'a'].add(i);
		}
		int id = -1;
		for (int i = 0; i < 26; i++) {
			if (g[i].size() % 2 == 1) {
				if (id != -1) {
					System.out.println(-1);
					return;
				}
				id = i;
			}
		}
		long ans = 0;
		List<pair> posn = new ArrayList<>();
		if (id != -1) {
			int pos = g[id].get(g[id].size() / 2);
			for (int i = 0; i < 26; i++) {
				for (int j = 0; j < g[i].size() / 2; j++) {
					if (g[i].get(j) > pos)
						ans++;
					if (g[i].get(g[i].size() - 1 - j) < pos)
						ans++;
				}
			}
		}
		int m = 0;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < g[i].size() / 2; j++) {
				m++;
				posn.add(new pair(g[i].get(j), g[i].get(g[i].size() - 1 - j)));
			}
		}
		Collections.sort(posn);
		for (int i = 0; i < m; i++) {
			ans += 2 * sumTree(0, posn.get(i).x) + sumTree(posn.get(i).x, posn.get(i).y);
			addTree(posn.get(i).y);
		}
		System.out.println(ans);
		out.close();

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
