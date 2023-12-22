import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static BufferedReader br;
	static PrintWriter pw;
	static int inf = (int) 1e9;
	static long mod = (long) 1e9 + 7;

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		if(w>=s)
			pw.println("unsafe");
		else
			pw.println("safe");
		pw.flush();

	}

	static int n;
	static boolean[] visited;
	static ArrayList<Integer>[] g;

	static void bfs(int s, int[] arr) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited = new boolean[n];
		visited[s] = true;
		arr[s] = 0;
		while (!q.isEmpty()) {
			int u = q.remove();

			for (int v : g[u])
				if (!visited[v]) {
					visited[v] = true;
					q.add(v);
					arr[v] = arr[u] + 1;
				}
		}
	}

	static class Edge implements Comparable<Edge> {
		int node, cost, con;

		Edge(int a, int b, int c) {
			node = a;
			cost = b;
			con = c;
		}

		public int compareTo(Edge e) {
			return cost - e.cost;
		}
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		public int compareTo(pair o) {
			return y - o.y;
		}

	}

	static class triple implements Comparable<triple> {
		int x;
		int y;
		int z;

		public triple(int a, int b, int c) {
			x = a;
			y = b;
			z = c;
		}

		public int compareTo(triple o) {
			return x - o.x;
		}
	}

	static int[] nxtarr() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[st.countTokens()];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		return a;
	}

	static long pow(long a, long e) // O(log e)
	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res *= a;
			a *= a;
			e >>= 1;
		}
		return res;
	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
