import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int l=in.nextInt();
			if(l==0)
				return;
			int h=in.nextInt();
			int ans=0;
			for(int i=l;i<=h;i++)
			{
				int tmp=i;
				for(;;)
				{
					if(tmp==1)
					{
						ans++;
						break;
					}
					if(tmp%5==0)
						tmp/=5;
					else if(tmp%3==0)
						tmp/=3;
					else if(tmp%2==0)
						tmp/=2;
					else break;
				}
			}
			System.out.println(ans);
		}
	}
}