import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);
		boolean f=false;
		while(in.hasNext())
		{
			if(f)
				System.out.println();
			f=true;
			int n=in.nextInt();
			if(n==0)
				return;
			String st[]=new String[n];
			int a[]= new int[n];
			for(int i=0;i<n; i++)
			{
				st[i]=in.next();
				a[i]=in.nextInt()*3+in.nextInt()*0+in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int m=i;
				for(int j=i;j<n; j++)
				{
					if(a[j]>a[m])
						m=j;
				}
				String tmp =st[i];
				st[i] = st[m];
				st[m] = tmp;
				int tmp2 =a[i];
				a[i]=a[m];
				a[m]=tmp2;
			}
			for(int i=0;i<n;i++)
				System.out.println(st[i]+","+a[i]);
		}
	}
}