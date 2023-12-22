import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Number {
	int num, pre, now;

	public Number(int num, int pre) {
		super();
		this.num = num;
		this.pre = pre;
	}

}

class Count {
	List<Number> list;

	public void merge(int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		List<Number> L = new ArrayList<>(), R = new ArrayList<>();
		for (int i = 0; i < n1; i++) {
			L.add(list.get(left + i));
		}
		for (int i = 0; i < n2; i++) {
			R.add(list.get(mid + i));
		}
		L.add(new Number(Integer.MAX_VALUE, -1));
		R.add(new Number(Integer.MAX_VALUE, -1));
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			if (L.get(i).num <= R.get(j).num) {
				list.set(k, L.get(i++));
			} else {
				list.set(k, R.get(j++));
			}
		}
	}
	public void mergeSort(int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(left, mid);
			mergeSort(mid, right);
			merge(left, mid, right);
		}
	}
	public int isInver(Number num) {
		if (num.now < num.pre) {
			return num.pre - num.now;
		}
		return 0;
	}

	public int check() {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Number num = list.get(i);
			num.now = i;
			count += isInver(num);
		}
		return count;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Count c = new Count();
		c.list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			Number number = new Number(num, i);
			c.list.add(number);
		}
		c.mergeSort(0, n);
		int count = c.check();
		System.out.println(count);
	}
}
