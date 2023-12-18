import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] a = new int [n+1];
		int [] ans=new int [n+1];
		int no=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=n;i>0;i--)
		{
			int q=0;
			for(int j=1;j*(i)<=n;j++)
			{				
				q=q+ans[i*j];
				
			}
			q=q%2;
				if(q==a[i])
				{
					ans[i]=0;
				}
				else
				{
					ans[i]=1;
					no++;
				}
		}
		System.out.println(no);
		for(int i=1;i<=n;i++)
		{
			if(ans[i]==1)
			{
				System.out.print(i);
			}
		}
	}
}
	