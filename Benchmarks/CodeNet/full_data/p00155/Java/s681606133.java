/**
 * Spider Jin
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

	static final int MAX = 50 * 50;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[][] positions = new int[n][2];
			final Node[] nodes = new Node[n];
			for (int i = 0; i < n; i++) nodes[i] = new Node(i + 1);

			// position
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int b, x, y;
				b = parseInt(line.substring(0, line.indexOf(' ')));
				b--;
				x = parseInt(line.substring(line.indexOf(' ') + 1, line.lastIndexOf(' ')));
				y = parseInt(line.substring(line.lastIndexOf(' ') + 1));
				positions[b][0] = x;
				positions[b][1] = y;
			}

			// distance
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					int distance = (int) (Math.pow(positions[i][0] - positions[j][0], 2)
							+ Math.pow(positions[i][1] - positions[j][1], 2));
					if (distance <= MAX) {
						Edge e;
						e = new Edge(nodes[j], distance);
						nodes[i].edges.add(e);
						e = new Edge(nodes[i], distance);
						nodes[j].edges.add(e);
					}
				}
			}

			int m = parseInt(br.readLine());
			for (int i = 0; i < m; i++) {
				line = br.readLine();
				int s, g;
				s = parseInt(line.substring(0, line.indexOf(' ')));
				g = parseInt(line.substring(line.indexOf(' ') + 1));
				s--;
				g--;

				for (Node node : nodes) node.cost = Integer.MAX_VALUE;
				nodes[s].cost = 0;

				//Dijkstra
				Queue<Node> queue = new PriorityQueue<Node>();
				queue.offer(nodes[s]);
				while (!queue.isEmpty()) {
					Node node = queue.poll();
					//
					for (Edge e : node.edges) {
						int _cost = node.cost + e.distance;
						if (_cost < e.end.cost) {
							e.end.cost = _cost;
							e.end.from = node;
							if (queue.contains(e.end)) queue.remove(e.end);
							queue.offer(e.end);
						}
					}
				}
				if (nodes[g].cost != Integer.MAX_VALUE) {
					List<Node> visited = new ArrayList<Node>();
					Node _node = nodes[g];
					while (_node != null) {
						visited.add(_node);
						_node = _node.from;
					}
					for (int j = visited.size() - 1; j >= 1; j--) {
						System.out.print(visited.get(j).id + " ");
					}
					System.out.println(visited.get(0).id);
				} else {
					System.out.println("NA");
				}
			}
		} //end while
	} //end main
}

class Node implements Comparable<Node> {
	int id;
	int cost;
	Node from;
	List<Edge> edges = new ArrayList<Edge>();

	Node(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}

class Edge {
	Node end;
	int distance;

	Edge(Node end, int distance) {
		this.end = end;
		this.distance = distance;
	}
}