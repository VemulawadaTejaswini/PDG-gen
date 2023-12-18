import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			long m = sc.nextLong();
			List<Long> an = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				an.add(sc.nextLong());
			}

			long now = an.get(0) / 2;
			for (int i = 1; i < an.size(); i++) {
				now = lcm(now, an.get(i) / 2);
			}

			System.out.println((m + now)/ (now * 2));
		}
	}

	static int lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return (int) (c / b);
	}
}