import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			SortedSet<Data> set = new TreeSet<>();
			Map<Integer, Queue<Data>> map = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				int t = scanner.nextInt();
				Data data = new Data(i, t, scanner.nextLong());
				set.add(data);
				Queue<Data> queue = map.get(t);
				if (null == queue) {
					queue = new PriorityQueue<>();
					map.put(t, queue);
				}
				queue.add(data);
			});
			// 選択されたもののセット
			Set<Data> selectedSet = new HashSet<>();
			Map<Integer, Integer> tMap = new HashMap<>();
			int l = Math.min(map.size(), k);
			Data[] datas = map.values().stream().map(queue -> queue.peek()).sorted().toArray(Data[]::new);
			long[] sum = new long[l];
			sum[0] = datas[0].d;
			IntStream.range(1, l).forEach(i -> sum[i] = sum[i - 1] + datas[i].d);
			IntStream.range(0, l).forEach(i -> {
				selectedSet.add(datas[i]);
				set.remove(datas[i]);
				tMap.put(datas[i].t, tMap.getOrDefault(datas[i].t, 0) + 1);
			});
			long diff = 0L;
			if (map.size() > k) {
				int j = map.size() - k;
				for (int i = 0; i < j; i++) {
					selectedSet.add(set.first());
					tMap.put(set.first().t, tMap.getOrDefault(set.first().t, 0) + 1);
					diff += set.first().d;
					set.remove(set.first());
				}
			}
//			System.out.println(
//					"sum=" + Arrays.stream(sum).mapToObj(String::valueOf).collect(Collectors.joining(",", "[", "]")));
			long max = sum[l - 1] + (tMap.size() * tMap.size()) + diff;
//			System.out.println("result=" + (sum[l - 1] + (tSet.size() * tSet.size()) + diff));
			for (int i = 1; i < l; i++) {
				selectedSet.remove(datas[l - i]);
				set.add(datas[l - 1]);
				int count = tMap.get(datas[i].t);
				if (1 == count) {
					tMap.remove(datas[i].t);
				} else {
					tMap.put(datas[i].t, count - 1);
				}
				selectedSet.add(set.first());
				tMap.put(set.first().t, tMap.getOrDefault(set.first().t, 0) + 1);
//				System.out.println(
//						"i=" + i + ", result=" + (sum[l - i - 1] + set.first().d + (tSet.size() * tSet.size()) + diff));
				max = Math.max(max, sum[l - i - 1] + set.first().d + (tMap.size() * tMap.size()) + diff);
				set.remove(set.first());
			}
			System.out.println(max);
		}
	}

	/**
	 * index,tとdを表すクラス
	 */
	private static class Data implements Comparable<Data> {
		int index, t;
		long d;

		Data(int index, int t, long d) {
			super();
			this.index = index;
			this.t = t;
			this.d = d;
		}

		@Override
		public int compareTo(Data data) {
			return Long.compare(data.d, d);
		}

		@Override
		public int hashCode() {
			return Objects.hash(index, t, d);
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof Data) {
				Data data = (Data) o;
				return (data.index == index) && (data.t == t) && (data.d == d);
			}
			return super.equals(o);
		}
	}
}
