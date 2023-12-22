import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int sum;
			
			while(true)
			{
				int x = sc.nextInt();
				if(x == 0)
				{
					break;
				}
				
				sum = 0;
				while(x > 0)
				{
					sum += x % 10;
					x /= 10;
				}
				System.out.println(sum);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}