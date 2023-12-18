import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Edge>[] adj = new List[n];
		List<Integer>[] used = new List[n];

		Edge[] edges = new Edge[n - 1];

		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayList<Edge>();
			used[i] = new ArrayList<Integer>();
		}

		for (int i = 0, a, b; i < n - 1; i++) {

			a = scanner.nextInt() - 1;
			b = scanner.nextInt() - 1;
			edges[i] = new Edge(a, b);
			adj[a].add(edges[i]);
			adj[b].add(edges[i]);
		}

		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		int v, nv, c, cMax = 1;
		;
		while (!queue.isEmpty()) {
			c = 1;
			v = queue.poll();
			for (Edge e : adj[v]) {
				if (e.color > 0)
					continue;

				nv = e.op(v);
				while (used[v].contains(c))
					c++;
				if (c > cMax)
					cMax = c;
				e.color = c;
				used[v].add(c);
				used[nv].add(c);
				queue.add(nv);
			}
		}
		System.out.println(cMax);
		for (int i = 0; i < n - 1; i++) {
			System.out.println(edges[i].color);
		}
	}

}

class Edge {
	int[] vertex = new int[2];
	int color = 0;

	Edge(int a, int b) {
		vertex[0] = a;
		vertex[1] = b;
	}

	int op(int a) {
		return vertex[0] != a ? vertex[0] : vertex[1];
	}
}