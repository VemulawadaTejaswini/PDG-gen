import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		long[] cum = new long[n + 1];
		for (int i = 0; i < n; i++) {
			cum[i + 1] = cum[i] + a[i];
		}
		long min = Long.MAX_VALUE;
		for (int i = 1; i < cum.length - 1; i++) {
			long diff = cum[cum.length - 1] - cum[i];
			if (Math.abs(diff - cum[i]) < min) {
				min = Math.abs(diff - cum[i]);
			}
		}
		System.out.println(min);
		in.close();
	}
}