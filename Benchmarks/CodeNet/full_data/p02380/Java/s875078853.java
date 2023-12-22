import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("0.########");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int C = sc.nextInt();
		double S = 0;
		double L = 0;
		double H = 0;
		double z;
		if(C == 90){
			H = b;
			S = a * b / 2;
			z = Math.sqrt(a * a + b * b);
			L = a + b + z;
		}
		else{
			double sinθ = Math.sin(Math.toRadians(C));
			double cosθ = Math.cos(Math.toRadians(C));
			S = a * b / 2 * sinθ;
			H = b * sinθ;
			z = Math.sqrt(a * a + b * b - 2 * a * b * cosθ);
			L = a + b + z;

			
		}
		System.out.println(df1.format(S));
		System.out.println(df1.format(L));
		System.out.println(df1.format(H));
		
	}
}
