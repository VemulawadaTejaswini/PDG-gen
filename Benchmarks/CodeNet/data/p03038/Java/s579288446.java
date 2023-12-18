import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			list.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(list, new ComparatorByValue());
		int index = m - 1;
		int count = list.get(index).key;
		long value = list.get(index).value;
		for (int i = 0; i < n; i++) {
			if (a[i] > value) {
				break;
			}
			a[i] = value;
			count--;
			if (count == 0) {
				index--;
				if (index == -1) {
					break;
				}
				count = list.get(index).key;
				value = list.get(index).value;
			}
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}

class Pair {
	public int key;
	public long value;
	public Pair(int key, long value) {
		this.key = key;
		this.value = value;
	}
}

class ComparatorByValue implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if (sort1.value == sort2.value) {
			return 0;
		} else if (sort1.value > sort2.value) {
			return 1;
		} else {
			return -1;
		}
	}
}

class ComparatorByKey implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if (sort1.key == sort2.key) {
			return 0;
		} else if (sort1.key > sort2.key) {
			return 1;
		} else {
			return -1;
		}
	}
}