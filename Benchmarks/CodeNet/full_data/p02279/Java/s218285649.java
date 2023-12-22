import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

class Node {
	int id;
	int jisu;
	int parent = -1;
	int[] childs = new int[0];
	int depth;

	public String getChildsStr() {
		StringJoiner sj = new StringJoiner(", ");
		for(int child : this.childs) {
			sj.add(String.valueOf(child));
		}

		return "[" + sj.toString() + "]";
	}
}

class Main {
	public static void main(String[] args) {

		int n = 0;
		Node[] nodes = null;

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			n = Integer.parseInt(br.readLine());
			nodes = new Node[n];

			for (int i = 0; i < n; i++) {
				nodes[i] = new Node();
			}

			for (int i = 0; i < n; i++) {

				String[] infos = br.readLine().split(" ");

				int nowId = Integer.parseInt(infos[0]);
				Node now = nodes[nowId];

				now.id = nowId;
				now.jisu = Integer.parseInt(infos[1]);

				now.childs = new int[now.jisu];

				if (now.jisu == 0) continue;

				for (int j = 0; j < now.jisu; j++) {
					int child = Integer.parseInt(infos[2+j]);

					now.childs[j] = child;
					nodes[child].parent = now.id;
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		Node root = null;
		for(Node node : nodes) {
			if (node.parent == -1) {
				root = node;
				break;
			}
		}
		root.depth = 0;

		setDepth(root, nodes);

		for(Node node : nodes) {
			String kind;
			if (node.parent == -1) {
				kind = "root";
			} else if (node.jisu == 0) {
				kind = "leaf";
			} else {
				kind = "internal node";
			}

			String info = String.format("node %d: parent = %d, depth = %d, %s, %s",
					node.id,
					node.parent,
					node.depth,
					kind,
					node.getChildsStr());

			System.out.println(info);

		}

	}

	private static void setDepth(Node node, Node[] nodes) {

		if (node.jisu == 0) return;

		for(int child : node.childs) {
			nodes[child].depth = node.depth + 1;
			setDepth(nodes[child], nodes);
		}
	}
}