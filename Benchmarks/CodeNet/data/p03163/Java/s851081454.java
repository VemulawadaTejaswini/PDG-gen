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
			Hashtable<Long,Integer>hash=new Hashtable<>();
			hash.put((long)0,0);
			for(int i=0;i<n;i++)
			{
					String hh[]=inp.readLine().split(" ");
					long w1=Long.parseLong(hh[0]);
					int v1=Integer.parseInt(hh[1]);
					Set<Long>keys=hash.keySet();
					Hashtable<Long,Integer>hash1=new Hashtable<>();

					for(Long key:keys){
						long t=key+w1;
						hash1.put(key,Math.max(hash1.getOrDefault(key,0),hash.get(key)));
						if(t<=w)
						{
							if(hash.containsKey(t))
							{
								hash1.put(t,Math.max(hash.get(t),hash.get(key)+v1));
							}
							else
							{
								hash1.put(t,hash.get(key)+v1);	
							}
						}
						
						
						


					}

					hash=hash1;
				
			}
			Set<Long>keys=hash.keySet();
			int max=0;
			for(Long key:keys)
			{
				max=Math.max(hash.get(key),max);
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