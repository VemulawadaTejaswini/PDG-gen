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
			
			if(a0-d0==0 || c0-f0==0)
				return 0;
			else
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
			double b0 = b/a;
			double c0 = c/a;
			
			double e0 = e/d;
			double f0 = f/d;
			
			if(b0-e0==0 || c0-f0==0)
				return 0;
			else
				return (c0-f0)/(b0-e0);
		}
	}
}