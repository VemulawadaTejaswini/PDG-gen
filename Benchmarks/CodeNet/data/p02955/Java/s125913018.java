
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			long[] a = new long[n];
			long max = 0;
			long total = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
				total += a[i];
				if (max < a[i]) {
					max = a[i];
				}
			}
			max += k;

			if (total < max) {
				System.out.println(total);
				return;
			}
		}
	}
}
