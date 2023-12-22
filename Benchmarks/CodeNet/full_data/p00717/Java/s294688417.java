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
			List<Integer> list = new ArrayList<Integer>();
			int mm = cin.nextInt();
			int[] a = new int[mm - 1];
			int[] b = new int[mm - 1];
			int pa = 0;
			int pb = 0;
			for(int i = 0;i < mm;i++)
			{
				if(i == 0)
				{
					pa = cin.nextInt();
					pb = cin.nextInt();
				}else
				{
					int x = cin.nextInt();
					int y = cin.nextInt();
					
					if(pa < x)
					{
						a[i - 1] = 1;
						b[i - 1] = Math.abs(x - pa);
					}else if(pa > x)
					{
						a[i - 1] = 3;
						b[i - 1] = Math.abs(pa - x);
					}else if(pb < y)
					{
						a[i - 1] = 0;
						b[i - 1] = Math.abs(y - pb);
					}else if(pb > y)
					{
						a[i - 1] = 2;
						b[i - 1] = Math.abs(pb - y);
					}
					pa = x;
					pb = y;
				}
			}
			for(int i = 0;i < n;i++)
			{
				int m = cin.nextInt();
				int[] dif = new int[m - 1];
				int[] dir = new int[m - 1];
				int prex = 0;
				int prey = 0;
				for(int j = 0;j < m;j++)
				{
					int x = cin.nextInt();
					int y = cin.nextInt();
					if(j == 0)
					{
						prex = x;
						prey = y;
					}else
					{
						if(prex < x)
						{
							dir[j - 1] = 1;
							dif[j - 1] = Math.abs(x - prex);
						}else if(prex > x)
						{
							dir[j - 1] = 3;
							dif[j - 1] = Math.abs(prex - x);
						}else if(prey < y)
						{
							dir[j - 1] = 0;
							dif[j - 1] = Math.abs(y - prey);
						}else if(prey > y)
						{
							dir[j - 1] = 2;
							dif[j - 1] = Math.abs(prey - y);
						}
						
						prex = x;
						prey = y;
					}
				}
				boolean ok = false;
				for(int k = 0;k < 4;k++)
				{
					boolean ook = true;
					for(int l = 0;l < m - 1;l++)
					{
						if(a[l] == (dir[l] + k) % 4 && b[l]  == dif[l])continue;
						ook = false;
						break;
					}
					if(ook)
					{
						ok = true;
						break;
					}
					ook = true;
					for(int l = 0;l < m - 1;l++)
					{
						if(a[m - 2 - l] == (dir[l] + k) % 4 && b[m - 2 - l] == dif[l])continue;
						ook = false;
						break;
					}
					
					if(ook)
					{
						ok = true;
						break;
					}
				}
				if(ok)list.add(i + 1);
			}
			for(int v : list)
			{
				System.out.println(v);
			}
			System.out.println("+++++");
		}
	}
	public static void main(String[] args)
	{
		new Main().solve();
	}
}