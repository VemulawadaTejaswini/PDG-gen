import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			int Q=in.nextInt();
			if((N|Q)==0)
				return;
			String name[]=new String[1001];
			int base[]=new int[1001];
			int era[]=new int[1001];
			
			for(int i=0;i<N;i++)
			{
				name[i]=in.next();
				int j=in.nextInt();
				era[i]=in.nextInt();
				base[i]=era[i]-j+1;
			}
			
			for(int i=0;i<Q;i++)
			{
				int year=in.nextInt();
				int j=0;
				for(;j<N;j++)
				{
					if(base[j]<=year&&year<=era[j])
					{
						System.out.println(name[j]+" "+(year-base[j]+1));
						break;
					}
					
				}
				if(j==N)
					System.out.println("Unknown");
			}
		}
	}
	
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}