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
			double a1 = 2 * (c[2] - c[0]);
			double b1 = 2 * (c[3] - c[1]);
			double a2 = 2 * (c[4] - c[0]);
			double b2 = 2 * (c[5] - c[1]);
			double c1 = (c[0] * c[0] - c[2] * c[2]) + (c[1] * c[1] - c[3] * c[3]);
			double c2 = (c[0] * c[0] - c[4] * c[4]) + (c[1] * c[1] - c[5] * c[5]);
			double x = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
			double y = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
			double r = Math.sqrt(Math.pow(c[0] - x, 2) + Math.pow(c[1] - y, 2));
			System.out.printf("%.3f %.3f %.3f", x, y, r);
		}
	}
}