import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashMap<Integer, Integer> a = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int key = sc.nextInt();
			if (a.containsKey(key)) {
				a.put(key, a.get(key) + 1);
			} else {
				a.put(key, 1);
			}
		}
		sc.close();

		int answer = 0;
		if (k >= a.size()) {
			answer = 0;
		} else {
			List<Entry<Integer, Integer>> entries = new ArrayList<Entry<Integer, Integer>>(a.entrySet());
			Collections.sort(entries, new Comparator<Entry<Integer, Integer>>() {
				public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
					return obj1.getValue().compareTo(obj2.getValue());
				}
			});

			int fusoku = a.size() - k;
			for (int i = 0; i < fusoku; i++) {
				answer += entries.get(i).getValue();
			}
		}
		System.out.println(answer);
	}
}