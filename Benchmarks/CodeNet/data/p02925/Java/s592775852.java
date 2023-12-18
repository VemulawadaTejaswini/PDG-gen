import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		Set<Node> prevs, nexts;
		int small, large;

		Node(int small, int large) {
			this.small = small;
			this.large = large;
			this.prevs = new HashSet<>();
			this.nexts = new HashSet<>();
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		// graph作成
		Node[][] graph = new Node[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < i; ++j) {
				Node node = new Node(j, i);
				graph[i][j] = node;
				graph[j][i] = node;
			}
		}

		// Node間にedge作成
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			int prev = Integer.parseInt(tokens[0]) - 1;
			for (int j = 1; j < tokens.length; ++j) {
				int val = Integer.parseInt(tokens[j]) - 1;
				graph[i][val].prevs.add(graph[i][prev]);
				graph[i][prev].nexts.add(graph[i][val]);
				prev = val;
			}
		}

		// graphを1次元リストに変換
		Set<Node> nodes = new HashSet<>();
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < i; ++j) {
				nodes.add(graph[j][i]);
			}
		}
		boolean possible = true;
		int count = 0;
		while (!nodes.isEmpty()) {
			Set<Node> removes = new HashSet<>();
			for (Node node : nodes) {
				if (node.prevs.isEmpty()) {
					removes.add(node);
				}
			}
			if (removes.isEmpty()) {
				// 閉路あり
				possible = false;
				break;
			}
			for (Node remove : removes) {
				for (Node next : remove.nexts) {
					next.prevs.remove(remove);
				}
			}
			nodes.removeAll(removes);
			++count;
		}

		if (!possible) {
			System.out.println("-1");
		} else {
			System.out.println(count);
		}

	}

}
