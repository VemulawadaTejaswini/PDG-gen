import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int y = stdIn.nextInt();
			int ans = 0;
			double max = 0;
			while(n-- != 0)
			{
				int b = stdIn.nextInt();
				int r = stdIn.nextInt();
				int t = stdIn.nextInt();
				double sum = 1;
				if(t == 1)
				{
					sum = 1 + y * r / 100.0;
				}
				else
				{
					sum = Math.pow(1 + r / 100.0, y);
				}
				if(sum > max)
				{
					ans = b;
					max = sum;
				}
			}
			System.out.println(ans);
		}
	}
}