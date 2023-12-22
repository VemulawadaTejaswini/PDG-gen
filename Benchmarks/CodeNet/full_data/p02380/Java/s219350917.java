

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] distance = str.split(" ");
		
		double a = Double.parseDouble(distance[0]);
		double b = Double.parseDouble(distance[1]);
		double C = Double.parseDouble(distance[2]);
		
		double S = a * b * Math.sin(Math.toRadians(C)) / 2;
		double L = a + b + Math.sqrt(a*a + b*b - 2 * a * b* Math.cos(Math.toRadians(C)));
		//double L = Math.pow(((Math.pow(a, 2) + (Math.pow(b, 2) - 2 * a * b * Math.cos(C)))), 0.5) + a + b;
		double h = (2 * S) / a;
		/*
		double S = a * b / 2;
		double L = Math.pow(((Math.pow(a, 2) + (Math.pow(b, 2)))), 0.5) + a + b;
		double h = (2 * S) / a;
		*/
		
		System.out.printf("%.8f\n",S);
		System.out.printf("%.8f\n",L);
		System.out.printf("%.8f\n",h);
	}
}