import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			while(true)
			{
				int m = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();
				
				if(m == -1 || f == -1)
				{
					if(r == -1)
					{
						break;
					}
					else
					{
						System.out.println("F");
					}
				}
				else if(m + f >= 80)
				{
					System.out.println("A");
				}
				else if(m + f >= 65)
				{
					System.out.println("B");
				}
				else if(m + f >= 50)
				{
					System.out.println("C");
				}
				else if(m + f >= 30)
				{
					if(r >= 50)
					{
						System.out.println("C");
					}
					else
					{
						System.out.println("D");
					}
				}
				else
				{
					System.out.println("F");
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}