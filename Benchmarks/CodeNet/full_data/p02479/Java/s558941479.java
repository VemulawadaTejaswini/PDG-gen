import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		double pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double area = r * r * pi;
		double length = 2 * r * pi;
		System.out.printf("%f %f", area, length);
	}

}