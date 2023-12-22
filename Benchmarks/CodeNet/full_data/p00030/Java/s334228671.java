import java.util.Scanner;
import java.io.*;

public class Main
{
	static int rec(int d, int now, int n, int ii)
	{
		if(d == 0)
		{
			if(now == n)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		int ans = 0;
		for (int i = ii; i < 10; i++)
		{
			ans += rec(d - 1, now + i, n, i + 1);
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n, s;
		while(true)
		{
			n = sc.nextInt();
			s = sc.nextInt();
			if(n == 0 && s == 0)
			{
				break;
			}
			System.out.println(rec(n, 0, s, 0));
		}
		sc.close();
	}
}
