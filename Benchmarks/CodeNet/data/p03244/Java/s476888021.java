import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Map<Integer, Integer> oddMap = new HashMap<>(), evenMap = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				int v = scanner.nextInt();
				if (0 == (i & 1)) {
					evenMap.put(v, evenMap.getOrDefault(v, 0) + 1);
				} else {
					oddMap.put(v, oddMap.getOrDefault(v, 0) + 1);
				}
			});
			Entry<Integer, Integer> evenMax = evenMap.entrySet().stream()
					.max((x, y) -> Integer.compare(x.getValue(), y.getValue())).get();
			Entry<Integer, Integer> oddMax = oddMap.entrySet().stream()
					.max((x, y) -> Integer.compare(x.getValue(), y.getValue())).get();
			if (evenMax.getKey() == oddMax.getKey()) {
				// 最大値の数字が同じ場合、どちらかを削除する
				int[] evens = evenMap.values().stream().sorted((x, y) -> Integer.compare(y, x))
						.mapToInt(Integer::intValue).toArray();
				int[] odds = oddMap.values().stream().sorted((x, y) -> Integer.compare(y, x))
						.mapToInt(Integer::intValue).toArray();
				int evenSecond = (evens.length >= 2) ? evens[1] : 0;
				int oddSecond = (odds.length >= 2) ? odds[1] : 0;
				System.out.println(n - Math.max(evenMax.getValue() + oddSecond, oddMax.getValue() + evenSecond));
			} else {
				System.out.println(n - evenMax.getValue() - oddMax.getValue());
			}
		}
	}
}
