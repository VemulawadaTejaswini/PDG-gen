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
			x2 -= x1;
			y2 -= y1;
			x3 -= x1;
			y3 -= y1;
			double x = x3 - x2;
			double y = y3 - y2;
			double r = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0)) / (2 * Math.abs(Math.sin((Math.atan2(x3, y3) - Math.atan2(x2, y2)))));
			x2 += x1;
			y2 += y1;
			x3 += x1;
			y3 += y1;
			double a = Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0);
			double b = Math.pow(x3 - x2, 2.0) + Math.pow(y3 - y2, 2.0);
			double c = Math.pow(x1 - x3, 2.0) + Math.pow(y1 - y3, 2.0);
			double s = Math.pow(0.5 * ((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1)), 2.0);
			System.out.printf("%.3f\n", (a * (b + c - a) * x3 + b * (c + a - b) * x1 + c * (a + b - c) * x2) / (16 * s));
			System.out.printf("%.3f\n", (a * (b + c - a) * y3 + b * (c + a - b) * y1 + c * (a + b - c) * y2) / (16 * s));
			System.out.printf("%.3f\n", r);
		}
	}
}