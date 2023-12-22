import java.util.*
public class Main
{
	public static void  main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int p=0;
			for(int i=0;i<n;i++)
			{
				int a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				if(a[i]%2!=0 && (i+1)%2!=0)
					p++;
			}
			System.out.println(p);
			--t;

		}
	}
}