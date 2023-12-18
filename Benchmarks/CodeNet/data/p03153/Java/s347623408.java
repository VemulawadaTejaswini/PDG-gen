import java.util.*;

public class Main {
	static class Edge {
		long Ai, Aj;
		int i, j;
		long cost;

		public Edge(long ai, long aj, int i, int j) {
			Ai = ai;
			Aj = aj;
			this.i = i;
			this.j = j;
			cost = Math.abs(i - j) * Main.D + Ai + Aj;
		}
	}

	int N;
	static long D;
	List<Long> A;
	List<Edge> edges;

	void calc() {
		Queue<Edge> queue = new PriorityQueue<>(new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				if (o1.cost < o2.cost) {
					return -1;
				} else if (o1.cost > o2.cost) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		for (int i = 1; i < A.size(); ++i) {
			queue.add(new Edge(A.get(0), A.get(i), 0, i));
		}
		edges = new ArrayList<>();
		Set<Integer> remainSet = new HashSet<>();
		for (int i = 1; i < A.size(); ++i) {
			remainSet.add(i);
		}
		while (!remainSet.isEmpty()) {
			// まず，edgeの中から最も短いものを取得する
			Edge edge = queue.poll();
			// edgeは，両端が処理済み or どちらかが新しいはず
			if (!remainSet.contains(edge.i) && !remainSet.contains(edge.j)) {
				// すでにつながっている
				continue;
			}
			int newIndex = -1;
			if (remainSet.contains(edge.i)) {
				newIndex = edge.i;
			} else {
				newIndex = edge.j;
			}
			edges.add(edge);
			remainSet.remove(newIndex);
			// newIndexからつながる辺を求める
			for (Integer dst : remainSet) {
				queue.add(new Edge(A.get(newIndex), A.get(dst), newIndex, dst));
			}
		}
	}

	long getCost() {
		long sum = 0;
		for (Edge edge : edges) {
			sum += edge.cost;
		}
		return sum;
	}

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		D = Long.parseLong(tokens[1]);
		tokens = in.nextLine().split(" ");
		A = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			A.add(Long.parseLong(tokens[i]));
		}
		in.close();
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.getCost());
	}
}