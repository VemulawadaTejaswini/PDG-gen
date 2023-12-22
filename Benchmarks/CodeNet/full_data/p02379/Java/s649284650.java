import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1 = scanner.nextInt();
		double y1 = scanner.nextInt();
		double x2 = scanner.nextInt();
		double y2 = scanner.nextInt();
		double a =  x1-x2;
		double b =  y1-y2;
		System.out.printf("%lf\n", Math.sqrt(a*a + b*b));
	}
}
