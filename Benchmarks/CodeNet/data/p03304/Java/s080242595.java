import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double d = sc.nextDouble();
		double ans = m / n - d / 2.0;
		System.out.printf("%.20f", ans);
	}
}
