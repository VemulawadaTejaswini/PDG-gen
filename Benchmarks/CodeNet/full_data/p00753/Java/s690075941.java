import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		boolean a[] = new boolean [123456*2+1];
		Arrays.fill(a, true);
		a[0]=a[1]=false;
		for(int i=2; i*i<=123456*2; i++)
		{
			if(!a[i])
				continue;
			for(int j=i*2; j<=123456*2; j+=i)
				a[j]=false;
		}

		while(sc.hasNext())
		{
			int ans =0;
			int n = sc.nextInt();
			if(n==0)
				return;

			for(int i =n+1; i<=n*2; i++)
				if(a[i])
					ans++;

			System.out.println(ans);
		}
	}
}