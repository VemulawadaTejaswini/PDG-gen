import javafx.util.Pair;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Map<Integer, List<Long>> dic = new HashMap<>();
		List<Pair<Integer, Long>> toi = new ArrayList<>();
		for (int i = 0; i< m; i++) {
			int x = sc.nextInt();
			long y = sc.nextLong();
			toi.add(new Pair<>(x, y));
			List<Long> list = dic.getOrDefault(x, new ArrayList<>());
			list.add(y);
			dic.put(x, list);
		}

		Map<Integer, Long[]> sortDic = new HashMap<>();
		dic.entrySet().stream().forEach(e -> {
			Long[] tmp = e.getValue().toArray(new Long[e.getValue().size()]);
			Arrays.sort(tmp);
			sortDic.put(e.getKey(), tmp);
		});

		for (int i = 0; i< toi.size(); i++) {
			Pair mon = toi.get(i);
			String x = mon.getKey().toString();
			String paddingleft = x.format("%6s", x).replace(" ", "0");
			String index = String.valueOf(Arrays.binarySearch(sortDic.get(mon.getKey()), mon.getValue())+1);
			String paddingRight = index.format("%6s", index).replace(" ", "0");
			System.out.println(paddingleft+paddingRight);
		}

	}
}
