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
	List<Node> nodes;
	Map<Integer, Queue<Node>> maps = new HashMap<>();
	Map<Integer, Map<Long, Integer>> infos = new HashMap<>();
	List<String> results;

	public Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		nodes = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			int p = in.nextInt();
			long y = in.nextLong();
			nodes.add(new Node(p, y));
		}
		in.close();
		results = new ArrayList<>(M);
	}

	private void calc() {
		for (int i = 0; i < M; ++i) {
			Node node = nodes.get(i);
			int p = node.p;
			long y = node.y;
			if (!maps.containsKey(p)) {
				maps.put(p, new PriorityQueue<Node>(new Comparator<Node>() {
					@Override
					public int compare(Node o1, Node o2) {
						if (o1.y < o2.y) {
							return -1;
						} else if (o1.y > o2.y) {
							return 1;
						} else {
							return 0;
						}
					}
				}));
			}
			maps.get(p).offer(node);
		}

		for (Integer p : maps.keySet()) {
			int index = 1;
			Queue<Node> cities = maps.get(p);
			Map<Long, Integer> eachMap = new HashMap<Long, Integer>();
			while (!cities.isEmpty()) {
				Node city = cities.poll();
				eachMap.put(city.y, index);
				++index;
			}
			infos.put(p, eachMap);
		}
	}

	private String p2Str(int p) {
		return String.format("%06d", p);
	}

	private void show() {
		for (int i = 0; i < nodes.size(); ++i) {
			Node node = nodes.get(i);
			int p = node.p;
			int order = infos.get(node.p).get(node.y);
			String line = p2Str(p) + p2Str(order);
			System.out.println(line);
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}

}