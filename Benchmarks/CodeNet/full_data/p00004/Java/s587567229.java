import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double X;
		double Y;
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();
			e = scan.nextInt();
			f = scan.nextInt();
			X = (1/(a*e-b*d))*(e*c-b*f);
			Y = (1/(a*e-b*d))*(-d*c+a*f);
			if(Math.abs(X) < 0.0005) X = 0;
			if(Math.abs(Y) < 0.0005) Y = 0;
			System.out.printf("%.3f %.3f",X,Y);
			System.out.println("");
		}
	}
}