import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			double v = scanner.nextDouble();
			
			double y = v*v / 19.6;
			int n = 0;
			for(; 5*(n-1)<y; n++);
			
			System.out.println(n);
		}
	}
}