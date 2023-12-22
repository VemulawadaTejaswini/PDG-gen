import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int nn=0;
		int hit=0;
		int out=0;
		int ans=0;

		while(sc.hasNext())
		{
			String str = sc.next();

			if(str.compareTo("HIT")==0)
			{
				hit++;
				if(hit==4)
				{
					ans++;
					hit=3;
				}
			}
			else if(str.compareTo("OUT")==0)
			{
				out++;
				if(out==3)
				{
					nn++;
					out=0;
					hit=0;
					System.out.println(ans);
					ans=0;
				}
				if(nn==n)
					return;
			}
			else if(str.compareTo("HOMERUN")==0)
			{
				ans+=1+hit;
				hit=0;
			}
		}	
	}
}