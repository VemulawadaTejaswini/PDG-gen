import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
					   b = b*d;
					   c = c*d;
					   e = e*a;
					   f = f*a;

					double y = (c-f)/(b-e);
					double x = (c-(b*y))/(a*d);
					x = (int)((x * 1000)+0.5);
					y = (int)((y * 1000)+0.5);
			System.out.println((double)x/1000 +" "+ (double)y/1000);
	}
}