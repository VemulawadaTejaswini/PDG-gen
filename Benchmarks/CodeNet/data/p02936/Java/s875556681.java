import java.util.ArrayList;
import java.util.List;
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
				list.get(scn.nextInt() - 1).cnt += scn.nextInt();
			}

			for (Node n : list.get(0).children) {
				add(n, list.get(0).cnt);
			}

			for (int i = 0; i < N - 1; i++) {
				System.out.print(list.get(i).cnt);
				System.out.print(" ");
			}
			System.out.println(list.get(N - 1).cnt);
		}
	}

	static void add(Node n, int x) {
		n.cnt += x;
		for (Node b : n.children) {
			add(b, n.cnt);
		}
	}

	static class Node {
		int cnt;
		List<Node> children = new ArrayList<>();
	}
}
