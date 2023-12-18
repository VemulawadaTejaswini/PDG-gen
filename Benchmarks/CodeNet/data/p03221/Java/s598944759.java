import java.util.*;

/**
 * year -> orderの変換を作る
 * 
 * @author glycine
 *
 */
public class Main {
	private static class Node {
		int p;
		long y;
		int order = -1;

		public Node(int p, long y) {
			this.p = p;
			this.y = y;
		}
	}

	int N, M;
	int[] indexes;
	List<Node> nodes;
	Map<Long, Node> maps = new TreeMap<>();
	List<String> results;

	public Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		indexes = new int[N];
		Arrays.fill(indexes, 0);
		nodes = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			int p = in.nextInt();
			long y = in.nextLong();
			Node node = new Node(p, y);
			nodes.add(node);
			maps.put(node.y, node);
		}
		in.close();
	}

	private void calc() {
		for (Node city: maps.values()) {
			++indexes[city.p - 1];
			city.order = indexes[city.p - 1];
		}
	}

	private void show() {
		for (int i = 0; i < nodes.size(); ++i) {
			Node node = nodes.get(i);
			int p = node.p;
			int order = node.order;
			String line = String.format("%06d", p) + String.format("%06d", order);
			System.out.println(line);
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}
}