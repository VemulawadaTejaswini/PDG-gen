import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int m=in.nextInt();
			if((n|m)==0)
				return;
			int a[]=new int[n];
			int b[]=new int[m];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			for(int j=0;j<m;j++)		
				b[j]=in.nextInt();
			int now=0;
			for(int j=0;j<m;j++)
			{
				now+=b[j];
				if(now>=n-1)
				{
					System.out.println(j+1);
					break;
				}
				now+=a[now];
			}
		}
	}
}