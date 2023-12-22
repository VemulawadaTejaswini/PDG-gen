import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str=in.next();
			int a[]=new int[10];
			for(int i=0;i<str.length();i++)
				a[str.charAt(i)-'0']++;
			int ans[]=new int[10];
			for(int i=1;i<=9;i++)
			{
				if(a[i]==4)
					continue;
				a[i]++;
				for(int j=1 ; j <= 9 ; j++ )
				{
					if( a[j] >= 2 )
					{
						a[j] -= 2;
						sol(a,i,ans);
						a[j] += 2;
					}
				}
				a[i]--;
			}
			int j=0;
			for(int i=1;i<=9;i++)
			{
				if(ans[i]==1)
				{
					if(j!=0)
						System.out.print(" ");
					System.out.print(i);
					j=1;
				}
			}
			if(j==0)
				System.out.print(0);
			System.out.println();
		}
	}

	public static void sol(int a[],int n,int ans[])
	{
		int s=0;
		for(int i=1;i<=9;i++)
			s+=a[i];
		if(s==0)
			ans[n]=1;

		for(int i=1; i <= 9 ; i++ )
		{
			if( a[i] >= 3 )
			{
				a[i] -= 3;
				sol( a , n , ans );
				a[i] += 3;
			}
		}
		for(int i=1 ; i <= 7 ; i++ )
		{
			if(a[i]>=1&&a[i+1]>=1&&a[i+2]>=1)
			{
				a[i]--;
				a[i+1]--;
				a[i+2]--;
				sol( a , n , ans );
				a[i]++;
				a[i+1]++;
				a[i+2]++;
			}

		}
	}
}