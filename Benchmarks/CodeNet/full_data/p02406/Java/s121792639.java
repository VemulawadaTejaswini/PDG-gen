import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);;
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			//check_num
			int x = i;
			
			if(i % 3 == 0)
			{
				System.out.print(" " + i);
				//end_check_num???
			}
			else
			{
				do
				{
					// INCLUDE3
					if(x % 10 == 3)
					{
						System.out.print(" " + i);
						break;	// end_check_num???
					}
					
					x /= 10;
				} while(x != 0);
			}
		}
			
		System.out.print("\n");
	}
}