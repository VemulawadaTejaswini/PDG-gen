import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int st = sc.nextInt();
			int fi = sc.nextInt();
			if(st==0 && fi==0)
				return;
			else System.out.println();
			boolean judge = true;
			for(int i = st; i<=fi; i++)
			{
				if(i%4==0 && i%100!=0)
				{
					System.out.println(i);
					judge = false;
					continue;
				}
				else if(i%400==0)
				{
				System.out.println(i);
				judge = false;
				}
			}
			if(judge)
				System.out.println("NA");
		}	
	}
}