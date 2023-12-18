import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
		int s = Integer.parseInt(sa[2]) - 1;
		int t = Integer.parseInt(sa[3]) - 1;
		List<List<Hen>> list1 = new ArrayList<>(n);
		List<List<Hen>> list2 = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list1.add(new ArrayList<>());
			list2.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int u = Integer.parseInt(sa[0]) - 1;
			int v = Integer.parseInt(sa[1]) - 1;
			int a = Integer.parseInt(sa[2]);
			int b = Integer.parseInt(sa[3]);

			list1.get(u).add(new Hen(v, a));
			list1.get(v).add(new Hen(u, a));
			list2.get(u).add(new Hen(v, b));
			list2.get(v).add(new Hen(u, b));
		}
		br.close();

		long[] d1 = new long[n];
		Arrays.fill(d1, Long.MAX_VALUE);
		d1[s] = 0;
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = new Node(s, 0);
		que.add(first);

		while (!que.isEmpty()) {
			Node cur = que.poll();
			for (Hen hen : list1.get(cur.v)) {
				long alt = d1[cur.v] + hen.c;
				if (d1[hen.v] > alt) {
					d1[hen.v] = alt;
					Node next = new Node(hen.v, alt);
					que.add(next);
				}
			}
		}

		long[] d2 = new long[n];
		Arrays.fill(d2, Long.MAX_VALUE);
		d2[t] = 0;
		que = new PriorityQueue<Node>();
		first = new Node(t, 0);
		que.add(first);

		while (!que.isEmpty()) {
			Node cur = que.poll();
			for (Hen hen : list2.get(cur.v)) {
				long alt = d2[cur.v] + hen.c;
				if (d2[hen.v] > alt) {
					d2[hen.v] = alt;
					Node next = new Node(hen.v, alt);
					que.add(next);
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		long[] min = new long[n];
		Arrays.fill(min, Long.MAX_VALUE);
		min[n - 1] = d1[n - 1] + d2[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			min[i] = Math.min(min[i + 1], d1[i] + d2[i]);
		}
		for (int i = 0; i < n; i++) {
			pw.println(1_000_000_000_000_000L - min[i]);
		}
		pw.flush();
		pw.close();
	}

	static class Hen {
		int v, c;

		public Hen (int v, int c) {
			this.v = v;
			this.c = c;
		}
	}

	static class Node implements Comparable<Node> {
		int v;
		long d;

		public Node (int v, long d) {
			this.v = v;
			this.d = d;
		}

		public int compareTo(Node o) {
			if (d > o.d) {
				return 1;
			} else if (d == o.d) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}
