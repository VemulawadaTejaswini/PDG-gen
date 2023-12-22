import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) throws Exception
	{

		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		
		List<Long> li=new ArrayList<Long>();
		List<Long> li1=new ArrayList<Long>();
		Map<Long,Long> mp=new HashMap<>();
		long sum=0;
		for(int i=0;i<t;i++)
		{
			 li.add(sc.nextLong());
			 sum=sum+li.get(i);
			 
		}
		
		map1(li,mp);
		long q=sc.nextLong();;
		for(int i=0;i<q;i++)
		{
			long b=sc.nextLong();
			long c=sc.nextLong();
			long x=0;
			long y=0;
			long z=0;
			if(mp.containsKey(b))
			{
			     x=mp.get(b);
			     y=b*x;
			     z=c*x;
			     sum=sum-y+z;
			     if(mp.containsKey(c))
			     {
			    	 mp.remove(b);
			    	 mp.put(c,mp.get(c)+x);
			     }
			     else
			     {
				mp.remove(b);
				mp.put(c,x);
			     }
			
			}
			li1.add(sum);
		}
		for(int i=0;i<li1.size();i++)
		{
			System.out.println(li1.get(i));
		}
		
	}
	public static void map1(List<Long> li,Map<Long,Long> mp)
	{
		for(int i=0;i<li.size();i++)
		{
			if(mp.containsKey(li.get(i)))
			{
				mp.put(li.get(i),mp.get(li.get(i))+1l);
			}
			else
			{
				mp.put(li.get(i),1l);
			}
		}

   }
}
