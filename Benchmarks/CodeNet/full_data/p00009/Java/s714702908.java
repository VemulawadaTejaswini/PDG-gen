import java.util.Scanner;

public class Main
{

	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int count=0;
			for (int i=2; i<=n; i++)
			{
				if(prim(i))
					count++;
			}		
			System.out.println(count);
		}
	}

	public static boolean prim(int a)
	{
		if (a==2 || a==3 || a==5 || a ==7)
			return true;
		else
			if(a<2 || a%3==0 || a%2==0 || a%5==0 || a%7==0)
				return false;

		for(int j = 2; j<a; j++)
		{
			if(a%j==0)
				return false;
		}
		return true;
	}
}