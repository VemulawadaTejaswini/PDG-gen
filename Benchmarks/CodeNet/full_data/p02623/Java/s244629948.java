
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long max = scan.nextInt();
		long a[] = new long[n];
		long b[] = new long[m];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = scan.nextInt();
		}
		long ans = 0;
		long time = 0;
		for (int i = 0; i < n; i++) {
			long count = 0;

			if (max < time + a[i]) {

			} else {
				time = time + a[i];
				count = i + 1;
			}
			long time2 = time;
			for (int j = 0; j < m; j++) {

				if (max < time2 + b[j]) {

					break;
				} else {
					time2 = time2 + b[j];
					count++;
				}
			}
			if (ans < count) {
				ans = count;
			}

		}

		System.out.println(ans);

	}

}
