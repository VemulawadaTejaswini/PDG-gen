import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.x = sc.nextInt();
			o.y = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		double sum = permutation(arr, new LinkedHashSet<>());
		int i = 1;
		for (int j = 1; j <= n; j++) {
			i *= j;
		}
		System.out.println(sum / i);
	}

	static double permutation(Obj[] target, LinkedHashSet<Integer> set) {
		if (set.size() == target.length) {
			double val = 0;
			Integer[] arr = set.toArray(new Integer[0]);
			for (int i = 1; i < arr.length; i++) {
				int dx = target[arr[i]].x - target[arr[i - 1]].x;
				int dy = target[arr[i]].y - target[arr[i - 1]].y;
				val += Math.hypot(dx, dy);
			}
			return val;
		}

		double sum = 0;
		for (int i = 0; i < target.length; i++) {
			if (!set.contains(i)) {
				set.add(i);
				sum += permutation(target, set);
				set.remove(i);
			}
		}
		return sum;
	}

	static class Obj {
		int x, y;
	}
}
