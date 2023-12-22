import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	double r = sc.nextDouble();
	double pi = Math.PI;
	double area = pi * r * r;
	double length = pi * 2 * r;
	System.out.printf("%f %f", area, length);
}