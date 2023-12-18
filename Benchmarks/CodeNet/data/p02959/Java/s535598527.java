import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[])throws IOException
	{
		int n,max=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n+1];
		int b[]=new int[n];
		for( i=0;i<n+1;i++)
		{
			a[i]=sc.nextInt();
		}

		for( i=0;i<n;i++)
			b[i]=sc.nextInt();
		for( i=n-1;i>=0;i--)
		{
			if(b[i]<=a[i+1])
			{
				max+=a[i+1]-b[i];
				a[i+1]-=b[i];
				b[i]=0;
			}
			else if(b[i]>a[i+1])
			{
				max+=a[i+1];
				b[i]-=a[i+1];
				a[i+1]=0;

			}
			if(b[0]>0)
				max+=(a[0]-b[0]);
		}
		
		System.out.println(max);
	}
}