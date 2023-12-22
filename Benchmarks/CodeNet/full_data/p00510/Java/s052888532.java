import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int m=in.nextInt();
			int max=0;
			for(int i=0;i<n;i++)
			{
				 m+=in.nextInt()-in.nextInt();
				 if(m<0)
					 break;
				 max=Math.max(max, m);
			}
			System.out.println(m<0 ? 0:max);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}