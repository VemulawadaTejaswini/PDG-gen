import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Long[] h = new Long[n];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextLong();
			}

			if (n <= k) {
				System.out.println(0);
				return;
			}

			Arrays.sort(h, Collections.reverseOrder());

			long sum = 0;
			for (long v : Arrays.copyOfRange(h, k, n)) {
				sum += v;
			}
			System.out.println(sum);
		}
	}
}
