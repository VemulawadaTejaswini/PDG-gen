import java.util.ArrayList;
import java.util.List;

public class Main {
	public static int a[];

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(calc());
	}

	public static int calc() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				list.add(a[i]);
			} else if (list.get(0) >= a[i]) {
				list.add(0, a[i]);
			} else {
				for (int k = 1; k < list.size(); k++) {
					if (list.get(k) > a[i]) {
						list.set(k - 1, a[i]);
						break;
					}
				}
			}
		}
		return list.size();
	}
}
