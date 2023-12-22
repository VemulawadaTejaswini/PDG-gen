import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext(); )
		{
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			int n = scanner.nextInt();
			
			int sum = 0;
			for(int i=0; i<n; i++)
			{
				a *= 10;
				sum += (int)(a/b)%10;
			}
			
			System.out.println(sum);
		}
	}
}