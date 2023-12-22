import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		double r = scan.nextInt();
		double pi = Math.PI;
		double S = r*r*pi;
		double R = 2*r*pi;

		System.out.printf("%.6f %.6f",S, R);
	}
} 