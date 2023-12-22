import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			boolean  a[]=new boolean[300001];
			Arrays.fill(a, true);
			for(int i=2;i<=300000;i++)
			{
				if(!a[i])
					continue;
				if(i%7==1||i%7==6)
					for(int j=i+i;j<=300000;j+=i)
						a[j]=false;
			}
			for(int i=0;i<=300000;i++)
			{
				if(i%7!=1&&i%7!=6)
					a[i]=false;
			}
			System.out.print(n+":");
			for(int i=2;i<=n;i++)
			{
				if(a[i])
					if(n%i==0)
						System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}