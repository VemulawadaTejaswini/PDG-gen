import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double d = sc.nextDouble();
		double ans = m / n - d / n;
		if(ans == m) {
			System.out.printf("%.20f", ans / 2.0);
		} else {
			System.out.printf("%.20f", ans);
		}
	}
}
