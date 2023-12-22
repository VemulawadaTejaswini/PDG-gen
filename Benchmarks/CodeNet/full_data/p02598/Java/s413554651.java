import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var a = new ArrayList<Log>();
		for (var i = 0; i < n; i++) {
			a.add(new Main().new Log(sc.nextInt(), 1));
		}
		sc.close();
		Collections.sort(a, new Main().new ComparatorLog());

		var list = new Main().new SortedList(a);
		for (var i = 0; i < k; i++) {
			var log = list.get(n - 1);
			list.remove(n - 1);
			log.setC(log.getC() + 1);
			list.add(log);
		}
		System.out.println(list.get(n - 1).getV());
	}

	public class ComparatorLog implements Comparator<Log>{
		@Override
		public int compare(Log log1, Log log2) {
			var result = log1.getV() - log2.getV();
			if (result != 0) {
				return result;
			}

			return log1.getV() - log2.getV();
		}
	}

	public class Log {
		private int a;
		private int c;
		private int v;

		public int getA() {
			return a;
		}

		public int getC() {
			return c;
		}

		public void setC(int c) {
			this.c = c;
			this.v = (int) Math.ceil((double) a / c);
		}

		public int getV() {
			return this.v;
		}

		public Log(int a, int c) {
			this.a = a;
			this.c = c;
			this.v = (int) Math.ceil((double) a / c);
		}
	}

	public class SortedList {
		List<Log> list;

		public SortedList() {
			this.list = new ArrayList<Log>();
		}

		public SortedList(List<Log> list) {
			this.list = list;
		}

		public Log get(int index) {
			return list.get(index);
		}

		public void add(Log log) {
			list.add(search(log.getV()), log);
		}

		public void remove(int index) {
			list.remove(index);
		}

		private int search(int value) {
			var min = 0;
			var max = list.size();
			while (max - min > 1) {
				var mid = min + (max - min) / 2;
				if (list.get(mid).getV() <= value) {
					min = mid;
				} else {
					max = mid;
				}
			}

			if (max - min == 1 && list.get(min).getV() <= value) {
				min++;
			}
			return min;
		}
	}
}
