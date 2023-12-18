
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();

			// input
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < N; i++) {
				int val = scanner.nextInt();
				if (map.containsKey(val)) {
					map.put(val, map.get(val) + 1);
				} else {
					map.put(val, 1);
				}
			}
			// map のvalue で降順ソート
			List<Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
			Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					return o2.getValue() - o1.getValue();
				}
			});

			// 集計
			if (list.size() < K) {
				System.out.println(0);
			} else {
				int sum = 0;
				for (int i = K; i < list.size(); i++) {
					sum += list.get(i).getValue();
				}
				System.out.println(sum);
			}
		}
	}
}