import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in= new Scanner(System.in);
		boolean f=false;
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			if(f)
				System.out.println();
			f=true;
			String st[]=new String[n];
			int a[]= new int[n];
			int dex[]=new int[n];
			for(int i=0;i<n; i++)
			{
				st[i]=in.next();
				a[i]=in.nextInt()*3+in.nextInt()*0+in.nextInt();
				dex[i]=i;
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
				int tmp6 = dex[i];
				dex[i]=dex[m];
				dex[m]=tmp6;
				for(int k=i+1;k<n; k++)
				{
					m=k;
					for(int l=k;l<n;l++)
					{
						if(dex[l]<dex[m])
							m=l;
					}
					int tmp3 = dex[k];
					dex[k]=dex[m];
					dex[m]=tmp3;
					String tmp4 =st[k];
					st[k] = st[m];
					st[m] = tmp4;
					int tmp5 =a[k];
					a[k]=a[m];
					a[m]=tmp5;
				}
			}
			for(int i=0;i<n;i++)
				System.out.println(st[i]+","+a[i]);
		}
	}
}