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

	static int x, y, n;
	static Integer memo[][];
	static int[] arr;
	static int OO = (int) (1e9);
	static int mod = (int) 1e9 + 7;

	static int dp(int front, int back, int idx) {

		if (idx == n)
			return 0;

		if (memo[front][back] != null)
			return memo[front][back];

		int f = 0;
		int b = 0;
		int a = 0;
		if (arr[idx] > arr[front]) {
			f = 1 + dp(arr[idx], back, idx + 1);
		}
		if (arr[idx] < arr[back]) {
			b = 1 + dp(front, arr[idx], idx + 1);
		}

		a = dp(front, back, idx + 1);

		return memo[front][back] = Math.max(b, Math.max(f, a));
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();

			arr = new int[n + 2];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			arr[n - 2] = 0;
			arr[n - 1] = OO;
			memo = new Integer[n + 4][n + 4];
			pw.println(dp(n - 2, n - 1, 0));
		}
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