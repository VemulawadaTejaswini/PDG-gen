import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n= in.nextInt();
			int a[] = new int[n];
			int ans = 0;
			for(int i=0; i<n; i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			int sum[]= new int [n];
			sum[0]=a[0];
			for(int i=1; i<n; i++)
				sum[i]=a[i]+sum[i-1];
			for(int i=0; i<n ;i++)
			ans+=sum[i];
			System.out.println(ans);
		}

	}

}