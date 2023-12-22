
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double h = sc.nextInt();
			double m = sc.nextInt();

			double hr = (((h * 60) + m) / 720) * 360 * Math.PI / 180;
			double mr = (m / 60) * 360 * Math.PI / 180;

			double ax = a * Math.cos(hr);
			double ay = a * Math.sin(hr);
			double bx = b * Math.cos(mr);
			double by = b * Math.sin(mr);

			double result = Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
			System.out.println(result);
		}
	}
}
