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
			int z = n * n * n;
			int x = n -1;
			int y = 1;
			int min = z;
			while(x >= y)
			{
				int result = z - x * x * x - y * y * y;
				while(result >= 0)
				{
					if(result < min)
					{
						min = result;
					}
					++y;
					result = z - x * x * x - y * y * y;
				}
				--x;
			}
			System.out.println(min);
		}
	}
}