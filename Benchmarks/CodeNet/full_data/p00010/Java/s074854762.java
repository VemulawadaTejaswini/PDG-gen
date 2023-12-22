import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double a = Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0);
			double b = Math.pow(x3 - x2, 2.0) + Math.pow(y3 - y2, 2.0);
			double c = Math.pow(x1 - x3, 2.0) + Math.pow(y1 - y3, 2.0);
			double s = Math.pow(0.5 * ((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1)), 2.0);
			double px = (a * (b + c - a) * x3 + b * (c + a - b) * x1 + c * (a + b - c) * x2) / (16 * s);
			double py = (a * (b + c - a) * y3 + b * (c + a - b) * y1 + c * (a + b - c) * y2) / (16 * s);
			double r = Math.pow(px - x1, 2.0) + Math.pow(py - y1, 2.0);
			System.out.printf("%.3f\n", px);
			System.out.printf("%.3f\n", py);
			System.out.printf("%.3f\n", Math.sqrt(r));
		}
	}
}