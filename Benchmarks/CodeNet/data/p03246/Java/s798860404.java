import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] v1 = new int[n / 2], v2 = new int[n / 2];
		for (int i = 0; i < n / 2; i++) {
			v1[i] = in.nextInt();
			v2[i] = in.nextInt();
		}
		Map<Integer, Integer> m1 = count(v1), m2 = count(v2);
		int max1 = getMax(m1), max2 = getMax(m2);
		// System.out.println(max1 + " " + max2);
		if (max1 != max2) {
			System.out.println(countChange(max1, m1) + countChange(max2, m2));
		} else {
			if (m1.get(max1) < m2.get(max2)) {
				int ans = countChange(max2, m2) + n / 2;
				if (m1.size() != 1) {
					ans += n / 2 - m1.get(getSecond(m1));
				}
				System.out.println(ans);
			} else {
				int ans = countChange(max1, m1) + n / 2;
				if (m2.size() != 1) {
					ans += +n / 2 - m2.get(getSecond(m2));
				}
				System.out.println(ans);
			}
		}
	}

	public static Map<Integer, Integer> count(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		return map;
	}

	public static int getMax(Map<Integer, Integer> map) {
		int max = -1;
		for (int val : map.keySet()) {
			if (max == -1) {
				max = val;
			} else if (map.get(max) < map.get(val)) {
				max = val;
			}
		}
		return max;
	}

	public static int getSecond(Map<Integer, Integer> map) {
		int[] arr = new int[map.size()];
		int idx = 0;
		for (int val : map.keySet()) {
			arr[idx++] = val;
		}
		Arrays.sort(arr);
		int sec = arr[map.size() - 2];
		int ans = 0;
		for (int val : map.keySet()) {
			if (sec == map.get(val)) {
				ans = val;
			}
		}
		return ans;
	}

	public static int countChange(int num, Map<Integer, Integer> map) {
		int cnt = 0;
		for (int val : map.keySet()) {
			if (val == num) {
				continue;
			}
			cnt += map.get(val);
		}
		return cnt;
	}
}