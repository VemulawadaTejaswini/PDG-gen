import java.util.Scanner;
public class Main
{
	public  static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[][] = new int[n][n];
			a[(n/2)+1][n/2]=1;
			int c=2;
			int x=(n/2)+1;
			int y=n/2;
			x++;
			y++;
			while(c<=n*n)
			{
				if(x<n&&y>=0&&y<n&&a[x][y]==0)
				{
					a[x][y]=c;
					x++;
					y++;
					c++;
				}
				if(y==n)
				{
					y=0;
				}
				if(x==n)
				{
					x=0;
				}
				if(y==-1)
				{
					y=n-1;
				}
				if(a[x][y]!=0)
				{
					y--;
					x++;
				}
			}
			for(int i=0; i<n;i++)
			{
				for(int j=0; j<n; j++)
					System.out.printf("%4d",a[i][j]);
				System.out.println();
			}
		}
	}
}