
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] g = { 200, 200, 200, 200, 300, 300, 300, 500, 500, 1000, 1200,
				1500 };
		int[] yen = { 380, 380, 380, 380, 550, 550, 550, 850, 850,
				(int) (380 * 5 * 0.8), (int) (550 * 4 * 0.85),
				(int) (850 * 3 * 0.88) };
		Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
		memo.put(0, 0);
		for (int i = 0; i < g.length; i++) {
			Map<Integer, Integer> memotmp = new HashMap<Integer, Integer>();
			memotmp.putAll(memo);
			for (Entry<Integer, Integer> entry : memo.entrySet()) {
				int k = entry.getKey() + g[i];
				int v = entry.getValue() + yen[i];
				if (k > 5000) {
					continue;
				}
				if (!memotmp.containsKey(k)) {
					memotmp.put(k, v);
				} else {
					int oldv = memotmp.get(k);
					if (oldv > v) {
						memotmp.put(k, v);
					}
				}

			}
			memo = memotmp;
		}
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			System.out.println(memo.get(n));
		}

	}
}