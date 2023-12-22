import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
	sc = new Scanner(System.in);
	double pi = Math.PI;
	double a = sc.nextDouble();
	double area = a*a*pi;
	double length = a*2*pi; 
	System.out.printf("%f %f", area, length);
	}
}