import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		long x=s.nextInt();
		
		long[][] arr=new long[n][m];
		long[] cost=new long[n];
		
		for(int i=0;i<n;i++)
		{
			cost[i]=s.nextInt();
			
			for(int j=0;j<m;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		long[] skill=new long[m];
		
		long c=fun(arr,cost,0,skill,n,m,0,x);
		
		if(c!=Long.MAX_VALUE)
			System.out.println(c);
		else
			System.out.println(-1);
		
	}
	
	public static long fun(long[][] arr,long[] cost,int curr,long[] skill,int n,int m,long c,long x)
	{
		if(curr==n)
		{
			int count=0;
			
			for(int i=0;i<m;i++)
			{
				if(skill[i]>=x)
				{
					count++;
				}
			}
			
			if(count==m)
				return c;
			else
			{
				return Long.MAX_VALUE;
			}
		}
		
		long[] temp1=new long[m];
		long[] temp2=new long[m];
		
		for(int i=0;i<m;i++)
		{
			temp1[i]=skill[i];
		}
		
		for(int i=0;i<m;i++)
		{
			temp2[i]=skill[i]+arr[curr][i];
		}
		
		long c1=fun(arr,cost,curr+1,temp1,n,m,c,x);
		long c2=fun(arr,cost,curr+1,temp2,n,m,c+cost[curr],x);
		
		return Math.min(c1,c2);
	}
	
}