import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = 0;
		double C = sc.nextDouble() * (Math.PI / 180);
		double S = 0;
		double L = 0;
		double h = 0;
		h = b * Math.sin(C);
		double bcosC = b * Math.cos(C);
		double aminusbcosC = a - bcosC;
		c = Math.sqrt(Math.pow(h, 2) + Math.pow(aminusbcosC, 2));
		S = a * h / 2;
		L = a + b + c;
		System.out.printf("%f%n%f%n%f%n", S, L, h);
		sc.close();
	}
}
