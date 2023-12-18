import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		long v = 1000000000 + 7;

		int n = in.nextInt();
		int m = in.nextInt();
		long[] x = new long[n];
		long[] y = new long[m];
		for (int i = 0; i < x.length; i++) {
			x[i] = in.nextLong();
		}
		for (int i = 0; i < y.length; i++) {
			y[i] = in.nextLong();
		}
		in.close();

		long sum = 0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i; j < x.length; j++) {
				long tmpX = x[j] - x[i];
				for (int k = 0; k < y.length - 1; k++) {
					for (int k2 = k; k2 < y.length; k2++) {
						long tmpY = y[k2] - y[k];
						sum = (sum + (tmpX * tmpY)) % v;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
