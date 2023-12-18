import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		List<Long> list = divList(a, b);
		Set<Long> ans = new HashSet<>();
		for (long o : list) {
			if (isSosuu(o)) {
				ans.add(o);
			}
		}
		System.out.println(ans.size());
	}

	static List<Long> divList(long a, long b) {
		List<Long> list = new ArrayList<>();
		for (long i = 1; i <= 1000000L; i++) {
			if (a % i == 0 && b % i == 0) {
				list.add(i);
			}
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			long l = a / list.get(i);
			if (a % l == 0 && b % l == 0) {
				list.add(l);
			}
			l = b / list.get(i);
			if (a % l == 0 && b % l == 0) {
				list.add(l);
			}
		}
		return list;
	}

	static boolean isSosuu(long n) {
		long end = (int) Math.sqrt(n);
		for (int i = 2; i <= end; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
