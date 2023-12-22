import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] n_m = br.readLine().split(" ");

		int n = Integer.parseInt(n_m[0]);

		int m = Integer.parseInt(n_m[1]);

		node[] v = new node[n];

		for (int i = 0; i < v.length; i++) {
			v[i] = new node();
		}

		for (int i = 0; i < m; i++) {

			String[] node_to = br.readLine().split(" ");

			int node = Integer.parseInt(node_to[0]);
			int to = Integer.parseInt(node_to[1]);

			v[node].graph.add(to);
			v[to].graph.add(node);

		}

		int q = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < q; i++) {
			String[] nodenumbers = br.readLine().split(" ");

			int nownode = Integer.parseInt(nodenumbers[0]);

			int targetnode = Integer.parseInt(nodenumbers[1]);

			if (dfs(v, nownode, targetnode)) {
				sb.append("yes");
			} else {
				sb.append("no");
			}
			sb.append("\n");
		}

		System.out.print(sb);

	}

	static boolean dfs(node[] v, int startnode, int targetnode) {

		boolean judge = false;

		Deque<Integer> dfs = new ArrayDeque<Integer>();

		dfs.offer(startnode);

		int count = 0;

		while (!(dfs.isEmpty())) {

			int now_node = dfs.poll();

			count++;

			if (count > 10) {
				break;
			}

			for (int i = 0; i < v[now_node].graph.size(); i++) {
				int next_node = v[now_node].graph.get(i);
				if (targetnode == next_node) {
					judge = true;
					break;
				}
				dfs.offer(next_node);
			}
			if (judge)
				break;
		}

		if (judge) {
			return true;
		} else {
			return false;
		}

	}

	public static class node {

		List<Integer> graph;

		public node() {
			this.graph = new ArrayList<Integer>();
		}
	}

}