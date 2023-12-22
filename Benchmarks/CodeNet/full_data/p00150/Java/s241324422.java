import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			int n = sc.nextInt();
			if(n==0)
				return;
			boolean a[] = new boolean[n+1];
			Arrays.fill(a, true);
			a[0]=a[1]=false;

			for(int i=2;i*i<=n; i++)
			{
				if(!a[i]) //falseだったら
					continue;
				for(int j=i+i; j<=n; j+=i)
				{
					a[j] = false;
				}

			}
			int x=0;
			int y=0;
			boolean flag=false;
			for(int i =n; i>=0; i--)
			{
				if(a[i])
					x =i;
				else
					continue;
				for(int j=i-2; j>=0; j--)
				{
					if(a[j])
					{
						y=j;
						if(x-y==2)
						{
							System.out.println(y+" "+x);
							flag = true;
							break;
						}
					}
					else
						break;
				}
				if(flag)
					break;
			}
		}
	}

}