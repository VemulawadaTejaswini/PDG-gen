import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		boolean a[] = new boolean[10001];
		Arrays.fill(a, true);
		a[0]=a[1]=false;
		for(int i=2; i*i<=10000; i++)
		{
			if(!a[i])
				continue;
			for(int j=i*2; j<=10000; j+=i)
				a[j]=false;		
		}

		while(sc.hasNext())
		{
			int ans =0;
			int n = sc.nextInt();
			for(int i=1; i<=n; i++)
			{
				if(a[i]&&a[n-i+1])
				{
					ans++;
				}
			}
			System.out.println(ans);
		}

	}
}