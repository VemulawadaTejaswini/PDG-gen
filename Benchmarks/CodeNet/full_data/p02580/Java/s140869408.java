import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var h = sc.nextInt();
		var w = sc.nextInt();
		var m = sc.nextInt();
		var c1 = new int[h];
		var c2 = new int[w];
		var set = new HashSet<Long>();
		for (var i = 0; i < m; i++) {
			var h1 = sc.nextInt();
			var w1 = sc.nextInt();
			c1[h1 - 1]++;
			c2[w1 - 1]++;
			set.add((long) (h1 - 1) * w + w1 - 1);
		}
		sc.close();

		var result1 = 0;
		for (var i = 0; i < h; i++) {
			result1 = Math.max(result1, c1[i]);
		}
		var result2 = 0;
		for (var i = 0; i < w; i++) {
			result2 = Math.max(result2, c2[i]);
		}

		var list1 = new ArrayList<Integer>();
		for (var i = 0; i < c1.length; i++) {
			if (c1[i] == result1) {
				list1.add(i);
			}
		}
		var list2 = new ArrayList<Integer>();
		for (var j = 0; j < c2.length; j++) {
			if (c2[j] == result2) {
				list2.add(j);
			}
		}

		boolean check = false;
		if (list1.size() * list2.size() <= m) {
			for (var i : list1) {
				if (check) {
					break;
				}
				for (var j : list2) {
					if (!set.contains((long) i * w + j)) {
						check = true;
						break;
					}
				}
			}
		} else {
			check = true;
		}

		var result = result1 + result2 - (check ? 0 : 1);
		System.out.println(result);
	}
}
