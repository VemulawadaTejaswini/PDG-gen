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
				if(a < 10)
				{
					++num[0];
				}
				else if(a < 20)
				{
					++num[1];
				}
				else if(a < 30)
				{
					++num[2];
				}
				else if(a < 40)
				{
					++num[3];
				}
				else if(a < 50)
				{
					++num[4];
				}
				else if(a < 60)
				{
					++num[5];
				}
				else
				{
					++num[6];
				}
			}
			for(int i = 0; i < 7; ++i)
			{
				System.out.println(num[i]);
			}
		}
	}
}