import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var v = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		var count1 = new int[100000];
		var count2 = new int[100000];
		for (var i = 0; i < n; i++) {
			if (i % 2 == 0) {
				count1[v[i]]++;
			} else {
				count2[v[i]]++;
			}
		}

		var counts1 = new ArrayList<ValueCount>();
		var counts2 = new ArrayList<ValueCount>();
		for (var i = 0; i < count1.length; i++) {
			counts1.add(new Main().new ValueCount(i + 1, count1[i]));
		}
		for (var i = 0; i < count2.length; i++) {
			counts2.add(new Main().new ValueCount(i + 1, count2[i]));
		}
		Collections.sort(counts1);
		Collections.reverse(counts1);
		Collections.sort(counts2);
		Collections.reverse(counts2);
		var result = 0;
		if (counts1.get(0).getValue() == counts2.get(0).getValue()) {
			result = n - (counts1.get(0).getCount() + Math.max(counts1.get(1).getCount(), counts2.get(1).getCount()));
		} else {
			result = n - (counts1.get(0).getCount() + counts2.get(0).getCount());
		}
		System.out.println(result);
	}

	public class ValueCount implements Comparable<ValueCount> {
		private int value;
		private int count;

		public ValueCount(int value, int count) {
			this.value = value;
			this.count = count;
		}

		public int getValue() {
			return value;
		}

		public int getCount() {
			return count;
		}

		@Override
		public int compareTo(ValueCount target) {
			if (this.count > target.getCount()) {
				return 1;
			} else if (this.count < target.getCount()) {
				return -1;
			}

			return 0;
		}
	}
}
