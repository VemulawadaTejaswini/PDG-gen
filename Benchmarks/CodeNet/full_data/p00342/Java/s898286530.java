import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
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

		int N = parseInt(br.readLine());

		int[] a = Arrays.stream(br.readLine().split(" "))
				.mapToInt(Integer::parseInt)
				.sorted()
				.toArray();

		Map<int[], Integer> ns = new HashMap<>();
		Map<int[], Integer> ds = new HashMap<>();

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				ns.put(new int[]{i, j}, a[i] + a[j]);
			}
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				ds.put(new int[]{i, j}, a[j] - a[i]);
			}
		}

		double max = 0;

		for (int[] n : ns.keySet()) {
			for (int[] d : ds.keySet()) {
				if (n[0] != d[0] && n[0] != d[1] && n[1] != d[0] && n[1] != d[1]) {
					BigDecimal _d, _n;
					_d = BigDecimal.valueOf(ns.get(n));
					_n = BigDecimal.valueOf(ds.get(d));
					max = Math.max(max, _n.divide(_d).doubleValue());
				}
			}
		}

		System.out.println(max);
	}
}