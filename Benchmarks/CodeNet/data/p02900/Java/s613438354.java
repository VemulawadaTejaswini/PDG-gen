import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long ans = 1;

		Set<Long> pfA = getPrimeFactor(a);
		Set<Long> pfB = getPrimeFactor(b);

		Set<Long> comp = new HashSet<>(pfA);
		for (Long l : pfB) {
			if (pfA.contains(l))
				ans++;
		}

		System.out.println(ans);
	}

	public static final Set<Long> getPrimeFactor(long n) {
		final Set<Long> set = new HashSet<Long>();
		if (n < 2) {
			return set;
		}

		while (n != 1 && n % 2 == 0) {
			set.add((long) 2);
			n >>>= 1;
		}

		for (long i = 3; i * i <= n; i += 2) { //奇数のみ [O(√n[/2])で可]
			while (n % i == 0) {
				set.add(i);
				n /= i;
			}
		}

		if (n != 1) {
			set.add(n);
		}
		return set;
	}
}
