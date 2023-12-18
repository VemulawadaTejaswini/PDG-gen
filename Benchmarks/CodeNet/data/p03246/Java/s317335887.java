import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt() / 2;
		int[] v1 = new int[n], v2 = new int[n];
		for (int i = 0; i < n; i++) {
			v1[i] = in.nextInt();
			v2[i] = in.nextInt();
		}
		int[] m1 = collectTop2(v1), m2 = collectTop2(v2);
		int ans = n;
		for (int x : m1) {
			for (int y : m2) {
				if (x == y) {
					continue;
				}
				ans = Math.min(ans, countChange(v1, x) + countChange(v2, y));
			}
		}
		System.out.println(ans);
	}

	public static int[] collectTop2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0));
		}
		if (map.size() == 1) {
			return new int[] { arr[0] };
		}
		Integer[] tmp = new Integer[map.size()];
		int idx = 0;
		for (int i : map.keySet()) {
			tmp[idx++] = i;
		}
		Arrays.sort(tmp, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return map.get(b) - map.get(a);
			}
		});
		return new int[] { tmp[0], tmp[1] };
	}

	public static int countChange(int[] arr, int num) {
		int sum = 0;
		for (int i : arr) {
			if (i == num) {
				continue;
			}
			sum++;
		}
		return sum;
	}
}