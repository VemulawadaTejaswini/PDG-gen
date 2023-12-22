import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main
{
	public void solve()
	{
		Scanner cin = new Scanner(System.in);
		while(true)
		{
			int n = cin.nextInt();
			if(n == 0)break;
			int m1 = cin.nextInt();
			int[][] a = new int[m1][2];
			int prex1 = 0;
			int prey1 = 0;
			for(int i = 0;i < m1;i++)
			{
				int x = cin.nextInt();
				int y = cin.nextInt();
				if(i != 0)
				{
					if(prex1 < x)
					{
						a[i - 1][0] = 1;
						a[i - 1][1]= Math.abs(x - prex1);
					}else if(prex1 > x)
					{
						a[i - 1][0] = 3;
						a[i - 1][1] = Math.abs(prex1 - x);
					}else if(prey1 < y)
					{
						a[i - 1][0] = 0;
						a[i - 1][1] = Math.abs(y - prey1);
					}else if(prey1 > y)
					{
						a[i - 1][0] = 2;
						a[i - 1][1] = Math.abs(prey1 - y);
					}
				}
				prex1 = x;
				prey1 = y;
			}
			for(int i = 1;i <= n;i++)
			{
				int m2 = cin.nextInt();
				int[][] b = new int[m2][2];
				int prex2 = 0;
				int prey2 = 0;
				for(int j = 0;j < m2;j++)
				{
					int x = cin.nextInt();
					int y = cin.nextInt();
					if(j != 0)
					{
						if(prex2 < x)
						{
							b[j - 1][0] = 1;
							b[j - 1][1] = Math.abs(x - prex2);
						}else if(prex2 > x)
						{
							b[j - 1][0] = 3;
							b[j - 1][1] = Math.abs(prex2 - x);
						}else if(prey2 < y)
						{
							b[j - 1][0] = 0;
							b[j - 1][1] = Math.abs(y - prey2);
						}else if(prey2 > y)
						{
							b[j - 1][0] = 2;
							b[j - 1][1] = Math.abs(prey2 - y);
						}else
						{
							break;
						}
					}
					prex2 = x;
					prey2 = y;
				}
				boolean ok = false;
				for(int k = 0;k < 4;k++)
				{
					boolean ook = true;
					for(int l = 0;l < m2 - 1;l++)
					{
						if(a[l][0] == (b[l][0] + k) % 4 && a[l][1]  == b[l][1])continue;
						ook = false;
						break;
					}
					if(ook)
					{
						ok = true;
						break;
					}
					ook = true;
					for(int l = 0;l < m2 - 1;l++)
					{
						if(a[m2 - 2 - l][0] == (b[l][0] + k) % 4 && a[m2 - 2 - l][1] == b[l][1])continue;
						ook = false;
						break;
					}
					
					if(ook)
					{
						ok = true;
						break;
					}
				}
				if(ok)
				{
					System.out.println(i);
				}
			}
			System.out.println("+++++");
		}
	}
	public static void main(String[] args)
	{
		new Main().solve();
	}
}