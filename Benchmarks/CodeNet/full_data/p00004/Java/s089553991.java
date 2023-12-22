import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			
			double d = scanner.nextDouble();
			double e = scanner.nextDouble();
			double f = scanner.nextDouble();
			
			double a0 = a/b;
			double c0 = c/b;
			
			double d0 = d/e;
			double f0 = f/e;
			double x = (c0-f0)/(a0-d0);
			
			double b1 = b/a;
			double c1 = c/a;
			
			double e1 = e/d;
			double f1 = f/d;
			
			double y = (c1-f1)/(b1-e1);
			System.out.printf("%1$.4f %2$.4f\n", x, y);
		}
	}
}