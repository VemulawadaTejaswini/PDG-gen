import java.io.*;
import java.util.*;
import java.util.function.*;

class Cost<T>{
	int cost;
	T thing;

	Cost(int cost, T thing) {
		this.cost = cost;
		this.thing = thing;
	}
}

class Pair {
	int x, y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Pair pair = (Pair) o;

		if (x != pair.x) return false;
		return y == pair.y;
	}

	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		return result;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());

		BitSet[] black = new BitSet[H];
		Arrays.setAll(black, $ -> new BitSet(W));
		Queue<Cost<Pair>> queue = new ArrayDeque<>();
		for (int i = 0; i < H; i++) {
			char[] data = sc.get().toCharArray();
			for (int j = 0; j < W; j++) {
				if (data[j] == '#') {
					Pair pair = new Pair(i, j);
					black[i].set(j);
					queue.add(new Cost<>(0, pair));
				}
			}
		}

		int max = 0;

		while (!queue.isEmpty()) {
			Cost<Pair> next = queue.remove();
			max = Math.max(max, next.cost);
			int x = next.thing.x;
			int y = next.thing.y;
			int cost = next.cost + 1;
			enqueue(x + 1, y, cost, H, W, black, queue);
			enqueue(x - 1, y, cost, H, W, black, queue);
			enqueue(x, y + 1, cost, H, W, black, queue);
			enqueue(x, y - 1, cost, H, W, black, queue);
		}

		System.out.println(max);
	}

	void enqueue(int x, int y,int cost,int H,int W, BitSet[] black, Queue<Cost<Pair>> queue){
		if (x < 0 || x >= W || y < 0 || y >= H) return;
		Pair pair = new Pair(x, y);
		if (black[y].get(x)) return;
		queue.add(new Cost<>(cost, pair));
		black[y].set(x);
	}
}

class Main {
	public static void main(String... args) {
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
	}
}