import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double h = b * Math.sin(Math.toRadians(c));
		double S = a * h / 2;
		double L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c)));

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}

}
