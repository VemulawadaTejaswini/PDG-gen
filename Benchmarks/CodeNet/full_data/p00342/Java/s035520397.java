import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Maximization of Relational Expression
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n = parseInt(br.readLine());

		int[] a = Arrays.stream(br.readLine().split(" "))
				.mapToInt(Integer::parseInt)
				.sorted()
				.toArray();

		Map<Integer, List<int[]>> max = new HashMap<>();
		Map<Integer, List<int[]>> min = new HashMap<>();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				max.putIfAbsent(a[j] + a[i], new ArrayList<>());
				max.get(a[j] + a[i]).add(new int[]{a[j], a[i]});
				min.putIfAbsent(a[j] - a[i], new ArrayList<>());
				min.get(a[j] - a[i]).add(new int[]{a[j], a[i]});
			}
		}

		Set<Double> ans = new TreeSet<>();

		for (int _max : max.keySet()) {
			for (int _min : min.keySet()) {
				outer:
				for (int[] __max : max.get(_max)) {
					for (int[] __min : min.get(_min)) {
						if (__max[0] != __min[0]
								&& __max[0] != __min[1]
								&& __max[1] != __min[0]
								&& __max[1] != __min[1]) {
							ans.add((double) _max / _min);
							break outer;
						}
					}
				}
			}
		}

		System.out.println(ans.stream().max(Comparator.naturalOrder()).get());

	}
}