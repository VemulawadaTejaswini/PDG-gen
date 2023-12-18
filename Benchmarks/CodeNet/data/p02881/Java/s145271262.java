import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc  =   new Scanner(System.in);
		
		long no		=	sc.nextLong();
		
		for(long i = 2; i<= no; i++)
		{
			if(no%i == 0)
			{
				long j = no/i;
				System.out.println(i+j-2);
			}
		}
		
	}

}
