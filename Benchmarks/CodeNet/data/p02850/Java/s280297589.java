import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			@SuppressWarnings("unchecked")
			List<Path>[] pathLists = new List[n];
			IntStream.range(0, n).forEach(i -> pathLists[i] = new ArrayList<>());
			Path[] paths = new Path[n - 1];
			IntStream.range(0, n - 1).forEach(i -> {
				int from = scanner.nextInt() - 1;
				int to = scanner.nextInt() - 1;
				paths[i] = new Path(from, to);
				pathLists[from].add(paths[i]);
				pathLists[to].add(paths[i]);
			});
			int maxColor = 0;
			int maxColorNode = 0;
			for (int node = 0; node < n; node++) {
				if (pathLists[node].size() > maxColor) {
					maxColor = pathLists[node].size();
					maxColorNode = node;
				}
			}
			paint(maxColorNode, pathLists, new boolean[n]);
			System.out.println(maxColor);
			Arrays.stream(paths).forEach(path -> System.out.println(path.color));
		}
	}

	private static void paint(int node, final List<Path>[] pathLists, boolean[] visited) {
		if (!visited[node]) {
			int color = 1;
			Set<Integer> colorSet = pathLists[node].stream().filter(path -> path.color != 0).map(path -> path.color)
					.collect(Collectors.toSet());
			for (Path path : pathLists[node]) {
				if (colorSet.contains(color)) {
					color++;
				}
				if (path.color == 0) {
					path.color = color;
					color++;
				}
			}
			visited[node] = true;
			for (Path path : pathLists[node]) {
				paint(path.getNextNode(node), pathLists, visited);
			}
		}
	}

	/**
	 * ノード間の一つのパスを表すクラス
	 */
	private static class Path {
		int node1;
		int node2;
		/** 色 */
		int color;

		Path(int node1, int node2) {
			super();
			this.node1 = node1;
			this.node2 = node2;
			this.color = 0;
		}

		int getNextNode(int currentNode) {
			if (currentNode == node1) {
				return node2;
			} else {
				return node1;
			}
		}
	}
}
