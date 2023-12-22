import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double H = scan.nextDouble();
		double M = scan.nextDouble();
		double x = 0d;
		double theta = 0d;

		theta = Math.abs(6d * M - (30d * H + 0.5d * M));
		if (theta > 180d) theta = 360d - theta;
		theta = Math.cos(theta / 360d * 2d * Math.PI);

		x += A * A;
		x += B * B;
		x -= 2d * A * B * theta;
		x = Math.sqrt(x);

		System.out.println(x);
 	}
}