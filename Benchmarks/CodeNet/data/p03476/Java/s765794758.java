import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	private static final Set<Integer> LIKE2017 = new HashSet<>();
	private static final int[] PRIME = new int[100_000];
	static {
		int cnt = 0;
		PRIME[cnt++] = 2;
		PRIME[cnt++] = 3;
		for (int i = 5; i < PRIME.length; i += 2) {
			int j = 1;
			for (; j < cnt; j++) {
				if (i % PRIME[j] == 0) {
					break;
				}
			}
			if (j == cnt) {
				PRIME[cnt++] = i;
			}
		}
		for (int p : PRIME) {
			if (isPrime(0, (p + 1) / 2)) {
				LIKE2017.add(p);
			}
		}
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in); PrintWriter pw = new PrintWriter(System.out)) {
			int Q = Integer.parseInt(sc.nextLine());
			int[] l = new int[Q];
			int[] r = new int[Q];
			for (int i = 0; i < Q; i++) {
				l[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}

			for (int i = 0; i < Q; i++) {
				int x = collectLike2017(Integer.max(l[i], 3), r[i]);
				pw.println(x);
			}
			pw.flush();
		}
	}

	private static int collectLike2017(int n, int r) {
		int x = 0;
		for (; n <= r; n += 2) {
			if (LIKE2017.contains(n)) {
				x++;
			}
		}
		return x;
	}

	private static boolean isPrime(int i, int n) {
		if (PRIME[i] < n) {
			return n % PRIME[i] == 0 ? false : isPrime(++i, n);
		}
		return true;
	}
}
