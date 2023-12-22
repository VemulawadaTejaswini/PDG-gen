import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt(), w = scanner.nextInt(), m = scanner.nextInt();
			boolean[][] bomb = new boolean[h][w];
			Map<Integer, Integer> xCountMap = new HashMap<>(), yCountMap = new HashMap<>();
			IntStream.range(0, m).forEach(i -> {
				int x = scanner.nextInt() - 1, y = scanner.nextInt() - 1;
				bomb[x][y] = true;
				xCountMap.put(x, xCountMap.getOrDefault(x, 0) + 1);
				yCountMap.put(y, yCountMap.getOrDefault(y, 0) + 1);
			});
			Object[] xCountEntries = xCountMap.entrySet().stream()
					.sorted((x, y) -> y.getValue().compareTo(x.getValue())).toArray();
			Object[] yCountEntries = yCountMap.entrySet().stream()
					.sorted((x, y) -> y.getValue().compareTo(x.getValue())).toArray();
			int xCountMax = ((Entry<Integer, Integer>) xCountEntries[0]).getValue(),
					yCountMax = ((Entry<Integer, Integer>) yCountEntries[0]).getValue();
			int max = 0;
			for (Object xCountEntry : xCountEntries) {
				if (((Entry<Integer, Integer>) xCountEntry).getValue() < xCountMax - 1) {
					break;
				}
				for (Object yCountEntry : yCountEntries) {
					if (((Entry<Integer, Integer>) yCountEntry).getValue() < yCountMax - 1) {
						break;
					}
					max = Math
							.max(max,
									((Entry<Integer, Integer>) xCountEntry).getValue()
											+ ((Entry<Integer, Integer>) yCountEntry).getValue()
											- ((bomb[((Entry<Integer, Integer>) xCountEntry)
													.getKey()][((Entry<Integer, Integer>) yCountEntry).getKey()]) ? 1
															: 0));
				}
			}
			System.out.println(max);
		}
	}
}
