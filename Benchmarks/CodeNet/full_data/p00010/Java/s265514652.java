import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] x = new double[3];
		double[] y = new double[3];
		double[] t = new double[2];
		double[] s = new double[2];
		double[] r = new double[3];

		int p = scan.nextInt();
		for (int j = 0; j < p; j++) {
			for (int i = 0; i < x.length; i++) {
				x[i] = scan.nextDouble();
				y[i] = scan.nextDouble();
			}
			t[0] = x[0] - x[1];
			s[0] = y[0] - y[1];
			t[1] = x[0] - x[2];
			s[1] = y[0] - y[2];

			r[0] = (s[1] * (t[0] * t[0] - s[0] * s[0]) - s[0]
					* (t[1] * t[1] - s[1] * s[1]))
					/ (2 * (t[0] * s[1] - t[1] * s[0]));
			r[1] =- (t[1] * (t[0] * t[0] - s[0] * s[0]) - t[0]
					* (t[1] * t[1] - s[1] * s[1]))
					/ (2 * (t[0] * s[1] - t[1] * s[0]));
			r[2] = Math.sqrt((r[0] - x[0]) * (r[0] - x[0]) + (r[1] - y[0])
					* (r[1] - y[0]));

			System.out.printf("%.3f %.3f %.3f\n", r[0], r[1], r[2]);
		}
	}

}