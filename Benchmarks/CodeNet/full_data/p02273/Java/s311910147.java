import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double p1x = 0;
		double p1y = 0;
		double p2x = 100;
		double p2y = 0;
		System.out.println(MessageFormat.format("{0,number,0.00000000}",p1x)+" "+MessageFormat.format("{0,number,0.00000000}",p1y));
		koch(number, p1x, p1y, p2x, p2y);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",p2x)+" "+MessageFormat.format("{0,number,0.00000000}",p2y));
		sc.close();

		
	}
	
	public static void koch(int n, double p1x, double p1y, double p2x, double p2y){
		if(n == 0) return;
		double Sx = (2 * p1x + 1 * p2x) / 3;
		double Sy = (2 * p1y + 1 * p2y) / 3;
		double Tx = (1 * p1x + 2 * p2x) / 3;
		double Ty = (1 * p1y + 2 * p2y) / 3;
		double Ux = (Tx - Sx) *(double) Math.cos(Math.toRadians(60)) - (Ty - Sy) * (double)Math.sin(Math.toRadians(60)) + Sx;
		double Uy = (Tx - Sx) * (double)Math.sin(Math.toRadians(60)) +(Ty - Sy) * (double)Math.cos(Math.toRadians(60)) + Sy;
		
		koch(n-1 , p1x, p1y, Sx ,Sy);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",Sx)+" "+MessageFormat.format("{0,number,0.00000000}",Sy));
		koch(n - 1, Sx, Sy, Ux, Uy);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",Ux)+" "+MessageFormat.format("{0,number,0.00000000}",Uy));
		koch(n - 1, Ux, Uy, Tx, Ty);
		System.out.println(MessageFormat.format("{0,number,0.00000000}",Tx)+" "+MessageFormat.format("{0,number,0.00000000}",Ty));
		koch(n - 1, Tx, Ty, p2x, p2y);
	}

}

