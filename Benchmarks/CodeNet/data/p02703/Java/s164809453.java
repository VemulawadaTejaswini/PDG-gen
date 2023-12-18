import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int ss = Integer.parseInt(sa[2]);
		List<List<Hen>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int u = Integer.parseInt(sa[0]) - 1;
			int v = Integer.parseInt(sa[1]) - 1;
			int a = Integer.parseInt(sa[2]);
			int b = Integer.parseInt(sa[3]);

			list.get(u).add(new Hen(v, a, b));
			list.get(v).add(new Hen(u, a, b));
		}
		int[] c = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			c[i] = Integer.parseInt(sa[0]);
			d[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		int total = 2500;
		long[][] ans = new long[n][total + 1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(ans[i], Long.MAX_VALUE);
		}
		int e = Math.min(ss, total);
		for (int i = 0; i <= e; i++) {
			ans[0][i] = 0;
		}

		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = new Node(0, 0, e);
		que.add(first);
		while (!que.isEmpty()) {
			Node cur = que.poll();
			for (Hen hen : list.get(cur.v)) {
				if (cur.s >= hen.a) {
					long alt = ans[cur.v][cur.s] + hen.b;
					int rem = cur.s - hen.a;
					if (alt < ans[hen.v][rem]) {
						ans[hen.v][rem] = alt;
						que.add(new Node(hen.v, alt, rem));
					}
				}
			}
			int gin = cur.s;
			long alt = ans[cur.v][cur.s];
			if (gin < total) {
				gin = Math.min(gin + c[cur.v], total);
				alt += d[cur.v];
				if (alt < ans[cur.v][gin]) {
					ans[cur.v][gin] = alt;
					que.add(new Node(cur.v, alt, gin));
				}
			}
		}

		for (int i = 1; i < n; i++) {
			long min = Long.MAX_VALUE;
			for (int j = 0; j < 2500; j++) {
				min = Math.min(min, ans[i][j]);
			}
			System.out.println(min);
		}
	}

	static class Hen {
		int v, a, b;

		public Hen(int v, int a, int b) {
			this.v = v;
			this.a = a;
			this.b = b;
		}
	}

	static class Node implements Comparable<Node> {
		int v;
		long d;
		int s;

		public Node(int v, long d, int s) {
			this.v = v;
			this.d = d;
			this.s = s;
		}

		public int compareTo(Node o) {
			if (d != o.d) {
				return Long.compare(d, o.d);
			}
			return Long.compare(o.s, s);
		}
	}
}
