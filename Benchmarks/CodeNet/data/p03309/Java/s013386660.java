
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt() - (i + 1);
			}

			long result = Long.MAX_VALUE;
			long before = result;
			for (long b = 0; b < 1000000000; b++) {
				long tmp = 0;
				for (int aa : a) {
					tmp += Math.abs(b + aa);
				}
				if (tmp < result) {
					result = tmp;
				}
				if (before < tmp) {
					break;
				}
				before = tmp;
			}
			System.out.println(result);
		}
	}
}
