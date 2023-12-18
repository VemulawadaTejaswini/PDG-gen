import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();
			final int Q = scn.nextInt();

			List<Node> list = new ArrayList<>(N);
			for (int i = 0; i < N; i++) {
				Node n = new Node();
				list.add(n);
			}
			for (int i = 0; i < N - 1; i++) {
				Node an = list.get(scn.nextInt() - 1);
				Node bn = list.get(scn.nextInt() - 1);
				an.children.add(bn);
			}

			for (int i = 0; i < Q; i++) {
				final Queue<Node> queue = new ArrayDeque<>();
				queue.add(list.get(scn.nextInt() - 1));
				final int x = scn.nextInt();

				while (!queue.isEmpty()) {
					Node n = queue.poll();
					n.cnt += x;
					queue.addAll(n.children);
				}
			}

			for (int i = 0; i < N - 1; i++) {
				System.out.print(list.get(i).cnt);
				System.out.print(" ");
			}
			System.out.println(list.get(N - 1).cnt);
		}
	}

	static class Node {
		int cnt;
		List<Node> children = new ArrayList<>();
	}
}
