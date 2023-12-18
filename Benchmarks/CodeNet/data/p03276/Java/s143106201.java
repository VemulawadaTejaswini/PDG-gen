
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i + k - 1 < n; i++) {
			int ii = i;
			int jj = i + k - 1;
			int ij = 0;

			if (x[ii] * x[jj] >= 0) {
				ij = Math.max(Math.abs(x[ii]), Math.abs(x[jj]));
			} else {
				int m1 = Math.max(Math.abs(x[ii]), Math.abs(x[jj]));
				int m2 = Math.min(Math.abs(x[ii]), Math.abs(x[jj]));
				ij = m1 + m2 * 2;
			}
			min = Math.min(ij, min);
		}
		System.out.println(min);
	}
}
