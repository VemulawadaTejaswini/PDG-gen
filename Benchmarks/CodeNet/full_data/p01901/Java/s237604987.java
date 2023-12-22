import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			long t = Long.parseLong(sc.next());
			int n = Integer.parseInt(sc.next());
			long[] a = new long[n];
			long[] b = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = Long.parseLong(sc.next());
				b[i] = Long.parseLong(sc.next());
			}

			int st = 0;
			long sum = 0;
			long max = 0;
			for (int i = 0; i < n; i++) {
				long ed = t + a[i];
				if (i > 0) {
					sum -= (b[i - 1] - a[i - 1]);
				}
				for (int j = st; j < n; j++) {
					if (ed < b[j]) {
						long val = sum + (ed - a[j]);
						max = Math.max(max, val);
						st = j;
						break;
					} else if (j + 1 < n && ed < a[j + 1]) {
						long val = sum + (b[j] - a[j]);
						max = Math.max(max, val);
						st = j;
						break;
					} else {
						sum += (b[j] - a[j]);
						if (j == n - 1) {
							max = Math.max(max, sum);
						}
					}
				}
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}