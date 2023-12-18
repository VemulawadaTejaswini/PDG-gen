
import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		int maxCount = 1;

		for (int j = 0; j < n; j++) {
			String word = sc.next();
			if (map.containsKey(word)) {
				map.replace(word, map.get(word) + 1);
				maxCount = Math.max(maxCount, map.get(word));
			} else {
				map.put(word, 1);
			}
		}
		sc.close();

		Map<String, Integer> result = new TreeMap<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxCount) {
				result.put(entry.getKey(), null);
			}
		}

		for (String word : result.keySet()) {
			System.out.println(word);
		}

	}
}