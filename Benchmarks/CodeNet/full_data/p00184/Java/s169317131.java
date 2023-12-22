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
			int[] num = new int[7];
			for(int i = 0; i < n; ++i)
			{
				int a = stdIn.nextInt();
				int b = 0;
				while(b < 6 && a >= (b + 1) * 10)
				{
					++b;
				}
				++num[b];
			}
			for(int i = 0; i < 7; ++i)
			{
				System.out.println(num[i]);
			}
		}
	}
}