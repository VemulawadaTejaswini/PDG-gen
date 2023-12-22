import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int max=-1;
			int ind=-1;
			for(int i=0;i<n;i++)
			{
				int id=in.nextInt();
				int cnt=in.nextInt();
				if(cnt>max)
				{
					ind=id;
					max=cnt;
				}
			}
			System.out.println(ind+" "+max);
		}
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}