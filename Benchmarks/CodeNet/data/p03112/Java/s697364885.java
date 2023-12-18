import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int A = Integer.parseInt(sc.get());
		int B = Integer.parseInt(sc.get());
		int Q = Integer.parseInt(sc.get());
		long[] S = new long[A];
		Arrays.setAll(S, $ -> Long.parseLong(sc.get()));
		long[] T = new long[B];
		Arrays.setAll(T, $ -> Long.parseLong(sc.get()));

		long[] X = new long[Q];
		Arrays.setAll(X, $ -> Long.parseLong(sc.get()));

		for (long x : X) {
			var s_exact_idx = Arrays.binarySearch(S, x);
			var t_exact_idx = Arrays.binarySearch(T, x);
			var s_ceil_index = -s_exact_idx - 1;
			var t_ceil_index = -t_exact_idx - 1;
			var s_floor_index = s_ceil_index - 1;
			var t_floor_index = t_ceil_index - 1;

			long minDistance = Long.MAX_VALUE;
			if (s_exact_idx >= 0) {
				minDistance = nearestLength(T, s_ceil_index, x);
			}
			if (t_exact_idx >= 0) {
				minDistance = nearestLength(T, t_ceil_index, x);
			}
			if (s_ceil_index < S.length) {
				var s_ceil_distance = Math.abs(x - S[s_ceil_index]);
				if (t_ceil_index < T.length) {
					minDistance = Math.min(minDistance, Math.max(s_ceil_distance, Math.abs(x - T[t_ceil_index])));
				}
				if (t_floor_index >= 0) {
					var t_floor_distance = Math.abs(x - T[t_floor_index]);
					minDistance = Math.min(minDistance, 2 * Math.min(s_ceil_distance, t_floor_distance) + Math.max(s_ceil_distance, t_floor_distance));
				}
			}
			if (s_floor_index >= 0) {
				var s_floor_distance = Math.abs(x - S[s_floor_index]);
				if (t_floor_index >= 0) {
					minDistance = Math.min(minDistance, Math.max(s_floor_distance, Math.abs(x - T[t_floor_index])));
				}
				if (t_ceil_index < T.length) {
					var t_ceil_distance = Math.abs(x - T[t_ceil_index]);
					minDistance = Math.min(minDistance, 2 * Math.min(s_floor_distance, t_ceil_distance) + Math.max(s_floor_distance, t_ceil_distance));
				}
			}
			System.out.println(minDistance);
		}
	}

	long nearestLength(long[] array, int ceilIndex, long from) {
		long min = Integer.MAX_VALUE;
		if (ceilIndex - 1 >= 0) min = Math.abs(from - array[ceilIndex - 1]);
		if (ceilIndex < array.length) min = Math.abs(from - Math.min(min, array[ceilIndex]));
		return min;
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