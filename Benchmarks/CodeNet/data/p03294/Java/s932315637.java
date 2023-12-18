import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {
			int a = Integer.parseInt(sc.next());
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < a; i++) {
				list.add(Integer.parseInt(sc.next()));
			}
			Collections.sort(list, Collections.reverseOrder());

			long lc = lcm(list.get(0), list.get(1));
			for (int i = 1; i < a - 1; i++) {
				lc = lcm(lc, list.get(i + 1));
			}

			lc -= 1;
			long all = 0;
			for (int i = 0; i < a; i++) {
				all += lc % list.get(i);
			}
			System.out.println(all);
		}

	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	private static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

}
