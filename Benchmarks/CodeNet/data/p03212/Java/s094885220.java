import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static long n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		System.out.println(dfs(0));
	}

	private static long dfs(long a) {
		if (a > n) return 0;

		long i = a;
		Set<Integer> set = new HashSet<>();
		while (i > 0) {
			if (i % 10 == 7) {
				set.add(7);

			} else if (i % 10 == 5) {
				set.add(5);

			} else if (i % 10 == 3) {
				set.add(3);
			}
			if (set.size() >= 3) break;
			i /= 10;
		}

		long b = set.size() >= 3 ? 1 : 0;

		b += dfs(a * 10 + 7);
		b += dfs(a * 10 + 5);
		b += dfs(a * 10 + 3);
		return b;
	}
}
