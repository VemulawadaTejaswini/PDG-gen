import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		Set<Long> set = new HashSet<>();
		List<Long> list = divList(n);
		for (long k : list) {
			if (k == 1) {
				continue;
			}
			long x = n;
			while (true) {
				if (x % k == 0) {
					x /= k;
				} else {
					break;
				}
			}
			x--;
			if (x % k == 0) {
				set.add(k);
			}
		}
		list = divList(n - 1);
		set.addAll(list);
		System.out.println(set.size() - 1);
	}

	static List<Long> divList(long n) {
		List<Long> list = new ArrayList<>();
		long end = (long) Math.sqrt(n);
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				list.add((long) i);
			}
		}
		int i = end * end == n ? list.size() - 2 : list.size() - 1;
		for ( ; i >= 0; i--) {
			list.add(n / list.get(i));
		}
		return list;
	}
}
