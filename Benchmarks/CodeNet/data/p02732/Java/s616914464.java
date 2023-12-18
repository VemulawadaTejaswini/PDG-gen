import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int maxCount = 0;
		for (int i = 0; i < n; i++) {
			int in = sc.nextInt();
			list.add(in);
			int count = map.getOrDefault(in, 0) + 1;
			if (maxCount < count) {
				maxCount = count;
			}
			map.put(in, count);
		}
		Map<Integer, Long> memo = new HashMap<>();
		for (Integer i : list) {
			long sum = 0;
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getValue();
				if (entry.getKey() == i) {
					key = key - 1;
				}
				if (memo.containsKey(key)) {
					sum = sum + memo.get(key);
				} else {
					long ans = calcNumOfCombination(key, 2);
					sum = sum + ans;
					memo.put(key, ans);
				}
			}
			System.out.println(sum);
		}

		sc.close();
	}

	public static long calcNumOfCombination(long n, long r) {
		long num = 1L;
		for (long i = 1L; i <= r; i++) {
			num = num * (n - i + 1L) / i;
		}
		return num;
	}
}
