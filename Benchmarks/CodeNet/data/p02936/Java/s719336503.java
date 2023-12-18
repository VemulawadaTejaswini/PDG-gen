import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		Set<Integer> childrenIds = new HashSet<>();
		Set<Node> children = new HashSet<>();
		int counter = 0;

		Node(int id) {
			this.id = id;
		}

		void findChildren(Set<Integer> set) {
			if (set == null) {
				childrenIds.add(this.id);
				for (Node node : children) {
					node.findChildren(this.childrenIds);
				}
			} else {
				this.childrenIds.addAll(set);
				this.childrenIds.add(this.id);
				for (Node node : children) {
					node.findChildren(this.childrenIds);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int Q = Integer.parseInt(tokens[1]);

		Node[] tree = new Node[N];
		for (int i = 0; i < N; ++i) {
			tree[i] = new Node(i);
		}
		for (int i = 0; i < N - 1; ++i) {
			tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			tree[a].children.add(tree[b]);
		}
		tree[0].findChildren(null);

		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			int p = Integer.parseInt(tokens[0]) - 1;
			int q = Integer.parseInt(tokens[1]);
			for (Node node : tree) {
				if (node.childrenIds.contains(p)) {
					node.counter += q;
				}
			}
		}
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(Integer.toString(tree[0].counter));
		for (int i = 1; i < N; ++i) {
			strBuilder.append(" " + Integer.toString(tree[i].counter));
		}
		System.out.println(strBuilder.toString());
	}
}