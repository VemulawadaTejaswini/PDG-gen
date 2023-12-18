import java.io.*;
import java.util.*;
import java.util.function.*;

class Restaurant {
	int idx;
	String city;
	int point;

	Restaurant(int idx, String city, int point) {
		this.idx = idx;
		this.city = city;
		this.point = point;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		Restaurant[] restaurants = new Restaurant[N];
 		for (int i = 0; i < N; i++) {
			String S = sc.get();
			int P = Integer.parseInt(sc.get());
			restaurants[i] = new Restaurant(i+1, S, P);
		}
 		Arrays.sort(restaurants, Comparator.comparing((Restaurant r) -> r.city).thenComparingInt(r -> -r.point));
 		StringJoiner joiner = new StringJoiner("\n");
		for (Restaurant restaurant : restaurants) {
			joiner.add(String.valueOf(restaurant.idx));
		}
		System.out.println(joiner);
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
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
	}
}