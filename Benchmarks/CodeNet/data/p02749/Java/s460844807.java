import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	Node[] nodes;
	boolean enable = true;

	static class Node {
		int id;
		Set<Integer> conn;
		int color;
		int number;

		Node(int id) {
			this.id = id;
			this.color = -1;
			this.conn = new HashSet<>();
			this.number = -1;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			this.nodes[i] = new Node(i);
		}
		for (int i = 0; i < N - 1; ++i) {
			String[] tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			nodes[a].conn.add(b);
			nodes[b].conn.add(a);
		}
	}

	void mark(int current, int parent, int color, boolean isInv) {
		// isInvがfalseの時: 昇順，falseの時: 降順
		nodes[current].color = color;
		int nextColor = color;
		boolean nextIsInv = isInv;
		if (!isInv) {
			if (color == 3) {
				nextIsInv = !isInv;
				nextColor -= 1;
			} else {
				nextColor += 1;
			}
		} else {
			if (color == 0) {
				nextIsInv = !isInv;
				nextColor += 1;
			} else {
				nextColor -= 1;
			}
		}
		for (Integer next : nodes[current].conn) {
			if (next == parent) {
				continue;
			}
			mark(next, current, nextColor, nextIsInv);
		}
	}

	void calc() {
		// 色付けをする
		mark(0, -1, 3, true);
		// Nodeを色ごとに振り分ける
		Map<Integer, List<Node>> map = new HashMap<>();
		for (int i = 0; i <= 3; ++i) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < N; ++i) {
			int key = nodes[i].color;
			map.get(key).add(nodes[i]);
		}
		// 値を付けるpoolを用意する
		Map<Integer, Deque<Integer>> numberPools = new HashMap<>();
		for (int i = 0; i < 3; ++i) {
			Deque<Integer> deque = new ArrayDeque<>();
			for (int j = i + 1; j <= N; j += 3) {
				deque.add(j);
			}
			numberPools.put((i + 1) % 3, deque);
		}
		// 値を割り付ける
		// mod0, mod1とmod2
		for (int i = 0; i < 3; ++i) {
			List<Node> nodeList = map.get(i);
			Deque<Integer> numberPool = numberPools.get(i);
			for (int j = 0; j < nodeList.size(); ++j) {
				if (numberPool.isEmpty()) {
					break;
				}
				nodeList.get(j).number = numberPool.pollFirst();
			}
		}
		// 割り付けが終わっていないもののうち，mod1, mod2に対してはnumberpool3から割り振る
		Deque<Integer> num3Pool = numberPools.get(0);
		for (int i = 1; i < 3; ++i) {
			List<Node> nodeList = map.get(i);
			for (int j = nodeList.size() - 1; j >= 0; --i) {
				if (nodeList.get(j).number >= 0) {
					break;
				}
				if (num3Pool.isEmpty()) {
					this.enable = false;
					break;
				}
				nodeList.get(j).number = num3Pool.pollFirst();
			}
		}
		if (!this.enable) {
			return;
		}
		// mod3を適当に割り付ける
		Deque<Integer> remainNumber = new ArrayDeque<>();
		for (Deque<Integer> deque : numberPools.values()) {
			remainNumber.addAll(deque);
		}
		for (int i = 0; i < map.get(3).size(); ++i) {
			Node node = map.get(3).get(i);
			node.number = remainNumber.pollFirst();
		}
	}

	String show() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(nodes[0].number);
		for (int i = 1; i < nodes.length; ++i) {
			strBuilder.append(" " + nodes[i].number);
		}
		return strBuilder.toString();
	}

	void showResult() {
		if (!enable) {
			System.out.println("-1");
		} else {
			System.out.println(show());
		}

	}

}
