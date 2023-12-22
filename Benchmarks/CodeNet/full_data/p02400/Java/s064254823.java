import java.util.Scanner;
import java.lang.Math; 

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double cir = 2 * r * Math.PI;
		double area = Math.PI * r * r;
		System.out.printf("%.5f %.5f", area, cir);

	}

}

