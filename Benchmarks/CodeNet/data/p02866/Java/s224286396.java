import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	final static int MOD = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] d = new int[n - 1];
		int first = Integer.parseInt(sc.next());

		TreeMap<Integer, Integer> tm = new TreeMap<>();
		tm.put(first, tm.getOrDefault(first, 0) + 1);
		for (int i = 0; i < d.length; i++) {
			int num = Integer.parseInt(sc.next());
			tm.put(num, tm.getOrDefault(num, 0) + 1);
		}

		if (first != 0 || tm.get(0) != 1) {
			System.out.println(0);

		} else {
			long ans = 1;
			int cnt = 1;
			int now = 1;
			boolean flag = true;
			while (flag) {
				int getNow = tm.getOrDefault(now, 0);

				cnt += getNow;
				if (getNow == 0) {
					if (cnt < n) {
						System.out.println(0);
						System.exit(0);
					} else {
						flag = false;
					}
				}
				ans *= power(now, getNow);
				ans %= MOD;
				now++;
			}
			System.out.println(ans);
		}

		sc.close();
	}

	public static long power(int p, int c) {
		long res = 1;

		for (int i = 0; i < c; i++) {
			res *= p;
			res %= MOD;
		}

		return res;
	}
}