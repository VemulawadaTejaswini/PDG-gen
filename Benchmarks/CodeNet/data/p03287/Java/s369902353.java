import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		int[] a = new int[n];
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(tokens[i]) % m;
		}

		// 最小区間を求める
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; ++i) {
			long val = 0;
			for (int j = i; j < n; ++j) {
				val += a[j];
				if (val % m == 0) {
					// System.out.println("i,j = " + i + ", " + (j + 1));
					map.put(i, j + 1);
					break;
				}
			}
		}

		List<Long> list = new ArrayList<>();
		while (!map.isEmpty()) {
			Integer key = map.keySet().stream().min(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if (o1 < o2) {
						return -1;
					} else if (o1 > o2) {
						return 1;
					} else {
						return 0;
					}
				}
			}).get();
			// System.out.print("start: " + key);
			int prev = key;
			int next = map.get(key);
			map.remove(key);
			long count = 1;
			while (map.containsKey(next)) {
				int removeKey = next;
				prev = next;
				next = map.get(prev);
				map.remove(removeKey);
				++count;
			}
			// System.out.println(" -- end: " + next + ", count: " + count);
			list.add(count);
		}
		long result = 0;
		for (Long elem : list) {
			result += getKaijo(elem);
		}
		System.out.println(result);
		in.close();
	}

	public static long getKaijo(long v) {
		long result = 0;
		for (long i = v; i >= 1; --i) {
			result += i;
		}
		return result;
	}
}