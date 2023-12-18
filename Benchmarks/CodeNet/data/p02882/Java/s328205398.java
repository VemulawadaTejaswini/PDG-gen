import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		int percent = 100 * x / (a * a * b);

		double ans = 0;
		if(percent >= 50) {
			double volume = a * a * b - x;
			double angle = Math.atan(volume / a * 2 / a / a) / Math.PI * 180;
			ans = angle;
		} else {
			double volume = x;
			double angle = Math.atan(volume / a * 2 / b / b) / Math.PI * 180;
			ans = 90 - angle;
		}
		System.out.println(ans);
	}
}