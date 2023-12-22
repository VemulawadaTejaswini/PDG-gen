import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			// i+A_i の数を保存するマップ
			Map<Integer, Integer> addMap = new HashMap<>();
			// i-A_i の数を保存するマップ
			Map<Integer, Integer> minusMap = new HashMap<>();
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				addMap.put(i + a[i], addMap.getOrDefault(i + a[i], 0) + 1);
				minusMap.put(i - a[i], minusMap.getOrDefault(i - a[i], 0) + 1);
			}
			int count = 0;
			for (Map.Entry<Integer, Integer> entry : addMap.entrySet()) {
				Integer minusCount = minusMap.get(entry.getKey());
				if (null != minusCount) {
					count += entry.getValue() * minusCount;
				}
			}
			System.out.println(count);
		}
	}
}
