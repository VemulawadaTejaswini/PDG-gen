import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader BR=new BufferedReader (new InputStreamReader(System.in));
		int T=Integer.parseInt(BR.readLine());
		for(int t=0;t<T;t++)
		{
			StringTokenizer st=new StringTokenizer(BR.readLine());
			Long a=Long.parseLong(st.nextToken());
			Long b=Long.parseLong(st.nextToken());
			Long c=Long.parseLong(st.nextToken());
			Long d=Long.parseLong(st.nextToken());
			
			if(a<b || d<b)
			{
				System.out.println("No");
			}
			else
			{
				a=a%b;
				d=d%b;
				if(a>c)
					System.out.println("No");
				else if(d==0)
					System.out.println("Yes");
				else
				{
					long q=(long) Math.floor(c/d);
					long p=(q+1)*d;
					//System.out.println(q+" "+p+" "+b);
					if(p>=b)
						System.out.println("Yes");
					else
						System.out.println("No");
				}
				
				
				
			}
		}
		
	}
}
