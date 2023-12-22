import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var q = sc.nextInt();
		var q1 = new int[q];
		var q2 = new int[q];
		for (var i = 0; i < q; i++) {
			q1[i] = sc.nextInt();
			q2[i] = sc.nextInt();
		}
		sc.close();

		var sum = (long) (n - 2) * (n - 2);
		var x = new Main().new SortedMap();
		var y = new Main().new SortedMap();
		x.put(n, n);
		y.put(n, n);
		for (var i = 0; i < q; i++) {
			var qt = q1[i];
			var qv = q2[i];
			if (qt == 1) {
				var v = x.searchValue(qv);
				sum -= v - 2;
				update(y, v, qv);
			} else {
				var v = y.searchValue(qv);
				sum -= v - 2;
				update(x, v, qv);
			}
		}
		System.out.println(sum);
	}

	private static void update(SortedMap map, int key, int value) {
		if (map.containsKey(key)) {
			map.put(key, Math.min(map.get(key), value));
		} else {
			map.put(key, value);
		}
	}

	public class SortedMap {
		List<Integer> list;
		HashMap<Integer, Integer> map;

		public SortedMap() {
			this.list = new ArrayList<Integer>();
			this.map = new HashMap<Integer, Integer>();
		}

		public boolean containsKey(int key) {
			return this.map.containsKey(key);
		}

		public int get(int key) {
			return this.map.get(key);
		}

		public void put(int key, int value) {
			this.list.add(search(key), key);
			this.map.put(key, value);
		}

		public void remove(int index) {
			this.map.remove(list.get(index));
			this.list.remove(index);
		}

		public int searchValue(int key) {
			return this.map.get(this.list.get(search(key)));
		}

		public int getKey(int index) {
			return this.list.get(index);
		}

		private int search(int key) {
			var min = 0;
			var max = this.list.size();
			while (max - min > 1) {
				var mid = min + (max - min) / 2;
				if (this.list.get(mid) <= key) {
					min = mid;
				} else {
					max = mid;
				}
			}

			if (max - min == 1 && this.list.get(min) <= key) {
				min++;
			}
			return min;
		}
	}
}