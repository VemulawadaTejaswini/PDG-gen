import java.util.*;
public class Main 
{
	static int[] ball = new int[10];
	static int a = 0, b = 0;
	static boolean flag = false;
	static void dfs(int pos)
	{
		if(pos >= 10)
		{
			flag = true;
			return;
		}
		if(ball[pos] > a)
		{
			a = ball[pos];
			dfs(pos + 1);
		}
		if(ball[pos] > b)
		{
			b = ball[pos];
			dfs(pos + 1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int N = stdIn.nextInt();
			while(N-- != 0)
			{
				flag = false;
				a = 0;
				b = 0;
				for(int i = 0; i < 10; ++i)
				{
					ball[i] = stdIn.nextInt();
				}
				dfs(0);
				if(flag)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}
	}
}