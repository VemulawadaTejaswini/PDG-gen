import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int [] prime =new int[1299710];
		for(int i=2;i<1299710;i++)
		{
			if(prime[i]==0)
			{
				for(int j=1;i*j<1299710;j++)
				{
					if(prime[i*j]==0)
					{
						prime[i*j]=i*j;
					}
					prime[i*j]=prime[i*j]/i;
					prime[i*j]*=(i-1);
				}
			}
		}
		int [] ch=new int [1299710];
		ch[1]=0;
		ch[2]=1;
		int n=in.nextInt();
		int a=in.nextInt();
		int k=in.nextInt();
		int q=0;
		int [] num=new int [k];
		for(int i=2;i<1299710;i++)
		{
			ch[i]=ch[prime[i]]+1;
			if(prime[i]==(i-1))
			{				
				if(ch[i]<k)
				{
					num[ch[i]]++;
				}
				q++;
				if(q==n)
				{
					i=2000000;
				}
			}
		}		
		int [] ans=new int [k];
		ans[0]=1;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<a;j++)
			{
				for(int l=0;l<k;l++)
				{
					if(l-((j+1)*i)>=0)
					{
						ans[l]=ans[l-(j+1)*num[i]]+num[i];
					}
				}
			}
		}
		System.out.println("here"+" "+k);
		for(int i=0;i<k;i++)
		{
			System.out.println(ans[i]);
		}		
	}
}
	