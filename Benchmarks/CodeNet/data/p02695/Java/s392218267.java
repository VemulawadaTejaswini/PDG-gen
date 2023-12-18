import java.io.*;
import java.util.*;
import java.util.function.*;

final class Quad {
	int a, b, c, d;

	Quad(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int Q = Integer.parseInt(sc.get());
		Quad[] quads = new Quad[Q];
		for (int i = 0; i < Q; i++) {
			quads[i] = new Quad(Integer.parseInt(sc.get()) - 1, Integer.parseInt(sc.get()) - 1, Integer.parseInt(sc.get()), Integer.parseInt(sc.get()));
		}

		var arrays = createArrays(new int[N], 1, M ,0);

		int max = 0;
		for (int[] array : arrays) {
			int point = 0;
			for (Quad quad : quads) {
				if (array[quad.b] - array[quad.a] == quad.c) point += quad.d;
			}
			max = Math.max(max, point);
		}

		System.out.println(max);
	}

	Collection<int[]> createArrays(int[] filled, int min, int max, int target) {
		if (target >= filled.length) return Collections.singleton(filled);
		List<int[]> list  =new ArrayList<>();
		for (int i = min; i <= max; i++) {
			var copy = Arrays.copyOf(filled, filled.length);
			copy[target] = i;
			list.addAll(createArrays(copy, i, max, target + 1));
		}
		return list;
	}
}

class Main {
	public static void main(String... args) {
		try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
			Solver.INSTANCE.solve(new Supplier<>() {
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
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}