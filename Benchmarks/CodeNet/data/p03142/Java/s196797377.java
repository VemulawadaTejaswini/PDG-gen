import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		BitSet[] graph = new BitSet[N];
		BitSet[] reversed = new BitSet[N];
		int root;
		{
			BitSet child = new BitSet(N);
			Arrays.setAll(graph, $ -> new BitSet(N));
			Arrays.setAll(reversed, $ -> new BitSet(N));
			for (int i = 0; i < N - 1 + M; i++) {
				int A = Integer.parseInt(sc.get()) - 1;
				int B = Integer.parseInt(sc.get()) - 1;

				graph[A].set(B);
				reversed[B].set(A);

				child.set(B);
			}
			root = child.nextClearBit(0);
		}

		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(root);
		int[] parent = new int[N];
		while (!queue.isEmpty()) {
			int remove = queue.remove();
			for (int next = graph[remove].nextSetBit(0); next >= 0; next = graph[remove].nextSetBit(next)) {
				reversed[next].clear(remove);
				if (!reversed[next].isEmpty()) continue;
				parent[next] = remove;
				queue.add(next);
			}
		}
		parent[root] = -1;
		for (int i : parent) {
			System.out.println(i + 1);
		}
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
		System.out.flush();
	}
}