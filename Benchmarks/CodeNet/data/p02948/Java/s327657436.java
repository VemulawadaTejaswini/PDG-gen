import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		Long m = sc.nextLong();
		TreeMap<Long, List<Long>> map = new TreeMap<>();
		while (sc.hasNextLong()) {
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			List<Long> list = map.getOrDefault(a, new ArrayList<>());
			list.add(b);
			map.put(a, list);
		}
		for (Long key : map.keySet()) {
			List<Long> list = map.get(key);
			Collections.sort(list);
		}
		long result = 0;
		List<Long> maxList = null;
		for (int i = 0; i < m; i++) {
			maxList = new ArrayList<>();
			long count = 0l;
			Map<Long, Long> keyMap = new HashMap<Long, Long>();
			for (Long key : map.keySet()) {
				if (m - i - key >= 0 ) {
					List<Long> temp = map.get(key);
					if(temp.isEmpty()) {
						continue;
					}
					maxList.add(temp.get(temp.size() - 1));
					keyMap.put(count++, key);
				}
			}
			// 最大のリスト完成、最大の報酬を探す
			if(maxList.isEmpty()) {
				continue;
			}
			Long maxL = Collections.max(maxList);
			List<Long> temp = map.get(keyMap.get(Long.valueOf(maxList.indexOf(maxL))));
			temp.remove(temp.size() - 1);
			result = result + maxL;
		}
		System.out.println(result);
	}
}
