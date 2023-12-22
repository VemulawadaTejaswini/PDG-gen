import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			double r, x, y, z ;
			r = d*c/a;
			z = -1*d*b/a;
			y = (f + (-1)*r) / (z+e);
			x = (c + (-1)*b*y) / a;
			System.out.printf("%.3f %.3f", x, y);
	}
}