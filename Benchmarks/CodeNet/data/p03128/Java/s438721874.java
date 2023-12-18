import java.io.*;
import java.util.*;
import java.util.function.*;

class Pair {
	int a, b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int[] A = new int[M];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int[] num = {-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		Pair[] usable = new Pair[M];
		for (int i = 0; i < M; i++) {
			usable[i] = new Pair(A[i], num[A[i]]);
		}
		Arrays.sort(usable, Comparator.comparingInt((Pair p) -> p.b).thenComparingInt(p -> p.a));
		TreeMap<Integer, Integer> higher = new TreeMap<>();
		for (Pair pair : usable) {
			higher.put(pair.b, pair.a);
		}


		Integer integer = higher.firstKey();
		while (integer != null) {
			StringBuilder sb = new StringBuilder();
			if (!dfs(N, 0, higher, sb)) {
				integer = higher.higherKey(integer);
				continue;
			}

			char[] chars = sb.toString().toCharArray();
			Arrays.sort(chars);
			System.out.println(new StringBuilder(String.valueOf(chars)).reverse());
			return;
		}
	}

	boolean dfs(int remainingMatch, Integer key, TreeMap<Integer, Integer> tree, StringBuilder result) {
		if (remainingMatch == 0) return true;
		Map.Entry<Integer, Integer> higherEntry = tree.ceilingEntry(key);
		int use = higherEntry.getKey();
		remainingMatch -= use;
		if (remainingMatch < 0) return false;

		Integer next = higherEntry.getKey();
		while (next != null) {
			if (dfs(remainingMatch, next, tree, result)) {
				result.append(higherEntry.getValue());
				return true;
			}
			next = tree.higherKey(next);
		}
		return false;
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