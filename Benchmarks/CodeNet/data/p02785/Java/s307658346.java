import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Integer[] h = new Integer[n];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
			}

			if (n <= k) {
				System.out.println(0);
				return;
			}

			Arrays.sort(h, Collections.reverseOrder());

			int sum = 0;
			for (int v : Arrays.copyOfRange(h, k, n)) {
				sum += v;
			}
			System.out.println(sum);
		}
	}
}
