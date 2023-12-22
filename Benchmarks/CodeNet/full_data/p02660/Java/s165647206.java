import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextLong();
		sc.close();

		var set = new HashSet<Long>();
		while (true) {
			var z = 0L;
			var list = getDivisors(n);
			for (var a : list) {
				if (!set.contains(a)) {
					z = a;
					break;
				}
			}
			if (z == 0L) {
				break;
			}

			System.out.println(z);
			set.add(z);
			n = n / z;
		}

		System.out.println(set.size());
	}

	public static List<Long> getDivisors(long n) {
		var list = new ArrayList<Long>();
		for (var i = 1L; i < (long) Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				list.add(i);
				var divisor = n / i;
				if (divisor != i) {
					list.add(divisor);
				}
			}
		}

		Collections.sort(list);
		if (list.size() > 0 && list.get(0) == 1) {
			list.remove(0);
		}
		return list;
	}
}