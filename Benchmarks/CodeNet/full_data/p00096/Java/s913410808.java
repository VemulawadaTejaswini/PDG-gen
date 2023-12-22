import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int k[]=new int[2001];
		int cnt[]=new int[4001];
		
		for(int i=0;i<=1000;i++)
			for(int j=0;j<=1000;j++)
				k[i+j]++;

		for(int i=0;i<=2000;i++)
			for(int j=0;j<=2000;j++)
					cnt[i+j]+=k[i]*k[j];
		
		while(in.hasNext())
			System.out.println(cnt[in.nextInt()]);
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}