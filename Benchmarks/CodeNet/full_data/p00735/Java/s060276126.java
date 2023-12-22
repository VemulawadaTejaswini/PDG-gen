import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int b = stdIn.nextInt();
			if(b == 1)
			{
				break;
			}
			boolean flag[] = new boolean[300001];
			int i = 1;
			System.out.print(b + ":");
			while(true)
			{
				int x = 7 * i - 1;
				if(x > b)
				{
					break;
				}
				if(!flag[x] && b % x == 0)
				{
					System.out.print(" " + x);
					for(int j = x; j <= b; j += x)
					{
						flag[j] = true;
					}
				}
				int y = 7 * i + 1;
				if(y > b)
				{
					break;
				}
				if(!flag[y] && b % y == 0)
				{
					System.out.print(" " + y);
					for(int j = y; j <= b; j += y)
					{
						flag[j] = true;
					}
				}
				++i;
			}
			System.out.println();
		}
	}
}