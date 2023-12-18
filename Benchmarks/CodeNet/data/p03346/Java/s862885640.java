import java.io.*;
import java.util.StringTokenizer;
class Main {

	public static void main(String args[])throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(BR.readLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(BR.readLine());
		}
		int c=Integer.MAX_VALUE;
		for(int j=n;j>0;j--)
		{
			int x=j;
			int y=n-j+1;
			int t1=0,t2=0;
		//	System.out.println(x+"-"+j);
			for(int i=n-1;i>=0;i--)
			{
				if(arr[i]==x)
				{
					x--;
					t1++;
				}
				if(arr[n-1-i]==y)
				{	
					y++;
					t2++;				
				}
			}
			t1=n-t1;
			t2=n-t2;
			y=(n-y)+1;
		//	System.out.println(t1+"+"+t2);
			int z=Math.min(t1, t2);
			c=Math.min(c, z);
		}
		System.out.println(c);
	}
}
