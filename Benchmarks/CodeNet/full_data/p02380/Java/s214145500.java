import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double C = scan.nextDouble();
		double rad = Math.toRadians(C);
		double cos_c = Math.toRadians(rad);
		double c2 = a * a + b * b - 2 * a * b * cos_c;
		double c = Math.sqrt(c2);
		double sin_c = Math.toRadians(C);
		double S = a / (2 * sin_c);
		double h = 2 * S / a;
		double L = a + b + c;
		System.out.println(S+" "+L+" "+h);
	}
}



		

	