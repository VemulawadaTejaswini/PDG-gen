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
		if(a<2)
			return false;
		else if (a==2)
			return true;

		for(int j = 2; j<a; j++)
		{
			if(a%j==0)
				return false;
		}
		return true;
	}
}