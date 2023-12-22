import java.util.Scanner;

public class Main {
	static double R = 6378.1;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			if (a == -1 && b == -1 && c == -1 && d == -1)
				break;
			double x1 = R * Math.cos(Math.PI * a / 180)
					* Math.cos(Math.PI * b / 180);
			double y1 = R * Math.cos(Math.PI * a / 180)
					* Math.sin(Math.PI * b / 180);
			double z1 = R * Math.sin(Math.PI * a / 180);

			double x2 = R * Math.cos(Math.PI * c / 180)
					* Math.cos(Math.PI * d / 180);
			double y2 = R * Math.cos(Math.PI * c / 180)
					* Math.sin(Math.PI * d / 180);
			double z2 = R * Math.sin(Math.PI * c / 180);
			double ip = x1 * x2 + y1 * y2 + z1 * z2;
			double normp = Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1)
					* Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2);
			double th = Math.acos(ip / normp);
			System.out.println(Math.round(R * th));
		}
	}
}