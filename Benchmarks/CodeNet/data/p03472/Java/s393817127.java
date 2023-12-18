import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no4();
	}

	static void no4() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long h = sc.nextLong();

			long[] a = new long[n];
			long[] b = new long[n];

			long maxhit = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
				b[i] = sc.nextLong();

				if (a[i] > maxhit) {
					maxhit = a[i];
				}
			}

			List<Long> th = new ArrayList<Long>();
			for (int i = 0; i < n; i++) {
				if (b[i] > maxhit) {
					th.add(b[i]);
				}
			}
			Collections.sort(th);
			Collections.reverse(th);

			int i = 0;
			for (long t : th) {
				i++;
				h -= t;
				if (h <= 0) {
					System.out.println(i);
					return;
				}
			}
			long j = h / maxhit;
			i += j;
			if (h % maxhit != 0) {
				i++;
			}
			System.out.println(i);
		}
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long y = sc.nextLong();
			long t = 0;
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n - i; j++) {
					t = 10000 * i + 5000 * j + 1000 * (n - i - j);
					if (t == y) {
						System.out.println(i + " " + j + " " + (n - i - j));
						return;
					}
				}
			}
			System.out.println("-1 -1 -1");
		}
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = 0;
			}

			int ans = 0;
			for (int i = 0; i < n; i++) {
				int flg = 0;
				int t = sc.nextInt();
				for (int j = 0; j < n; j++) {
					if (a[j] == t) {
						flg = 1;
						break;
					}
				}
				if (flg == 0) {
					ans++;
				}
				a[i] = t;
			}
			System.out.println(ans);
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println("2018/01/" + str.substring(8));
		}
	}
}
