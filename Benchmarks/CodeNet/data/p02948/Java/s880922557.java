import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		Long m = sc.nextLong();
		TreeMap<Long, Queue<Long>> map = new TreeMap<>();
		while (sc.hasNextLong()) {
			Long a = sc.nextLong(); // a日後
			Long b = sc.nextLong(); // 報酬
			Queue<Long> list = map.getOrDefault(a, new PriorityQueue<Long>(Collections.reverseOrder()));
			list.add(b);
			map.put(a, list);
		}

		// 日数ごとにバイトの報酬順でのソート

		long sum = 0;
		for (long i = m; i >= 0; i--) {
			Long maxKye = -1L;
			Long maxValue = -1L;
			for (Long key : map.keySet()) {
				if (m - i >= key) {
					Queue<Long> temp = map.get(key);
					if (temp.isEmpty()) {
						continue;
					}
					maxValue = Math.max(maxValue, temp.peek());
					maxKye = key;
				}
			}
			if (maxKye < 0 && maxValue < 0) {
				continue;
			}
			sum = maxValue + sum;
			Queue<Long> temp = map.get(maxKye);
			if (temp.isEmpty()) {
				break;
			}
			temp.poll();
		}
		sc.close();
		System.out.println(sum);
	}
}
