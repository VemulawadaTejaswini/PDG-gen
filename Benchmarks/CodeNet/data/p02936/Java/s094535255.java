import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	HashSet[] nodes;

	int[] cntrs;

	void exec(String[] args) {
		String[] nq = args[0].split(" ");
		int n = Integer.parseInt(nq[0]);
		int q = Integer.parseInt(nq[1]);
		nodes = new HashSet[n + 1];
		cntrs = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			nodes[i] = new HashSet();
		}
		for (int i = 1; i < n; i++) {
			String[] pc = args[i].split(" ");
			int p = Integer.parseInt(pc[0]);
			int c = Integer.parseInt(pc[1]);
			nodes[p].add(c);
			nodes[c].add(p);
		}
		for (int i = n; i < n + q; i++) {
			String[] px = args[i].split(" ");
			int p = Integer.parseInt(px[0]);
			int x = Integer.parseInt(px[1]);
			cntrs[p] += x;
		}
		add(0, 1);
		System.out.println(
			IntStream.rangeClosed(1, n)
				.map(i -> cntrs[i])
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(" ")));
	}

	void add(int p, int n) {
		for (Object nc : nodes[n]) {
			int c = (int)nc;
			if (c != p) {
				cntrs[c] += cntrs[n];
				add(n, c);
			}
		}
	}

}
