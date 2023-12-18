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
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Map<Integer, Integer> left = new HashMap<Integer, Integer>();
		Map<Integer, Integer> right = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int v = in.nextInt();
			if (i % 2 == 0) {
				int count = 1;
				if (left.containsKey(v)) {
					count = left.get(v) + 1;
				}
				left.put(v, count);
			} else {
				int count = 1;
				if (right.containsKey(v)) {
					count = right.get(v) + 1;
				}
				right.put(v, count);
			}
		}
		List<Entry<Integer, Integer>> leftList = new ArrayList<Entry<Integer, Integer>>(left.entrySet());
		List<Entry<Integer, Integer>> rightList = new ArrayList<Entry<Integer, Integer>>(right.entrySet());
		Collections.sort(leftList, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		Collections.sort(rightList, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		int ans = 0;
		if (leftList.get(leftList.size() - 1).getKey() == rightList.get(rightList.size() - 1).getKey()) {
			if (leftList.get(leftList.size() - 1).getValue() >= rightList.get(rightList.size() - 1).getValue()) {
				ans += N / 2 - leftList.get(leftList.size() - 1).getValue();
				ans += rightList.size() > 1 ? N / 2 - rightList.get(rightList.size() - 2).getValue() : N / 2;
			} else {
				ans += N / 2 - leftList.get(leftList.size() - 2).getValue();
				ans += N / 2 - rightList.get(rightList.size() - 1).getValue();
			}

		} else {
			ans += N / 2 - leftList.get(leftList.size() - 1).getValue();
			ans += N / 2 - rightList.get(rightList.size() - 1).getValue();
		}
		System.out.println(ans);
		in.close();
	}
}