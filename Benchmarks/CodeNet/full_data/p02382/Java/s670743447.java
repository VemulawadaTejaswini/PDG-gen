import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		double d=0;
		double d4=0;
		for (int i = 0; i < n; i++) {
			x[i] = scanner.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			y[i] = scanner.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			if (x[i] > y[i]) {
				d1 = d1 + (x[i] - y[i]);
			} else {
				d1 = d1 + (y[i] - x[i]);
			}
		}
		for (int i = 0; i < n; i++) {
			if (x[i] > y[i]) {
				d=(x[i] - y[i]) * (x[i] - y[i]);
				d2 = d2 +d;
			} else {
				d=(y[i] - x[i]) * (y[i] - x[i]);
				d2 = d2 + d;
			}
		}
		for (int i = 0; i < n; i++) {
			if (x[i] > y[i]) {
				d=(x[i] - y[i]) * (x[i] - y[i])* (x[i] - y[i]);
				d3 = d3 +d;
			} else {
				d=(y[i] - x[i]) * (y[i] - x[i])* (y[i] - x[i]);
				d3 = d3 + d;
			}
		}
		for (int i = 0; i < n; i++) {
			if (x[i] > y[i]) {
				if (d4 < x[i] - y[i]) {
					d4 = x[i] - y[i];
				}
			} else {
				if (d4 < y[i] - x[i]) {
					d4 = y[i] - x[i];
				}
			}
		}
		System.out.println(d1);
		System.out.println(Math.sqrt(d2));
		System.out.println(Math.cbrt(d3));
		System.out.println(d4);

	}
}
