import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var set = new HashSet[n];
		for (int i = 0; i < n; i++) {
			set[i] = new HashSet<Integer>();
		}
		for (int i = 0; i < m; i++) {
			var a = sc.nextInt();
			var b = sc.nextInt();
			set[a - 1].add(b);
			set[b - 1].add(a);
		}
		sc.close();

		var min = new int[n];
		Arrays.fill(min, Integer.MAX_VALUE);
		min[0] = 0;
		check(set, min, 1);
		var list = new ArrayList<Integer>();
		for (int i = 1; i < n; i++) {
			for (var x : set[i]) {
				if (min[i] - 1 == min[(int) x - 1]) {
					list.add((int) x);
					break;
				}
			}
		}
		if (list.size() == n - 1) {
			System.out.println("Yes");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			System.out.println("No");
		}
	}

	public static void check(HashSet[] set, int[] min, int n) {
		for (var x : set[n - 1]) {
			if (min[n - 1] + 1 < min[(int) x - 1]) {
				min[(int) x - 1] = min[n - 1] + 1;
				check(set, min, (int) x);
			}
		}
	}
}