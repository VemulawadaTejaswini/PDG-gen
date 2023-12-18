import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		String[] nq = args[0].split(" ");
		int n = Integer.parseInt(nq[0]);
		int q = Integer.parseInt(nq[1]);
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = new Node();
		}
		for (int i = 1; i < n; i++) {
			String[] pc = args[i].split(" ");
			int p = Integer.parseInt(pc[0]);
			int c = Integer.parseInt(pc[1]);
			nodes[p - 1].children.add(nodes[c - 1]);
		}
		for (int i = n; i < n + q; i++) {
			String[] px = args[i].split(" ");
			int p = Integer.parseInt(px[0]);
			int x = Integer.parseInt(px[1]);
			nodes[p - 1].add(x);
		}
		System.out.println(
			IntStream.range(0, n)
				.map(i -> nodes[i].cntr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(" ")));
	}

	static class Node {

		int cntr;

		List<Node> children = new ArrayList<>();

		void add(int x) {
			cntr += x;
			for (Node n : children) {
				n.add(x);
			}
		}

	}

}
