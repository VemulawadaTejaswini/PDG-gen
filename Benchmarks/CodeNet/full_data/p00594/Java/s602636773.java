import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();//n<1000000
			if(n==0)
				return;
			String a[]=new String[n];
			for(int i=0;i<n;i++)
				a[i]=in.next();
			Arrays.sort(a);
			int cnt=0;
			int ans=-1;
			String ele=a[0];
			for(int i=0;i<n;i++)
			{
				if(ele.equals(a[i]))
				{
					cnt++;
					if(cnt>n/2)
					{
						ans=Integer.valueOf(ele);
						break;
					}
				}
				else
				{
					cnt=1;
					ele=a[i];
				}
			}
			System.out.println(ans!=-1 ? ans:"NO COLOR");
		}
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}