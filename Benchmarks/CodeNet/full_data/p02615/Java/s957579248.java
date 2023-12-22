import java.util.*;

class Main
{
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		long ans=0;
		for(int i=1;i<n;i++)
		{
			ans=ans+a[i];
		}
		System.out.println(ans);
	}
}