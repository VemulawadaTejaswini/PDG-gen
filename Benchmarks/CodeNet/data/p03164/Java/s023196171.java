import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			String h[]=inp.readLine().split(" ");
			int n=Integer.parseInt(h[0]);
			int w=Integer.parseInt(h[1]);
			long dp[]=new long[w+1];
			HashSet<Long>hash=new HashSet<>();
			// hash.put((long)0,(long)0);
			hash.add((long)0);
			for(int i=0;i<n;i++)
			{
					
				String hh[]=inp.readLine().split(" ");
				long w1=Long.parseLong(hh[0]);
				long v1=Long.parseLong(hh[1]);
				long dp1[]=new long[w+1];
				HashSet<Long>hash1=new HashSet<>();
				Iterator value = hash.iterator(); 
  
		        while (value.hasNext()) { 
		          	long f=(Long)value.next();
		          	hash1.add(f);
		          	dp1[(int)f]=Math.max(dp1[(int)f],dp[(int)f]);
		          	if(f+w1<=w)
		          	{
		          		hash1.add(f+w1);
		          		dp1[(int)(f+w1)]=Math.max(dp1[(int)(f+w1)],dp[(int)f]+v1);
		          	}
		        }
		        hash=hash1;
		        dp=dp1; 		
					


					
				
			}
			long max=0;
			for(int i=0;i<=w;i++)
			{
				max=Math.max(dp[i],max);
			}
			System.out.println(max);
					
		
	}
	
}
class Pair
{
	int a;
	long b;
	
	Pair(int e, long f)
	{
		a=e;
		b=f;
		
	}
}