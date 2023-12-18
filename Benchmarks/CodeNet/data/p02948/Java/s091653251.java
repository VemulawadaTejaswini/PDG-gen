import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		Long m = sc.nextLong();
		Map<Long, Queue<Long>> map = new HashMap<>();
		while (sc.hasNextLong()) {
			Long a = sc.nextLong(); // a日後
			Long b = sc.nextLong(); // 報酬
			Queue<Long> list = map.getOrDefault(a, new PriorityQueue<Long>(Collections.reverseOrder()));
			list.add(b);
			map.put(a, list);
		}

		// 日数ごとにバイトの報酬順でのソート

		long sum = 0;
		for (long i = m - 1; i >= 0; i--) {
			Long maxKye = -1L;
			Long maxValue = -1L;
			List<Long> removeList = new ArrayList<>();
			for (Long key : map.keySet()) {
				if (m - i >= key) {
					Queue<Long> temp = map.get(key);
					if (temp.isEmpty()) {
						removeList.add(key);
						continue;
					}
					maxValue = Math.max(maxValue, temp.peek());
					maxKye = key;
				}
			}
			for (Long key : removeList) {
				map.remove(key);
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
