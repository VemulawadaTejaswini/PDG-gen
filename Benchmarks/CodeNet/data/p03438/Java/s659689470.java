import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] a = new long[N];
			long[] b = new long[N];

			long[] d = new long[N];
			long[] dc = new long[N];

			long asum = 0;
			long bsum = 0;

			long dsum = 0;

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
				asum += a[i];
			}

			for (int i = 0; i < N; i++) {
				b[i] = sc.nextLong();
				bsum += b[i];

				long t = b[i] - a[i];
				if (t <= 0) {
					dsum += Math.abs(t);
				} else {
					dsum += t;
					if (t % 2 != 0) {
						dsum++;
					}
				}
			}

			if (dsum >= (bsum - asum) * 3) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			long x = sc.nextLong();
			long y = sc.nextLong();

			if (x % y == 0) {
				System.out.println("-1");
				return;
			}

			long i = 1;
			long t = x;
			while (true) {
				if (t % y != 0) {
					System.out.println(t);
					return;
				}
				if (t > 1000000000000000000L - x) {
					System.out.println("-1");
					return;
				}
				t += x;
			}
		}
	}

}
