import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int N=in.nextInt();//number of room
			int M=in.nextInt();//number of Pr
			int s[]=new int[M];
			int t[]=new int[M];
			for(int i=0;i<M;i++)
			{
				s[i]=in.nextInt();
				t[i]=in.nextInt();
			}
			int te=1;
			int ans=0;
			boolean fin=false;
			for(int i=1;i<=M;i++)
			{
				i=te;
				te=0;
				for(int j=0;j<M;j++)
				{
					if(s[j]<=i&&i<=t[j])
					{
						if(te<t[j])
							te=t[j];
						fin=true;
					}
				}
				ans++;
				if(!fin)
					break;
				if(te==N)
					break;
				fin=false;
			}
			System.out.println(fin ? ans:"Impossible");
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}