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
		double S = a * b * sin_c / 2;
		double h = b * sin_c;
		double L = a + b + c;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}



		

	