import java.util.Scanner;

public class B 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int no		=	sc.nextInt();
		
		for(int i= 1; i < 10; i++)
		{
			if(no%i == 0 && no/i < 10)
			{
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
}
