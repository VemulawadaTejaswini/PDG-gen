import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int a=0,b=0,c=0;
			int gcd=0;
			ArrayList<Integer>AL=new ArrayList<Integer>();
			ArrayList<Integer>ans=new ArrayList<Integer>();
			if(n==2)
			{
				a=in.nextInt();
				b=in.nextInt();
				AL.add(a);
				AL.add(b);
				gcd=gcd(a,b);
			}
			else
			{
				a=in.nextInt();
				b=in.nextInt();
				c=in.nextInt();
				AL.add(a);
				AL.add(b);
				AL.add(c);
				gcd=gcd(a,gcd(b,c));
			}
			for(int i=1;i<=gcd;i++)
			{
				boolean judge=true;
				for(int j=0;j<AL.size();j++)
				{
					if(AL.get(j)%i!=0)
						judge=false;
				}
				if(judge)
					ans.add(i);
			}
			for(int i=0;i<ans.size();i++)
				System.out.println(ans.get(i));
		}
	}
	static int gcd(int a,int b)
	{
		return b==0 ? a : gcd(b,a%b);
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}