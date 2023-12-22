import java.io.*;
import java.util.*;
import java.util.function.*;

class Range implements Comparable<Range> {
	int start, end;

	Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	boolean isIn(int x) {
		return start <= x && x <= end;
	}

	public int compareTo(Range o) {
		return Comparator.comparingInt((Range r) -> r.start).compare(this, o);
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		Range[] ranges = new Range[N];
		for (int i = 0; i < N; i++) {
			int A = Integer.parseInt(sc.get());
			int B = Integer.parseInt(sc.get());
			ranges[i] = new Range(A, B);
		}

		Range[] startOrder = Arrays.copyOf(ranges, ranges.length);
		Arrays.sort(startOrder, Comparator.comparingInt(r -> r.start));
		Deque<Range> startDeque = new ArrayDeque<>(Arrays.asList(startOrder));

		Deque<Range> endDeque = new ArrayDeque<>();

		var current = new PriorityQueue<Range>(Comparator.comparingInt(r -> r.end));

		int count = 0;
		for (int i = 0; i <= 1000000000; i++) {
			while (!startDeque.isEmpty()) {
				var nextStart = startDeque.getFirst();
				if (!nextStart.isIn(i)) break;
				current.add(startDeque.removeFirst());
			}

			while (!current.isEmpty()) {
				var nextEnd = current.element();
				if (nextEnd.isIn(i)) break;
				endDeque.add(current.remove());
			}

			int ended = endDeque.size();
			int canBeLeft = current.size();
			int mustBeLeft = ended;
			if (!(mustBeLeft > N / 2) && N / 2 <= mustBeLeft + canBeLeft) {
				if (!current.isEmpty())
					count++;
			}
		}
		System.out.println(count);
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
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
		System.out.flush();
	}
}