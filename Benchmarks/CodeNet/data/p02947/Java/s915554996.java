import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		long c=0;
    	int n=x.nextInt();
		String k[]=new String[n];
		for(int i=0;i<n;i++)
		{
			String r=x.next();
			char a[]=r.toCharArray();
			Arrays.sort(a);
			String b=new String(a);
			k[i]=b;
		}
		HashMap<String,Integer> m1 = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(m1.containsKey(k[i])) m1.put(k[i], m1.get(k[i])+1);
			else m1.put(k[i],1);
		}
		for (Map.Entry<String,Integer> entry : m1.entrySet())
		{
            String s1 = entry.getKey();
			long freq = entry.getValue();
			c+=(freq)*(freq-1)/2;
		}
		System.out.println(c);
	}
}