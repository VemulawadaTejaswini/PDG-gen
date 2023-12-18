import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		List<Integer> plus = new ArrayList<>(n);
		List<Integer> minus = new ArrayList<>(n);
		int zeroCount = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int diff = x - a;
			if (diff == 0) {
				zeroCount++;
			}
			else if (diff > 0) {
				plus.add(diff);
			}
			else {
				minus.add(-diff);
			}
		}
		
		Map<Integer, Long> mapA = map(plus);
		Map<Integer, Long> mapB = map(minus);
		
		// mapA size < mapB size for performance.
		if (mapA.size() > mapB.size()) {
			Map<Integer, Long> tmp = mapB;
			mapB = mapA;
			mapA = tmp;
		}
		
		long sum = 0;
		for (Map.Entry<Integer, Long> e : mapA.entrySet()) {
			Long count = mapB.get(e.getKey());
			if (count == null) {
				continue;
			}
			sum += e.getValue() * count;
		}
		
		if (zeroCount > 0) {
			sum += sum * zeroCount;
			sum += zeroCount;
		}
		
		System.out.println(sum);
	}

	private static Map<Integer, Long> map(List<Integer> list) {
		Map<Integer, Long> map = new HashMap<>();
		
		put(map, list, 0, 0);
		
		return map;
	}

	private static void put(Map<Integer, Long> map, List<Integer> list, int sum, int i) {
		if (i == list.size()) {
			putSelected(map, sum);
			return;
		}
		
		put(map, list, sum, i + 1);
		int addedSum = sum + list.get(i);
		put(map, list, addedSum, i + 1);
	}

	private static void putSelected(Map<Integer, Long> map, int sum) {
		if (sum == 0) {
			return;
		}
		
		Long count = map.getOrDefault(sum, 0L);
		map.put(sum, count + 1);
	}
}
