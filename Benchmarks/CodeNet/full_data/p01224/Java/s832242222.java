import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
				return;
			int sum=0;

			for(int i=1;i<n;i++)
			{
				if(n%i==0)
					sum+=i;
				if(sum>n)
				{
					System.out.println("abundant number");
					break;
				}
			}

			if(n==sum)
				System.out.println("perfect number");
			else if(n>sum)
				System.out.println("deficient number");

		}
	}

}