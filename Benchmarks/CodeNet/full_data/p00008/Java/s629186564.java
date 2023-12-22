import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		int c[]=new int[20];
		int cnt[]=new int[51];
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				c[i+j]++;
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
			cnt[i+j]+=c[i]*c[j];
		while(in.hasNext())
		{
			int n=in.nextInt();
			System.out.println(cnt[n]);
		}
	}
	
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}