import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String a = sc.next();
			char x[] = a.toCharArray();
			if (x[0]=='?')
			{
				x[0]='P';
			}
			for (int i = 1; i < x.length; i++)
			{
				if (x[i-1]=='P' && x[i]=='?')
				{
					x[i]='D';
				}else {
					x[i]='P';
				}
			}
		

			for (int i = 0; i < x.length; i++)
			{
				System.out.print(x[i]);
			}
			System.out.println();
		}
	}
}