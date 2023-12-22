import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		double a = Integer.parseInt(s[0]);
		double b = Integer.parseInt(s[1]);
		double C = Integer.parseInt(s[2]);
		double radC = Math.toRadians(C);
		double sinC = Math.sin(radC);
		double cosC = Math.cos(radC);
		double tanC = Math.tan(radC);
		double cc = (a * a + b * b) - (2 * a * b * cosC);
		double S = ((double) 1 / 2) * a * b * sinC;
		double L = a + b + (Math.sqrt(cc));
		double h = b * sinC;
		System.out.println(String.format("%.8f", S));
		System.out.println(String.format("%.8f", L));
		System.out.println(String.format("%.8f", h));
	}
}
