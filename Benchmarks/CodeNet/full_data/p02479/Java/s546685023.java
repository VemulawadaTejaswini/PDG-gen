import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double r = sc.nextDouble();
	    double pi = Math.PI;
	    double area = r * r * pi;
        double length = 2 * r * pi;
        System.out.printf("%.6f %.6f", area, length);
	}
}