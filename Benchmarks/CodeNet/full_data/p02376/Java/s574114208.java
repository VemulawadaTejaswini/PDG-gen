import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int v = sc.nextInt();
		int e = sc.nextInt();

		Map<Integer, List<Edge>> map = new HashMap<Integer, List<Edge>>();

		for (int i = 0; i < e; i++) {
			Edge edge = new Edge();

			int from = sc.nextInt();
			int to = sc.nextInt();
			int cap = sc.nextInt();

			edge.from = from;
			edge.to = to;
			edge.cap = cap;

			Edge rev = new Edge();
			rev.from = to;
			rev.to = from;
			rev.cap = 0;

			edge.rev = rev;
			rev.rev = edge;

			map.computeIfAbsent(edge.from, (__) -> new LinkedList<Edge>()).add(edge);
			map.computeIfAbsent(rev.from, (__) -> new LinkedList<Edge>()).add(rev);
		}

		int[] depth = new int[v];
		
		Edge[][] edges = new Edge[v][];
		for(int i= 0; i < v; i++){
			edges[i] = map.getOrDefault(i, new LinkedList<Edge>()).toArray(new Edge[0]);
		}
		
		long ans = 0;
		for (; ;) {
			boolean cont = bfs(v - 1, 0, depth, (now) -> map.getOrDefault(now, new LinkedList<Edge>()).stream().map(ed -> ed.rev)
					.filter(ed -> ed.cap > 0).map(ed -> ed.from)) ;
			if(!cont){
				break;
			}				
			
			ans += shortest_flow(0, v-1, depth, edges);
		}
		System.out.println(ans);
	}

	boolean bfs(int from, int to, int[] depth, Function<Integer, Stream<Integer>> next) {

		LinkedList<Integer> position = new LinkedList<Integer>();
		LinkedList<Integer> count = new LinkedList<Integer>();

		Arrays.fill(depth, Integer.MAX_VALUE);
		position.addLast(from);
		count.addLast(0);

		for (; !position.isEmpty();) {
			int currentPos = position.removeFirst();
			int currentCount = count.removeFirst();

			if (depth[currentPos] < Integer.MAX_VALUE) {
				continue;
			}

			depth[currentPos] = currentCount;

			if (currentPos == to) {
				return true;
			}

			next.apply(currentPos).forEach(nextPos -> {
				position.addLast(nextPos);
				count.addLast(currentCount + 1);
			});
		}
		return false;

	}

	int shortest_flow(int from, int to, int[] depth, Edge[][] next) {

		LinkedList<Integer> pos = new LinkedList<Integer>();
		LinkedList<Integer> start = new LinkedList<Integer>();
		LinkedList<Edge> path = new LinkedList<Edge>();

		pos.add(from);
		start.add(-1);

		int ans = 0;
		for (;;) {

			int now = pos.getFirst();
			int ss = start.getFirst()+1;

			if (now == to) {

				int flow = Integer.MAX_VALUE;
				for (Edge p : path) {
					flow = Math.min(flow, p.cap);
				}

				int i = 0;
				int s = 0;
				for (Edge p : path) {
					if (s == 0 && p.cap == flow) {
						s = i;
					}
					p.cap -= flow;
					p.rev.cap += flow;
					i++;
				}

				ans += flow;

				for (; i > s; i--) {
					start.removeFirst();
					pos.removeFirst();
					path.removeLast();
				}

				continue;
			}

			boolean hasNext = false;
			for (int i = ss; i < next[now].length; i++) {
				if (depth[now] > depth[next[now][i].to] && next[now][i].cap > 0) {

					start.removeFirst();
					start.addFirst(i);
					start.addFirst(-1);
					pos.addFirst(next[now][i].to);
					path.addLast(next[now][i]);

					hasNext = true;
					break;
				}

			}

			if (!hasNext) {
				start.removeFirst();
				if (start.isEmpty()) {
					break;
				}
				pos.removeFirst();
				path.removeLast();
			}
		}
		return ans;
	}

	class Edge {
		int from;
		int to;
		int cap;
		Edge rev;
	}

}
