import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int p = 0; p < n; p++) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x3 = scan.nextDouble();
			double y3 = scan.nextDouble();
			
			double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
			double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
			
			double r = a * b * c / Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
			
			a = 2 * (x2 - x1);
			b = 2 * (y2 - y1);
			double e = x2 * x2 - x1 * x1 + y2 * y2 - y1 * y1;
			c = 2 * (x1 - x3);
			double d = 2 * (y1 - y3);
			double f = x1 * x1 - x3 * x3 + y1 * y1- y3 * y3;
			
			
			double px = (e * d - b * f) / (a * d - b * c);
			double py = (a * f - e * c) / (a * d - b * c);
			
			System.out.printf("%.3f %.3f %.3f\n", px, py, r);
		}
	}

}