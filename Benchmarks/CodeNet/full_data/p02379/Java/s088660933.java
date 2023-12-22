import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x = 0, y = 0;
		double result = 0;
		x = Math.pow(x1 - x2, 2);
		y = Math.pow(y1 - y2, 2);
		result = Math.sqrt(x + y);
		System.out.printf("%.8f%n", result);
		sc.close();
	}
}
