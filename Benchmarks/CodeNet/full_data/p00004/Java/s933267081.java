import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		double d = scan.nextInt();
		double e = scan.nextInt();
		double f = scan.nextInt();
		double X = (1/(a*e-b*d))*(e*c-b*f);
		double Y = (1/(a*e-b*d))*(-d*c+a*f);
		System.out.printf("%.3f %.3f",X,Y);
	}
}