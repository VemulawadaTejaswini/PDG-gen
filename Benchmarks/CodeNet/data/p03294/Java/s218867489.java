import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int a = Integer.parseInt(sc.next());
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < a; i++) {
				list.add(Integer.parseInt(sc.next()));
			}
			Collections.sort(list, Collections.reverseOrder());

			if (list.size() == 2) {
				long lcm = lcm(list.get(0), list.get(1));
				lcm -= 1;
				long all = lcm % list.get(0) + lcm % list.get(1);
				System.out.println(all);
				return;
			}

			long lcm = lcm(list.get(0), list.get(1));
			for (int i = 1; i < a - 1; i++) {
				lcm = lcm(lcm, list.get(i + 1));
			}

			lcm -= 1;
			long all = 0;

			for (int i = 0; i < a; i++) {
				all += lcm % list.get(i);
			}
			System.out.println(all);
		}

	}

	static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

}
