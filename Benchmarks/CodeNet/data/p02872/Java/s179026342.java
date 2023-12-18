import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int v, e, tmax;
	static int[][] dist;
	static List<Integer>[][] route;
	static List<List<Hen>> nextList;
	static Map<Integer, Order> newMap = new HashMap<>();
	static int t = 0;
//	static Queue<Order> carQue = new ArrayDeque<>();
	static Set<Integer> carSet = new HashSet<>();

	public static void main(String[] args) throws Exception {
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

		sa = br.readLine().split(" ");
		int[] f = new int[v];
		for (int i = 0; i < v; i++) {
			f[i] = Integer.parseInt(sa[i]);
		}
		tmax = Integer.parseInt(br.readLine());

		for (int i = 0; i < v; i++) {
			dijkstra(i);
		}

		int now = 0;
		int next = 0;
		input();
		while (t < tmax) {
			if (now == 0) {
				if (carSet.isEmpty()) {
					System.out.println(-1);
					input2();
					t++;
					input();
					continue;
				}
			} else {
				if (carSet.isEmpty()) {
					moveAll(now, 0);
					now = 0;
					continue;
				}
			}
			int minD = Integer.MAX_VALUE;
			for (int o : carSet) {
				int d = dist[now][o];
				if (d < minD) {
					minD = d;
					next = o;
				}
			}
//			Order o = carQue.poll();
//			next = o.dst;
			carSet.remove(next);
			moveAll(now, next);
			now = next;
		}
	}

	static void input() throws Exception {
		if (t == tmax) {
			System.exit(0);
		}
		int n = Integer.parseInt(br.readLine());
		for (int j = 0; j < n; j++) {
			String[] sa = br.readLine().split(" ");
			Order o = new Order();
			o.id = Integer.parseInt(sa[0]);
			o.dst = Integer.parseInt(sa[1]) - 1;
			newMap.put(o.id, o);
		}

		n = Integer.parseInt(br.readLine());
		for (int j = 0; j < n; j++) {
			int p = Integer.parseInt(br.readLine());
			Order o = newMap.get(p);
			carSet.add(o.dst);
//			if (carSet.add(o.dst)) {
//				carQue.add(o);
//			}
		}
	}

	static void input2() throws Exception {
		String v = br.readLine();
		if ("NG".equals(v)) {
			System.exit(0);
		}
		int n = Integer.parseInt(br.readLine());
		for (int j = 0; j < n; j++) {
			int a = Integer.parseInt(br.readLine());
		}
	}

	static void moveAll(int from, int to) throws Exception {
		List<Integer> list = route[from][to];
		for (int i = 1; i < list.size(); i++) {
			move(list.get(i - 1), list.get(i));
		}
	}

	static void move(int from, int to) throws Exception {
		int d = dist[from][to];
		d = Math.min(d, tmax - t);
		int to1 = to + 1;
		for (int i = 0; i < d; i++) {
			System.out.println(to1);
			input2();
			t++;
			input();
		}
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
