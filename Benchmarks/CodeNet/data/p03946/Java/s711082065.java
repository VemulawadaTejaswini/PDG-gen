import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			// t
			scanner.nextInt();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			// max[i] はa[i]〜a[n-1]の最大値
			int[] max = new int[n];
			max[n - 1] = a[n - 1];
			IntStream.range(2, n - 1).map(i -> n - i).forEach(i -> max[i] = Math.max(max[i + 1], a[i]));
			Map<Integer, Integer> map = new HashMap<>();
			int maxResult = IntStream.range(0, n - 1).map(i -> {
				int result = max[i + 1] - a[i];
				map.put(result, map.getOrDefault(result, 0) + 1);
				return result;
			}).max().getAsInt();
			System.out.println(map.get(maxResult));
		}
	}
}
