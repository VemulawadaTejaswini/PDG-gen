import java.util.Scanner;
import java.io.IOException;

class Main 
{
	private static boolean[] flag;
	private static int a, b, n;

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)	
		{
			n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();
			
			if(n == 0 && a == 0 && b == 0)
			{
				break;	
			}
			
			flag = new boolean[n + 1];
			
			calc();
			System.out.println(count());
		}
		
	}

	private static void calc()
	{
		int i, j;
		for(i = 0; a * i <= n; i++)
		{
			for(j = 0; a * i + b * j <= n; j++)
			{
				flag[a * i + b * j] = true;	
			}
		}
	}

	private static int count()
	{
		int cnt = 0;
		
		for(int i = 0; i < flag.length; i++)
		{
			if(!flag[i])
			{
				cnt++;	
			}
		}
		
		return cnt;
	}
}