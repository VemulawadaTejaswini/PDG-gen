import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			int ob=in.nextInt();
			int c=1;
			int l=0;
			int h=n-1;
			while(true)
			{
				c++;
				int ex=(l+h)/2;
				if(a[ex]==ob||ex+1>=n||ex-1<0)
					break;
				else if(a[ex]<ob)
					l=ex+1;
				else if(a[ex]>ob)
					h=ex-1;
				if(l==h)
					break;

			}
			System.out.println(c);
		}
	}
}