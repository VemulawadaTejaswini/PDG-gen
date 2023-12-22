import java.util.Arrays;
import java.util.Scanner;

public class  Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		boolean a[] = new boolean [1000001];
		Arrays.fill(a, true);
		a[0]=a[1]=false;
		for(int i=0; i*i<=1000000;i++)
		{
			if(!a[i])
				continue;
			for(int j=i*2; j<=1000000; j+=i)
				a[j]=false;
		}

		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
				return;
			int ans=0;

			for(int i=1; i<=n/2; i++)
			{
				if(!a[i])
					continue;
				if(a[n-i])
				{
					//System.out.println(i+" "+(n-i));
					ans++;
				}
			}
			System.out.println(ans);

		}
	}

}