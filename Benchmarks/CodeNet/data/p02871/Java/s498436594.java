import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {
	static PrintWriter pw = new PrintWriter(System.out);
	static int v, e, tmax;
	static int[][] dist;
	static List<Integer>[][] route;
	static List<List<Hen>> nextList;
	static List<List<Order>> infoList;
	static int t = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		v = Integer.parseInt(sa[0]);
		e = Integer.parseInt(sa[1]);
		dist = new int[v][v];
		route = new List[v][v];
		nextList = new ArrayList<>(v);
		for (int i = 0; i < v; i++) {
			nextList.add(new ArrayList<>());
		}
		for (int i = 0; i < e; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]);
			nextList.get(a).add(new Hen(b, c));
			nextList.get(b).add(new Hen(a, c));
		}

		tmax = Integer.parseInt(br.readLine());
		infoList = new ArrayList<>(tmax);
		for (int i = 0; i < tmax; i++) {
			int n = Integer.parseInt(br.readLine());
			List<Order> orderList = new ArrayList<>(n);
			for (int j = 0; j < n; j++) {
				sa = br.readLine().split(" ");
				Order o = new Order();
				o.id = Integer.parseInt(sa[0]);
				o.dst = Integer.parseInt(sa[1]) - 1;
				orderList.add(o);
			}
			infoList.add(orderList);
		}
		br.close();

		for (int i = 0; i < v; i++) {
			dijkstra(i);
		}

		int gotT = 0;
		int now = 0;
		int next = 0;
		Queue<Order> carQue = new ArrayDeque<>();
		Set<Integer> carSet = new HashSet<>();
		while (t < tmax) {
			if (now == 0) {
				for ( ; gotT <= t; gotT++) {
					for (Order o : infoList.get(gotT)) {
						if (carSet.add(o.dst)) {
							carQue.add(o);
						}
					}
				}
				if (carQue.isEmpty()) {
					pw.println(-1);
					t++;
					continue;
				}
			} else {
				if (carQue.isEmpty()) {
					moveAll(now, 0);
					now = 0;
					continue;
				}
			}
			Order o = carQue.poll();
			next = o.dst;
			carSet.remove(next);
			moveAll(now, next);
			now = next;
		}
		pw.flush();
	}

	static void moveAll(int from, int to) throws Exception {
		List<Integer> list = route[from][to];
		for (int i = 1; i < list.size(); i++) {
			int d = move(list.get(i - 1), list.get(i));
			t += d;
		}
	}

	static int move(int from, int to) {
		int d = dist[from][to];
		d = Math.min(d, tmax - t);
		int to1 = to + 1;
		for (int i = 0; i < d; i++) {
			pw.println(to1);
		}
		return d;
	}

	static void dijkstra(int s) {
		Arrays.fill(dist[s], Integer.MAX_VALUE);
		dist[s][s] = 0;
		for (int i = 0; i < v; i++) {
			route[s][i] = new ArrayList<>();
		}
		route[s][s].add(s);
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = new Node(s, 0);
		que.add(first);

		while (!que.isEmpty()) {
			Node cur = que.poll();
			for (Hen hen : nextList.get(cur.v)) {
				int alt = dist[s][cur.v] + hen.c;
				if (alt < dist[s][hen.v]) {
					dist[s][hen.v] = alt;
					route[s][hen.v].clear();
					route[s][hen.v].addAll(route[s][cur.v]);
					route[s][hen.v].add(hen.v);
					Node next = new Node(hen.v, alt);
					que.add(next);
				}
			}
		}
	}

	static class Hen {
		int v, c;

		public Hen(int v, int c) {
			this.v = v;
			this.c = c;
		}
	}

	static class Node implements Comparable<Node> {
		int v, d;

		public Node(int v, int d) {
			this.v = v;
			this.d = d;
		}

		public int compareTo(Node o) {
			return d - o.d;
		}
	}

	static class Order {
		int id, dst;
	}
}
