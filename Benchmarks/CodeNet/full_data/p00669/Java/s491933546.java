import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int k=in.nextInt();
			if((n|k)==0)
				return;
			int a[]=new int[n];
			int max=0;
			int cmax=0;
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<n-k+1;i++)
			{
				int mul=1;
				for(int j=i;j<i+k;j++)
					mul*=a[j];
				max=Math.max(max,mul);
			}
			int ans=-1;
			for(int i=0;i<n;i++)
				for(int j=i+1;j<n;j++)
				{
					int b[]=a.clone();
					int tmp=b[i];
					b[i]=b[j];
					b[j]=tmp;
					for(int s=0;s<n-k+1;s++)
					{
						int mul=1;
						for(int t=s;t<s+k;t++)
							mul*=b[t];
						cmax=Math.max(cmax,mul);
					}
					ans=Math.max(ans,max-cmax);
				}
			System.out.println(ans>=0 ? ans : "NO GAME");
		}
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}