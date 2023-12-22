package itp.itp1_10_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double C = sc.nextInt();
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
