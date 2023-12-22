import java.util.*;
public class Main 
{
	static int days[] = {20, 19, 20, 19, 20, 19, 20, 19, 20, 19};
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		while(n-- != 0)
		{
			int y = stdIn.nextInt();
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			int sum = 0;
			for(int i = y + 1; i < 1000; ++i)
			{
				if(i % 3 == 0)
				{
					sum += 200;
				}
				else
				{
					sum += 195;
				}
			}
			if(y % 3 == 0)
			{
				for(int i = m; i < 10; ++i)
				{
					sum += 20;
				}
				sum += 20 - d;
			}
			else
			{
				for(int i = m; i < 10; ++i)
				{
					sum += days[i];
				}
				if(m % 2 == 0)
				{
					sum += 19 - d;
				}
				else
				{
					sum += 20 - d;
				}
			}
			System.out.println(sum + 1);
		}
	}
}