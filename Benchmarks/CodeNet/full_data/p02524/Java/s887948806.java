import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		double S = a * b * Math.sin(Math.toRadians(c)) / 2.0;
		double d = (a * a) + (b * b) - 2 * a * b * Math.cos(Math.toRadians(c));
		d = Math.sqrt(d);
		double L = a + b + d;
		double h = b * Math.sin(Math.toRadians(c));
		
		System.out.println(S + " " + L + " " + h);
	}
}

		