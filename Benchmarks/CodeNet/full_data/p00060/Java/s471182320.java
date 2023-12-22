import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int sum = a+b;
			int count=0;

			if(sum <=14)
			{
				System.out.println("YES");
				continue;
			}
			for(int i=1; i<=10; i++)
			{
				if(i==a||i==b||i==c)
					continue;
				if(sum +i <= 20)
					count++;
			}
			if(count>=4)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}