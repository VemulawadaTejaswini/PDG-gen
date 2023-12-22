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

			long max = 0;
			for (int i = 0; i < n; i++) {
				long sum = 0;
				for (int j = i; j < n; j++) {
					if (t + a[i] < a[j]) {
						break;
					}
					
					if (t + a[i] < b[j]) {
						sum += (t + a[i] - a[j]);
						break;
					} else {
						sum += (b[j] - a[j]);
					}
				}
				max = Math.max(max, sum);
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}