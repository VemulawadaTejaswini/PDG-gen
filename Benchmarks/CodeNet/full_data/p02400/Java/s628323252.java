import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double c = r * Math.PI * 2;
		double a = r * r * Math.PI;

		System.out.printf("%f", a);
		System.out.print(" ");
		System.out.printf("%f", c);

		sc.close();
	}
}
