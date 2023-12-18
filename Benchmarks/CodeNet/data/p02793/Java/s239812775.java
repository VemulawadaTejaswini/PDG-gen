import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int MAX = 1000000;
		int[] sieve = new int[MAX+1];
		
		sieve[0] = 1;
		sieve[1] = 1; //0: divide by self. 1: dont divide, its not prime.
		for(long i = 2; i <= MAX; i++)
		{
			if(sieve[(int)i] == 0)
			{
				for(long j = i*i; j <= MAX; j+=i)
				{
					sieve[(int)j] = (int)i;
				}
			}
		}
		
//		for(int i = 0; i < 100; i++)
//			System.out.println(sieve[i]);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		
		long div[] = new long[1000001];
		
		for(int i = 0; i<n;i++)
		{
			a[i]= sc.nextLong();
			b[i] = a[i];
			
			
			while(sieve[(int)a[i]] != 1)
			{
				long diver = sieve[(int)a[i]];
				if(diver == 0)diver=a[i];
				int curder = 0;
				while(a[i]%diver == 0)
				{
					a[i] /= diver;
					curder++;
				}
				div[(int)diver] = Math.max(div[(int)diver], curder);
			}
		}
		
		long MOD = 1000000007;
		
		long master = 1;
		for(int i = 0; i < 1000000;i++)
		{
			if(div[i]>0)
			{
				for(int k = 0; k < div[i]; k++)
				{
					master = (master * i)%MOD;
				}
//				System.out.println(i + " " + div[i]);
			}
		}
		
		BigInteger bimod = new BigInteger("1000000007");
		BigInteger bin;
		BigInteger lcm = new BigInteger(Long.toString(master));
		
//		System.out.println("LCM " + lcm.toString());
		long an = 0;
		for(int i = 0; i < n; i++)
		{
			bin = new BigInteger(Long.toString(b[i]));
//			System.out.println("abinv "+  bin);
			bin = bin.modInverse(bimod);
			
//			System.out.println("binv "+  bin);
			bin = bin.multiply(lcm);
//			System.out.println("bin "+  bin);
			bin = bin.mod(bimod);
			an += bin.longValueExact();
		}
		System.out.println(an%MOD);
		
		
		

	}

}
