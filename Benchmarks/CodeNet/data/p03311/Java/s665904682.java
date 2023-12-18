
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		long a[] = new long[n];
		long l[] = new long[n];
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLong();
			l[i] = (a[i] - (i + 1));
			min = Math.min(l[i], min);
			max = Math.max(l[i], max);
		}
		if (min == max) {
			System.out.println(0);
			return;
		}

		double ave = 0;
		for (long ll : l) {
			ave += ll;
		}
		ave = Math.floor(ave / n);
		long b = (long) ave;

		long sum = 0;
		for (int i = 0; i < n; i++) {
			long abs = Math.abs(a[i] - (b + (i + 1)));
			sum += abs;
		}
		System.out.println(sum);
	}
}
