import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long k = scanner.nextLong();
		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + b);
			} else {
				map.put(a, b);
			}
		}

		int bSum = 0;
		for (int a : map.keySet()) {
			bSum += map.get(a);
			if (bSum >= k) {
				System.out.println(a);
				return;
			}
		}
	}
}