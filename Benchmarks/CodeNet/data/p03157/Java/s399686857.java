import java.util.*;

public class Main {
	static class Node {
		int index;
		int color;
		int h, w;

		Node(int index, int color, int h, int w) {
			this.index = index;
			this.color = color;
			this.h = h;
			this.w = w;
		}
	}

	int H, W;
	Node[][] cells;
	boolean[][] flags;
	Set<Map<Integer, Node>> nodeGroups;
	long result = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		cells = new Node[H][W];
		for (int i = 0; i < H; ++i) {
			String line = in.nextLine();
			for (int j = 0; j < W; ++j) {
				char c = line.charAt(j);
				if (c == '#') {
					cells[i][j] = new Node(i * W + j, 0, i, j);
				} else {
					cells[i][j] = new Node(i * W + j, 1, i, j);
				}
			}
		}
		in.close();
		flags = new boolean[H][W];
		for (int h = 0; h < H; ++h) {
			Arrays.fill(flags[h], false);
		}
		nodeGroups = new HashSet<>();
	}

	Node getInitNode() {
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				if (!flags[h][w]) {
					return cells[h][w];
				}
			}
		}
		return null;
	}

	void calc() {
		while (true) {
			Node node = getInitNode();
			if (node == null) {
				break;
			}
			Map<Integer, Node> groups = new HashMap<>();
			nodeGroups.add(getGroups(node, groups));
		}
		result = count();
	}

	long count() {
		long result = 0L;
		for (Map<Integer, Node> group : nodeGroups) {
			int whiteNum = 0, blackNum = 0;
			for (Node node : group.values()) {
				if (node.color == 0) {
					++whiteNum;
				} else {
					++blackNum;
				}
			}
			result += whiteNum * blackNum;
		}
		return result;
	}

	boolean canMove(Node a, Node b) {
		if (a.color != b.color) {
			return true;
		} else {
			return false;
		}
	}

	Map<Integer, Node> getGroups(Node node, Map<Integer, Node> group) {
		group.put(node.index, node);
		Map<Integer, Node> result = group;
		int h = node.h;
		int w = node.w;
		flags[h][w] = true;

		if (1 <= node.w) {
			if (canMove(cells[h][w], cells[h][w - 1]) && !flags[h][w - 1]) {
				result = getGroups(cells[h][w - 1], result);
			}
		}
		if (node.w + 1 < W) {
			if (canMove(cells[h][w], cells[h][w + 1]) && !flags[h][w + 1]) {
				result = getGroups(cells[h][w + 1], result);
			}
		}
		if (1 <= node.h) {
			if (canMove(cells[h][w], cells[h - 1][w]) && !flags[h - 1][w]) {
				result = getGroups(cells[h - 1][w], result);
			}
		}
		if (node.h + 1 < H) {
			if (canMove(cells[h][w], cells[h + 1][w]) && !flags[h + 1][w]) {
				result = getGroups(cells[h + 1][w], result);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);

	}

}