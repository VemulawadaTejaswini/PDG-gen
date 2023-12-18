import java.util.*;

public class Main {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] clocks = new long[num];
	
		for (int i = 0; i<num;i++)
			clocks[i]=sc.nextLong();
		lcm solver = new lcm();
		long aw =solver.solve(clocks);
		System.out.print(aw);
		
		sc.close();
	}
	
	static class lcm{
		
		private long hold = 1;
		public long solve (long[] c)
		{
			if (c.length==1)
				return c[0];
			
			for (int j=0; j<c.length; j++)
			{
				hold=(hold*c[j])/gcd(hold,c[j]);
			}
			return hold;
		}
		
		private long gcd(long a, long b)
		{
			if(a == 0)
				return b;
			return gcd(b%a,a);
		}
	
	}
}
	
