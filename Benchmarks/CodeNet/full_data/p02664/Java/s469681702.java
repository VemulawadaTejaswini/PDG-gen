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
			char x[]=a.toCharArray();
			for (int i = 0; i < x.length-1; i++)
			{
				 if (x[i]=='?' && x[i+1]=='D')
				{
					x[i]='P';
				}
				 else if(x[i]=='?'&& x[i+1]=='P') {
					 x[i]='D';
				 }
			}
			for (int i = 1; i < x.length; i++)
			{
				 if (x[i]=='?' && x[i-1]=='D')
				{
					x[i]='P';
				}
				 else if(x[i]=='?'&& x[i-1]=='P') {
					 x[i]='D';
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