import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		var group = new UnionFind(N);
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.get())-1;
			int B = Integer.parseInt(sc.get())-1;
			group.union(A, B);
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, group.size(i));
		}
		System.out.println(max);
	}
}

class UnionFind {
	int[] parent;

	UnionFind(int size) {
		parent = new int[size];
		Arrays.fill(parent, -1);
	}

	int find(int i) {
		if (parent[i] < 0) return i;
		return parent[i] = find(parent[i]);
	}

	int size(int i) {
		return -parent[find(i)];
	}

	boolean same(int i, int j) {
		return find(i) == find(j);
	}

	boolean union(int i, int j) {
		i = find(i);
		j = find(j);
		if (i == j) return false;
		if (size(i) < size(j)) {
			int temp = i;
			i = j;
			j = temp;
		}

		parent[i] += parent[j];
		parent[j] = i;
		return true;
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}