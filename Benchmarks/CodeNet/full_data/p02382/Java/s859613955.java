import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}
		sc.close();

		int[] absXY = new int[n];

		double chebyshev = 0;
		for (int i = 0; i < n; i++) {
			absXY[i] = Math.abs(x[i]-y[i]);
			chebyshev = Math.max(chebyshev, absXY[i]);
		}

		for (int p = 1; p <= 3; p++) {
			long tmp = 0;
			for (int i = 0; i < n; i++) {
				tmp += Math.pow(absXY[i], p);
			}
			double dist = Math.pow(tmp, 1.0/p);
			System.out.println(dist);
		}

		System.out.println(chebyshev);

	}
}