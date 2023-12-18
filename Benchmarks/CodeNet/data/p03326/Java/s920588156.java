import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Cake>
	{
		long mula;
		long mulb;
		long mulc;
		
		public C(long ma, long mb, long mc)
		{
			mula = ma;
			mulb = mb;
			mulc = mc;
		}
		
		@Override
		public int compare(Cake o1, Cake o2) 
		{
			long com =  ((o2.a*mula + o2.b*mulb + o2.c*mulc)-(o1.a*mula + o1.b*mulb + o1.c*mulc));
			if(com > 0)return 1;
			if(com < 0)return -1;
			return 0;
		}
	}
	
	static class Cake
	{
		long a;
		long b;
		long c;
		
		public Cake(long a0, long b0, long c0)
		{
			a = a0;
			b = b0;
			c = c0;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Cake[] cake = new Cake[n];
		
		for(int i = 0; i < n; i++)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			
			cake[i] =new Cake(a,b,c);
		}
		
		C c;
		long max = -999999999999999999l;
		
		
		for(long ka = -1; ka <= 1; ka+=2)
			for(long kb = -1; kb <= 1; kb+=2)
				for(long kc = -1; kc <= 1; kc+=2)
				{
					long cur = 0;
					c = new C(ka,kb,kc);
					Arrays.sort(cake,c);
					for(int i = 0; i < m; i++)
						cur += cake[i].a*ka + cake[i].b*kb + cake[i].c*kc;
					max = Math.max(cur, max);
				}
			
		
		System.out.println(max);
		

	}

}
