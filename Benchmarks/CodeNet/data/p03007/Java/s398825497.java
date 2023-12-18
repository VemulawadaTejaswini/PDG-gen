import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		List<Long> list0 = new ArrayList<Long>();
		List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>();
		long sum = 0;
		long min = Integer.MAX_VALUE;
		long min1 = Integer.MAX_VALUE;
		long min2 = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				list0.add(a[i]);
			} else if (a[i] > 0) {
				list1.add(a[i]);
				min1 = Math.min(min1, a[i]);
			} else {
				list2.add(a[i]);
				min2 = Math.max(min2, a[i]);
			}
			long aa = Math.abs(a[i]);
			sum += aa;
			min = Math.min(min, aa);
		}

		long val = 0;
		if (list1.size() > 0 || list2.size() > 0) {
			if (list1.size() == 0) {
				if (list2.size() == 1) {
					System.out.println(sum);
				} else {
					System.out.println(sum - 2 * min);
				}
				if (min == 0) {
					list0.remove(list0.size() - 1);
				} else {
					val = min2;
					list2.remove(min2);
				}
			} else if (list2.size() == 0) {
				if (list1.size() == 1) {
					System.out.println(sum);
				} else {
					System.out.println(sum - 2 * min);
				}
				if (min == 0) {
					list0.remove(list0.size() - 1);
				} else {
					val = min1;
					list1.remove(min1);
				}
			} else {
				System.out.println(sum);
				if (list2.size() > 0) {
					val = min2;
					list2.remove(min2);
				}
			}
		} else {
			System.out.println(sum);
			list0.remove(list0.size() - 1);
		}

		for (int i = 0; i < list1.size() - 1; i++) {
			System.out.println(val + " " + list1.get(i));
			val -= list1.get(i);
		}
		if (list1.size() > 0) {
			long last = list1.get(list1.size() - 1);
			System.out.println(last + " " + val);
			val = last - val;
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(val + " " + list2.get(i));
			val -= list2.get(i);
		}
		for (int i = 0; i < list0.size(); i++) {
			System.out.println(val + " " + list0.get(i));
		}
	}
}
