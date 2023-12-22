import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int[] a = new int[h];
		int[] b = new int[h];
		for (int i = 0; i < h; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		TreeMap<Integer, Integer> map = new TreeMap<>();
		MultiTreeSet<Integer> set = new MultiTreeSet<>();
		for (int i = 0; i < w; i++) {
			map.put(i, i);
			set.add(0);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < h; i++) {
			SortedMap<Integer, Integer> sub = map.subMap(a[i], b[i]);
			for (Integer key : sub.keySet()) {
				set.remove(key - sub.get(key));
			}
			if (!map.containsKey(b[i])) {
				if (!sub.isEmpty()) {
					int s = sub.get(sub.lastKey());
					map.put(b[i], s);
					if (b[i] < w) {
						set.add(b[i] - s);
					}
				}
			}
			sub.clear();
			if (set.size == 0) {
				pw.println(-1);
			} else {
				pw.println(set.first() + i + 1);
			}
		}
		pw.flush();
	}

	static class MultiTreeSet<T> {
		TreeMap<T, Integer> map = new TreeMap<>();
		int size = 0;

		void add(T e) {
			map.put(e, map.getOrDefault(e, 0) + 1);
			size++;
		}

		void remove(T e) {
			if (e != null && map.containsKey(e)) {
				int val = map.get(e);
				if (val == 1) {
					map.remove(e);
				} else {
					map.put(e, val - 1);
				}
				size--;
			}
		}

		T first() {
			return map.firstKey();
		}
	}
}
