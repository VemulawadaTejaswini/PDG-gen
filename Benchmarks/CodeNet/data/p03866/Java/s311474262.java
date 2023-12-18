import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int xs = Integer.parseInt(sa[0]);
		int ys = Integer.parseInt(sa[1]);
		int xt = Integer.parseInt(sa[2]);
		int yt = Integer.parseInt(sa[3]);
		int n = Integer.parseInt(br.readLine());
		Node[] arr = new Node[n + 2];
		Node ns = new Node();
		ns.x = xs;
		ns.y = ys;
		arr[0] = ns;
		Node nt = new Node();
		nt.v = n + 1;
		nt.x = xt;
		nt.y = yt;
		nt.d = 1e18;
		arr[n + 1] = nt;
		for (int i = 1; i <= n; i++) {
			sa = br.readLine().split(" ");
			Node node = new Node();
			node.v = i;
			node.x = Integer.parseInt(sa[0]);
			node.y = Integer.parseInt(sa[1]);
			node.r = Integer.parseInt(sa[2]);
			node.d = 1e18;
			arr[i] = node;
		}
		br.close();

		double[][] d = new double[n + 2][n + 2];
		for (int i = 0; i <= n + 1; i++) {
			for (int j = 0; j <= n + 1; j++) {
				if (i != j) {
					double c = Math.hypot(arr[i].x - arr[j].x, arr[i].y - arr[j].y) - arr[i].r - arr[j].r;
					c = Math.max(c, 0);
					d[i][j] = c;
					d[j][i] = c;
				}
			}
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i <= n + 1; i++) {
			set.add(i);
		}
		double[] dist = new double[n + 2];
		Arrays.fill(dist, 1e18);
		dist[0] = 0;
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = arr[0];
		que.add(first);
		while (!que.isEmpty()) {
			Node cur = que.poll();
			if (set.remove(cur.v)) {
				for (int i : set) {
					double alt = cur.d + d[cur.v][i];
					if (dist[i] > alt) {
						dist[i] = alt;
						Node next = new Node();
						next.v = i;
						next.d = alt;
						que.add(next);
					}
				}
			}
		}
		System.out.println(dist[n + 1]);
	}

	static class Hen {
		int v, c;

		public Hen(int v, int c) {
			this.v = v;
			this.c = c;
		}
	}

	static class Node implements Comparable<Node> {
		int v, x, y, r;
		double d;

		public int compareTo(Node o) {
			return Double.compare(d, o.d);
		}
	}
}
