
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		//	0<=h<=11
		double h = scan.nextDouble();
		//	0<=m<=59
		double m = scan.nextDouble();

		double zishinKakudo = (Math.PI * h / 6.0) + (Math.PI * m / 6.0 / 60.0);
		double hunshinKakudo = Math.PI * 2.0 * m / 60.0;

		double diffOfKakudo = Math.abs(zishinKakudo - hunshinKakudo);

//		if (diffOfKakudo > Math.PI) {
//			diffOfKakudo = diffOfKakudo - Math.PI;
//		}

		double L = Math.pow(a, 2) + Math.pow(b, 2) - (2.0 * a * b * Math.cos(diffOfKakudo));
		double l = Math.sqrt(L);
		System.out.println(l);

	}

}
