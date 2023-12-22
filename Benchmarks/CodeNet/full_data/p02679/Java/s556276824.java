import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main 
{
	static HashMap<String, Integer> g1 = new HashMap<>();
	static HashMap<String, Integer> g2 = new HashMap<>();
	static HashSet<String> set = new HashSet<>();
	
	static String tost(long a, long b)
	{
		if(a<0)a*=-1;
		if(b<0)b*=-1;
		long gd = gcd(a,b);
		a/=gd;
		b/=gd;
		return a + " " + b;
	}
	
    public static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b%a, a); 
    } 	
	static long MOD = 1000000007l;

	public static void main(String[] args) 
	{
		long[] pow2 = new long[300000];
		pow2[0] = 1;
		
		for(int i = 1; i < 300000;i++)
		{
			pow2[i] = (pow2[i-1] * 2)%MOD;
			while(pow2[i]<0)pow2[i]+=MOD;
		}
//		System.out.println(pow2[4]);
		
		Scanner sc = new Scanner(System.in);

		
		int zerl = 0;
		int zerr = 0;
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			if(a == 0 && b == 0)
				continue;
			
			if(a == 0)
			{
				zerl++;
				continue;
			}
			else if(b==0)
			{
				zerr++;
				continue;
			}
			
			
			if(b < 0)
			{ //b no minus
				a*=-1;
				b*=-1;
			}
			
			if(a < 0)
			{ //group 1
				String s = tost(a,b);
				if(g1.containsKey(s))g1.put(s, g1.get(s)+1);
				else g1.put(s, 1);
				set.add(s);
			}
			else
			{ //group 2
				//inverse
				String s = tost(b,a);
				if(g2.containsKey(s))g2.put(s, g2.get(s)+1);
				else g2.put(s, 1);
				set.add(s);
			}
			
		}
		
		long an = 1;
		
		for(String s : set)
		{
			long cur = 1;
			
			int a = 0;
			if(g1.containsKey(s))a = g1.get(s);
			int b = 0;
			if(g2.containsKey(s))b = g2.get(s);
			
			long pa = pow2[a]-1;
			long pb = pow2[b]-1;
			
			cur = (pa + pb + 1)%MOD;
			
			an = (an * cur)%MOD;
//			System.out.println("Cur: ratio " + s + ": amount " + a + " " + b);
//			System.out.println("Curscore " + cur);
		}
		
		//zerl zerr
		{
			long cur = 1;
			
			long pa = pow2[zerl]-1;
			long pb = pow2[zerr]-1;
			
			cur = (pa + pb + 1)%MOD;
			
			an = (an * cur)%MOD;
		}
		
		an = an - 1;
		while(an<0)an+=MOD;
		System.out.println(an);
		
		//zeroes
	}

}
