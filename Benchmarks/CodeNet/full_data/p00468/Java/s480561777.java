import java.util.HashMap;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int m=in.nextInt();
			if((n|m)==0)
				return;
			int f[][]=new int [n+1][n+1];
			HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<m;i++)
			{
				int a=in.nextInt();
				int b=in.nextInt();
				f[a][b]++;
				f[b][a]++;
			}
			
			for(int i=1;i<=n;i++)
			{
				if(f[1][i]!=0)
				{
					map.put(i, 1);
					for(int j=2;j<=n;j++)
					{
						if(f[i][j]!=0)
							map.put(j, 1);
					}
				}
			}
			System.out.println(map.size());
		}
	}
}