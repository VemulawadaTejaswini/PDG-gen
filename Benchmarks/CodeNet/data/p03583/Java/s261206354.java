import java.util.Scanner;

public class Main {

	private static final int VAL_LIMIT = 3500 + 1;

	private static long divCeil(long x, long y) {
		return (int)((x / y) + 1);
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int N = in.nextInt();

			int h0 = (int)divCeil(N, 4);
			for (int h = h0; h < VAL_LIMIT; ++h) {
				int a = (h << 2) - N;
				int b = N * h;
				int n0 = (int)divCeil(b, a);
				for (int n = n0; n < VAL_LIMIT; ++n) {
					long c = a * n - b;
					long d = b * n;
					long w = d / c;
					if (w * c == d) {
						System.out.printf("%d %d %d%n", h, n, w);
						return;
					}
				}
			}
		}
	}
}
