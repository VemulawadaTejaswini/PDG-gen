import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static long max = (long) Math.pow(10.0, 18.0);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			long next = sc.nextLong();
			if (next == 0) {
				System.out.println(0);
				return;
			}
			a[i] = next;
		}
		sc.close();

		long result = 1L;
		for (int i = 0; i < n; i++) {
			try {
				result = Math.multiplyExact(result, a[i]);
			} catch (ArithmeticException e) {
				System.out.println(-1);
				return;
			}
			if (result > max) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(result);
	}
}
