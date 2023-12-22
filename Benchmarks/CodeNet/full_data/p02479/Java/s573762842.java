import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		
		double a = r * r * 3.14;
		double b = r * 2 * 3.14;
		
		System.out.printf("%f %f", a, b);
	}
}