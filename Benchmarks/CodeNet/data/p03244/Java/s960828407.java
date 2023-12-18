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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
		int a;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		if (map.size() == 1) {
			System.out.println(n / 2);
		} else {
			List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

			Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {

				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}

			});

			int cnt = 0;
			for (int i = 0; i < list_entries.size() - 2; i++) {
				cnt += list_entries.get(i).getValue();
			}

			System.out.println(cnt);

		}
	}
}
