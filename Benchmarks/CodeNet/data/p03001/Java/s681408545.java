import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W, H, x, y;
		W = sc.nextDouble();
		H = sc.nextDouble();
		x = sc.nextDouble();
		y = sc.nextDouble();

		double a = H * (W - x);
		double b = (H - y) * W;

		if (a != b) {
			System.out.print(String.format("%.6f", Math.max(a, b)) + " ");
			System.out.println(0);
		} else {
			System.out.print(String.format("%.6f", a) + " ");
			System.out.println(1);
		}
	}
}