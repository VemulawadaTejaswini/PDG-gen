import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通り実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			int n = scanner.nextInt();
			Map<List<Integer>, Integer> map = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				IntStream.rangeClosed(0, 2).filter(j -> a - j > 0)
						.forEach(j -> IntStream.rangeClosed(0, 2).filter(k -> b - k > 0).forEach(k -> {
							List<Integer> key = Arrays.asList(a - j, b - k);
							map.put(key, map.getOrDefault(key, 0) + 1);
						}));
			});
			long[] results = new long[10];
			map.entrySet().stream().filter(entry -> {
				List<Integer> key = entry.getKey();
				return (key.get(0) <= h - 2) && (key.get(1) <= w - 2);
			}).forEach(entry -> results[entry.getValue()]++);
			results[0] = (h - 2L) * (w - 2L) - IntStream.rangeClosed(1, 9).mapToLong(i -> results[i]).sum();
			Arrays.stream(results).forEach(System.out::println);
		}
	}
}
