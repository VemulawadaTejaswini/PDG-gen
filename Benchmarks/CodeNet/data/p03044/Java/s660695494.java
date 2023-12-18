import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);

		ArrayList<Node> nodes = new ArrayList<>(n + 1);
		for ( int i = 0; i <= n; i++ ) {
			nodes.add(new Node());
		}

		for ( int i = 0; i < n - 1; i++ ) {
			inputs = br.readLine().split(" ");
			int u = Integer.parseInt(inputs[0]);
			int v = Integer.parseInt(inputs[1]);
			int w = Integer.parseInt(inputs[2]);
			nodes.get(u).nexts.add(new Edge(v, w));
			nodes.get(v).nexts.add(new Edge(u, w));
		}
		br.close();

		// nodes.forEach(nd -> System.out.println(nd));

		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.add(1);
		int[] tree = new int[n + 1];
		tree[1] = 1;
		while ( !q.isEmpty() ) {
			int idx = q.poll();

			for ( Edge e : nodes.get(idx).nexts ) {
				if ( tree[e.to] == 0 ) {
					q.add(e.to);

					if ( e.dist % 2 == 0 ) {
						tree[e.to] = tree[idx];
					} else {
						tree[e.to] = tree[idx] * (-1);
					}
				}
			}
		}
		
		for ( int i = 1; i < tree.length; i++ ) {
			System.out.println( Math.max(tree[i], 0));
		}

	}

}

class Node {

	ArrayList<Edge> nexts = new ArrayList<>();

	@Override
	public String toString() {
		for ( Edge e : nexts ) {
			System.out.println("to:" + e.to + " dist:" + e.dist);
		}
		System.out.println();
		return " ";
	}
}

class Edge {

	int	to		= 0;
	int	dist	= 0;

	public Edge(int t, int d) {
		to = t;
		dist = d;
	}
}