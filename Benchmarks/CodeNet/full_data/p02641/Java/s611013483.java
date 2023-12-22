import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String []s=br.readLine().split(" ");
		
		int X=Integer.parseInt(s[0]);
		int N=Integer.parseInt(s[1]);
		
		int ans=0, mindiff=Integer.MAX_VALUE, diff=0;
		
		//int c=0;
		if(N==0)
			ans=X;
			
		else
		{
		
			HashSet<Integer> h= new HashSet<Integer>();
			int max=Integer.MIN_VALUE;
			s=br.readLine().split(" ");
			for(int i=0;i<5;i++)
			{
				int a=Integer.parseInt(s[i]);
				h.add(a);
				if(a>max)
					max=a;
			
			}
			if(X>max)
				ans=X;
						
			else
			{
				for(int i=X-1;i<=max;i++)
				{
					if(!h.contains(i))
					{
						diff= abs(X-i);
							if(diff<mindiff)
							{
								mindiff=diff;
								ans=i;
							}
					}
				}
			}	
		}
		out.println(ans);
		
	}
	
	
}


