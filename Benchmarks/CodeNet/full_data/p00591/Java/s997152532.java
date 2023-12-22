import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[][]=new int[n][n];
			int max[]=new int[n];
			int min[]=new int[n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
				a[i][j]=in.nextInt();
			for(int i=0;i<n;i++)
			{
				Arrays.fill(max, 0);
				Arrays.fill(min, 10000);
			}
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
				{
					max[i]=Math.max(max[i],a[i][j]);
					min[i]=Math.min(min[i], a[i][j]);
				}
			int ans=0;
			for(int i=0;i<n;i++)
			{
				ans=Math.max(ans, min[i]);
			}
			System.out.println(ans);
		}
	}
}