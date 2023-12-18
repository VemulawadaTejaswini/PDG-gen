import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Map<Integer, Integer> e_map = new HashMap<>();
			Map<Integer, Integer> o_map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int v = sc.nextInt();
				if (i % 2 == 0) o_map.put(v, o_map.containsKey(v) ? o_map.get(v) + 1 : 1);
				else e_map.put(v, e_map.containsKey(v) ? e_map.get(v) + 1 : 1);
			}
			int[] e_freq = e_map.entrySet()
					.stream()
					.sorted(Collections.reverseOrder(Entry.comparingByValue()))
					.mapToInt(r -> r.getKey())
					.toArray();
			int[] o_freq = o_map.entrySet()
					.stream()
					.sorted(Collections.reverseOrder(Entry.comparingByValue()))
					.mapToInt(r -> r.getKey())
					.toArray();

			int e1 = e_freq[0];
			int o1 = o_freq[0];
			if (e1 != o1) {
				int e_cnt = e_map.entrySet().stream().mapToInt(r -> r.getValue()).sum() - e_map.get(e1);
				int o_cnt = o_map.entrySet().stream().mapToInt(r -> r.getValue()).sum() - o_map.get(o1);
				System.out.println(e_cnt + o_cnt);
			}
			else {
				if (e_freq.length > 1 && o_freq.length > 1) {
					int e2 = e_freq[1];
					int o2 = o_freq[1];
					int e_cnt = e_map.entrySet().stream().mapToInt(r -> r.getValue()).sum();
					int o_cnt = o_map.entrySet().stream().mapToInt(r -> r.getValue()).sum();
					System.out.println(Math.min(e_cnt - e_map.get(e1) + o_cnt - o_map.get(o1),
							e_cnt - e_map.get(e2) + o_cnt - o_map.get(o1)));
				}
				else {
					System.out.println(n / 2);
				}
			}
		}
	}
}