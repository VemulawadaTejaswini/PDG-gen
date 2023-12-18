import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static class Node {
		public int id;
		public char c;
		public Set<Integer> dsts = new HashSet<>();

		public Node(int id, char c) {
			this.id = id;
			this.c = c;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		String s = in.nextLine();
		char[] nodeType = new char[N];
		for (int i = 0; i < N; ++i) {
			nodeType[i] = s.charAt(i);
		}
		// Nodeを作成する
		Map<Integer, Node> map = new HashMap<>();
		for (int i = 1; i <= N; ++i) {
			Node node = new Node(i, nodeType[i - 1]);
			map.put(i, node);
		}
		// Edgeを読み込む
		for (int i = 0; i < M; ++i) {
			tokens = in.nextLine().split(" ");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[1]);
			map.get(a).dsts.add(b);
			map.get(b).dsts.add(a);
		}

		// edgeの本数が1以下のノードを全部削除する
		while (true) {
			// 隣接するノードの種類が1種類以下のものを削除する
			Set<Integer> removeKeys = new HashSet<>();
			for (Integer key : map.keySet()) {
				Node node = map.get(key);
				Set<Character> types = new HashSet<>();
				for (Integer next : node.dsts) {
					types.add(map.get(next).c);
				}
				if (types.size() <= 1) {
					removeKeys.add(key);
				}
			}
			if (removeKeys.isEmpty()) {
				break;
			}
			for (Integer key : removeKeys) {
				map.remove(key);
			}
			for (Integer key : map.keySet()) {
				map.get(key).dsts.removeAll(removeKeys);
			}
		}

		boolean result = check(map);
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		in.close();
	}

	public static boolean check(Map<Integer, Node> nodes) {
		boolean result = false;
		for (Integer node : nodes.keySet()) {
			result = result || check(nodes, node, node, 3);
		}
		return result;
	}

	public static boolean check(Map<Integer, Node> nodes, int currentNode, int startNode, int remain) {
		Node node = nodes.get(currentNode);
		switch (remain) {
		case 3:
			if (node.c != 'A') {
				return false;
			} else {
				boolean result = false;
				for (Integer next : node.dsts) {
					if (nodes.get(next).c == 'A') {
						result = result || check(nodes, next, startNode, 2);
					}
				}
				return result;
			}
		case 2: {
			boolean result = false;
			for (Integer next : node.dsts) {
				if (nodes.get(next).c == 'B') {
					result = result || check(nodes, next, startNode, 1);
				}
			}
			return result;
		}
		case 1: {
			boolean result = false;
			for (Integer next : node.dsts) {
				if (nodes.get(next).c == 'B') {
					result = result || check(nodes, next, startNode, 0);
				}
			}
			return result;
		}
		case 0:
		default:
			if (node.dsts.contains(startNode)) {
				return true;
			} else {
				return false;
			}
		}
	}
}