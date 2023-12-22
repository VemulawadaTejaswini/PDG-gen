package icpc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double a =  Math.abs(x1-x2);
		double b =  Math.abs(y1-y2);
		System.out.printf("%f", Math.sqrt(a*a + b*b));
	}
}
