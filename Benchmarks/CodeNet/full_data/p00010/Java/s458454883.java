import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		for (int i = 0; i < n; i++) {
			double[] c = new double[6];
			for (int j = 0; j < 6; j++) {
				c[j] = scanner.nextDouble();
			}
			double a0 = 2 * (c[2] - c[0]);
			double a1 = 2 * (c[4] - c[0]);
			double b0 = 2 * (c[3] - c[1]);
			double b1 = 2 * (c[5] - c[1]);
			double c0 = (c[0] * c[0] - c[2] * c[2]) + (c[1] * c[1] - c[3] * c[3]);
			double c1 = (c[0] * c[0] - c[4] * c[4]) + (c[1] * c[1] - c[5] * c[5]);
			double x = (b0 * c1 - b1 * c0) / (a0 * b1 - a1 * b0);
			double y = (c0 * a1 - c1 * a0) / (a0 * b1 - a1 * b0);
			double r = Math.sqrt(Math.pow(c[0] - x, 2) + Math.pow(c[1] - y, 2));
			System.out.printf("%.3f %.3f %.3f\n", x, y, r);
		}
	}
}