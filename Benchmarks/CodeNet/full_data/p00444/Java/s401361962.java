import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			int n=1000-sc.nextInt();
			if(n==1000)
				return;
			int ans = 0;

			if(n>=500)
			{
				n -=500;
				ans++;
			}
			while(n>=100)
			{
				n-=100;
				ans++;
			}
			if(n>=50)
			{
				n-=50;
				ans++;
			}
			while(n>=10)
			{
				n-=10;
				ans++;
			}
			if(n>=5)
			{
				n-=5;
				ans++;
			}
			while(n>=1)
			{
				n-=1;
				ans++;
			}
			System.out.println(ans);
		}
	}
}