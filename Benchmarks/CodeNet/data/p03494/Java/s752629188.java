
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] a = new long[N];

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
			}

			int flg = 0;
			int ans = -1;
			for (int i = 0; i < 100; i++) {
				ans++;
				for (int n = 0; n < N; n++) {
					if (a[n] % 2 == 0) {
						a[n] = a[n] / 2;
					} else {
						flg = 1;
					}
				}
				if (flg == 1) {
					break;
				}
			}
			System.out.println(ans);
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			String t = sc.next();

			int a = Integer.parseInt(t.substring(0, 1));
			int b = Integer.parseInt(t.substring(1, 2));
			int c = Integer.parseInt(t.substring(2, 3));

			System.out.println(a + b + c);
		}
	}
}
