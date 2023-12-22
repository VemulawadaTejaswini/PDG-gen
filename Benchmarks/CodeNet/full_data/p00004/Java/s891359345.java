import java.util.Scanner;


public class Main
{
	static double a, b, c, d, e, f;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			c = scanner.nextDouble();
			
			d = scanner.nextDouble();
			e = scanner.nextDouble();
			f = scanner.nextDouble();
			

			

			System.out.printf("%1$.3f %2$.3f\n", getX(), getY());
		}
	}
	
	private static double getX()
	{
		if(b == 0)
		{
			return c/a;
		}
		else if(e == 0)
		{
			return f/e;
		}
		else {		
			double a0 = a/b;
			double c0 = c/b;
			
			double d0 = d/e;
			double f0 = f/e;
			return (c0-f0)/(a0-d0);
		}
	}
	
	private static double getY()
	{
		if(a == 0)
		{
			return c/b;
		}
		else if(d == 0)
		{
			return f/d;
		}
		else 
		{	
			double b1 = b/a;
			double c1 = c/a;
			
			double e1 = e/d;
			double f1 = f/d;
			
			return (c1-f1)/(b1-e1);
		}
	}
}