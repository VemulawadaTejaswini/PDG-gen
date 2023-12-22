import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		boolean a[] = new boolean[10000001];
		Arrays.fill(a, true);
		a[0]=a[1]=false;
		for(int i=2; i*i<=10000000; i++)
		{
			if(!a[i])
				continue;
			for(int j=i+i; j<=10000000; j+=i)
				a[j] = false;
		}
		
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			if(n==0)
				return;
			for(int i =n; n>0; i--)
			{
				if(a[i]&&a[i-2]&&a[i-6]&&a[i-8])
				{
				System.out.println(i);
				break;
				}
			}
		}
	}

}