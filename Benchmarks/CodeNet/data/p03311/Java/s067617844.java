
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		long a[] = new long[n];
		long l[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLong();
			l[i] = (a[i] - (i + 1));
		}

		double ave = Arrays.stream(l).average().orElse(0);
		long b;
		// System.out.println(ave);
		if (ave > 0) {
			b = (long) Math.round(ave);
		} else {
			b = (long) Math.floor(ave);
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			long abs = Math.abs(a[i] - (b + (i + 1)));
			sum += abs;
		}
		System.out.println(sum);
	}
}
