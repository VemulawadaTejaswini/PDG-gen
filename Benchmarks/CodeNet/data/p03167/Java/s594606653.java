import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static int x, y;
	static Integer memo[][];
	static char[][] arr;
	static long OO = (long) (1e18);
	static int mod = (int) 1e9 + 7;

	static int dp(int i, int j) {

		if (i == x - 1 && j == y - 1)
			return 1;

		if (memo[i][j] != null)
			return memo[i][j];

		int right = 0;
		int down = 0;

		if (j + 1 < y && arr[i][j + 1] != '#')
			right = dp(i, j + 1) % mod;
		if (i + 1 < x && arr[i + 1][j] != '#')
			down = dp(i + 1, j) % mod;

		return memo[i][j] = (right % mod + down % mod) % mod;
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		x = sc.nextInt();
		y = sc.nextInt();

		arr = new char[x][y];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextLine().toCharArray();
		}

		memo = new Integer[x + 1][y + 1];
		pw.print(dp(0, 0));
		pw.close();
	}

	static class Pair {

		long total;
		int diff;

		public Pair(long total, int diff) {
			this.total = total;
			this.diff = diff;
		}

		public String toString() {
			return total + " " + diff;
		}

	}

	static class Pair2 implements Comparable<Pair2> {

		int x, y;

		public Pair2(int x, int y) {
			this.x = x;
			this.y = y;

		}

		public int compareTo(Pair2 o) {
			if (x == o.x)
				return y - o.y;
			return x - o.x;
		}

		public String toString() {
			return x + " " + y;
		}

	}

	static class Edge implements Comparable<Edge> {
		int node, cost;

		Edge(int a, int b) {
			node = a;
			cost = b;
		}

		public int compareTo(Edge e) {
			return cost - e.cost;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}

}