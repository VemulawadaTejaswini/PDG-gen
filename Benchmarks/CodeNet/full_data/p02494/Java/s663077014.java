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
				int h = sc.nextInt();
				int w = sc.nextInt();
				
				if(h == 0 && w == 0)
				{
					break;
				}
				else
				{
					for(int i = 0; i < h; i++)
					{
						for(int j = 0; j < w; j++)
						{
							System.out.print("#");
						}
						System.out.print("\n");
					}
					System.out.print("\n");
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}