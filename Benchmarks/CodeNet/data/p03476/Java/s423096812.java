import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	private static int[] prime = new int[100_000];
	static {
		int cnt = 0;
		prime[cnt++] = 2;
		prime[cnt++] = 3;
		for (int i = 5; i < prime.length; i += 2) {
			int j = 1;
			for (; j < cnt; j++) {
				if (i % prime[j] == 0) {
					break;
				}
			}
			if (j == cnt) {
				prime[cnt++] = i;
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
				int x = 0;
				for (int n = l[i]; n <= r[i]; n++) {
					if (n < 3) {
						continue;
					}
					if (isPrime(n) && isPrime((n + 1) / 2)) {
						x++;
					}
				}
				pw.println(x);
			}
			pw.flush();
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 0; prime[i] < n; i++) {
			if (n % prime[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
