import java.util.*;
import java.io.*;

class Main
{
	public static void main( String[] args )
	{
		Main m = new Main();
		m.C();
	}

	void C()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n], y = new int[n], h = new int[n];
		for(int i = 0; i < n; i++)
		{
			int xi = in.nextInt(), yi = in.nextInt(), hi = in.nextInt();
			x[i] = xi;
			y[i] = yi;
			h[i] = hi;
		}
		for(int i = 0; i <= 100; i++)
		{
			for(int j = 0; j <= 100; j++)
			{
				int height = condition(i, j, x, y, h);
				if(height >= 0)
				{
					System.out.printf("%d %d %d\n", i, j, height);
					break;
				}

			}
		}
	}

	int condition(int i, int j, int[] x, int[] y, int[] h)
	{
		int height = Math.abs(i - x[0]) + Math.abs(j - y[0]) + h[0];
		int n = x.length;
		for(int k = 0; k < n; k++)
		{
			int testHeight = Math.abs(i - x[k]) + Math.abs(j - y[k]) + h[k];
			if(testHeight != height) return -1;
		}
		return height;
	}

	void B()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), t = in.nextInt(), inf = Integer.MAX_VALUE;
		int cost = inf;
		for(int i = 0; i < n; i++)
		{
			int ci = in.nextInt(), ti = in.nextInt();
			if(ti <= t)
			{
				cost = Math.min(cost, ci);
			}
		}
		if(cost == inf) System.out.println("TLE");
		else System.out.printf("%d\n", cost);
	}

	void A()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n == 1) System.out.println("Hello World");
		if(n == 2)
		{
			int a = in.nextInt(), b = in.nextInt();
			System.out.println(a + b);
		}
	}

	// int numWays(int k)
	// {
	// 	if(k < 3) return 1;
		
	// }


	// static int B(String str)
	// {
	// 	int cur = Integer.valueOf(str);
	// 	for(int i = 111; i <= 999; i += 111)
	// 		if(cur <= i) return i;
	// 	return cur;	// should not execute this line
	// }

	// static String update(String str)
	// {
	// 	char[] ch = str.toCharArray();
	// 	for(int i = 0; i < 3; i++)
	// 	{
	// 		if(ch[i] == '1') ch[i] = '9';
	// 		else ch[i] = '1';
	// 	}
	// 	return String.valueOf(ch);
	// }

}