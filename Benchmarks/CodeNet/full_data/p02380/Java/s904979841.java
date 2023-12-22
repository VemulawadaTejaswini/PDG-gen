import java.util.Scanner;
import static java.lang.Math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = toRadians(sc.nextDouble());
		double S = b * a * sin(c) / 2;
		double L = a + b + sqrt(pow(a,2) + pow(b,2) - 2*a*b*cos(c));
		double h = b * sin(c);
		System.out.printf("%f %f %f\n",S, L, h);
	}
}

