import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int lim = Integer.parseInt(sc.next());
		for (int i = 0; i < lim; i++) {
			double[] point = new double[6];
			for (int j = 0; j < 6; j++) {
				point[j] = Double.parseDouble(sc.next());
			}
			
			double[] m = new double[4];
			m[0] = (point[0] + point[2]) / 2;
			m[1] = (point[1] + point[3]) / 2;
			m[2] = (point[2] + point[4]) / 2;
			m[3] = (point[3] + point[5]) / 2;
			
			double a = m[0] - point[0];
			double b = m[1] - point[1];
			double c = m[2] - point[2];
			double d = m[3] - point[3];

			double p = a * m[0] + b * m[1];
			double q = c * m[2] + d * m[3];
			
			double det = a * d - b * c;

			double x = (p * d + q * (-b)) / det;
			double y = (p * (-c) + q * a) / det;

			if (a == 0.0) x = m[0];
			if (b == 0.0) y = m[1];
			if (c == 0.0) x = m[2];
			if (d == 0.0) y = m[3];
			
			double r = Math.sqrt((x - point[0]) * (x - point[0]) + (y - point[1]) * (y - point[1]));
			
			System.out.printf("%.3f %.3f %.3f\n", x, y, r);
		}
	}
}