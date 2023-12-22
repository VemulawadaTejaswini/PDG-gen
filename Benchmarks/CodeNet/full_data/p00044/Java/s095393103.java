import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{	
		boolean not[] = new boolean[100000];
		
		not[0] = true;
		not[1] = true;
		
		for (int i = 2; i * i < 100000; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 100000; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n;
			try
			{
				n = sc.nextInt();
			}
			catch(Exception e)
			{
				break;
			}
			for (int i = n-1; i >= 2; i--)
			{
				if (not[i] == false)
				{
					System.out.print(i);
					break;
				}
			}
			System.out.print(" ");
			for (int i = n+1; i < 100000; i++)
			{
				if (not[i] == false)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}