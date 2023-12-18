import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		Map<Integer, Integer> edgeTypes;

		Node(int id) {
			this.id = id;
			this.edgeTypes = new HashMap<>();
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		List<Node> nodes = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			nodes.add(new Node(i));
		}
		addEdge(nodes, 1);

		for (int i = 0; i + 1 < N; ++i) {
			Node node = nodes.get(i);
			for (int j = i + 1; j < N; ++j) {
				System.out.print(node.edgeTypes.get(j) + " ");
			}
			System.out.println("");
		}

	}

	static void addEdge(List<Node> nodes, int val) {
		if (nodes.size() == 2) {
			Node node = nodes.get(0);
			Node another = nodes.get(1);
			node.edgeTypes.put(another.id, val);
			another.edgeTypes.put(node.id, val);
		} else if (nodes.size() == 3) {
			for (int i = 0; i < 2; ++i) {
				nodes.get(i).edgeTypes.put(nodes.get(i + 1).id, val);
				nodes.get(i + 1).edgeTypes.put(nodes.get(i).id, val);
			}
			nodes.get(0).edgeTypes.put(nodes.get(2).id, val + 1);
			nodes.get(2).edgeTypes.put(nodes.get(0).id, val + 1);
		} else {
			// Listを2つに分ける
			List<Node> listA = new ArrayList<>();
			List<Node> listB = new ArrayList<>();
			for (int i = 0; i < nodes.size() / 2; ++i) {
				listA.add(nodes.get(i));
			}
			for (int i = listA.size(); i < nodes.size(); ++i) {
				listB.add(nodes.get(i));
			}
			// list間のedgeにvalの値を付与
			for (Node node : listA) {
				for (Node another : listB) {
					node.edgeTypes.put(another.id, val);
					another.edgeTypes.put(node.id, val);
				}
			}
			addEdge(listA, val + 1);
			addEdge(listB, val + 1);
		}
	}

}
