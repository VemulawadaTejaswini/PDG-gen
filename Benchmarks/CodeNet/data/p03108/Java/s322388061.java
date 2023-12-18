
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();

		int[][] AB = new int[M][2];

		for (int i = 0; i < M; i++) {
			AB[i][0] = in.nextInt();
			AB[i][1] = in.nextInt();
		}

		Node[] nodes = new Node[N];
		for (int i = 0; i < N; i++) {
			nodes[i] = new Node();
			nodes[i].no = i + 1;
		}
		for (int[] ab : AB) {
			nodes[ab[0] - 1].link.add(nodes[ab[1] - 1]);
			nodes[ab[1] - 1].link.add(nodes[ab[0] - 1]);
		}

		boolean[] checked = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			long ans = 0;
			nodes[AB[i][0] - 1].link.remove(nodes[AB[i][1] - 1]);
			nodes[AB[i][1] - 1].link.remove(nodes[AB[i][0] - 1]);

			Arrays.fill(checked, false);
			for (Node node : nodes) {
				if (checked[node.no]) {
					continue;
				}
				Set<Node> list = node.getSet();
				for (Node node2 : list) {
					checked[node2.no] = true;
				}
				ans += list.size() * (N - list.size());
			}
			System.out.println(ans / 2);
		}
	}

	static class Node {
		int no;
		List<Node> link = new ArrayList<>();

		Set<Node> getSet() {
			return getSet(new HashSet<>());
		}

		Set<Node> getSet(Set<Node> list) {
			list.add(this);
			for (Node node : link) {
				if (list.contains(node)) {
					continue;
				}
				list.addAll(node.getSet(list));
			}
			return list;
		}
	}
}
