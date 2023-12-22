import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, e1, n2, e2;
		final double R = 6378.1;

		while (true) {
			n1 = sc.nextDouble();
			e1 = sc.nextDouble();
			n2 = sc.nextDouble();
			e2 = sc.nextDouble();
			if (n1 == -1 && e1 == -1 && n2 == -1 && e2 == -1) {
				break;
			}
			
			double x1, y1, z1;
			double x2, y2, z2;
			x1 = R * Math.cos(Math.toRadians(n1)) * Math.cos(Math.toRadians(e1));
			y1 = R * Math.cos(Math.toRadians(n1)) * Math.sin(Math.toRadians(e1));
			z1 = R * Math.sin(Math.toRadians(n1));
			x2 = R * Math.cos(Math.toRadians(n2)) * Math.cos(Math.toRadians(e2));
			y2 = R * Math.cos(Math.toRadians(n2)) * Math.sin(Math.toRadians(e2));
			z2 = R * Math.sin(Math.toRadians(n2));
			
			double theta = Math.acos((x1 * x2 + y1 * y2 + z1 * z2) / (R * R));
			System.out.printf("%.0f\n", R * theta);
		}
	}
}