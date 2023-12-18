

import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{
	static long p = 1000000007;
	static long[] fact = new long[200000];
	static long[] factinv = new long[200000];
	static BigInteger bip = new BigInteger(Long.toString(p));
	
	static long val(int h, int w)
	{
		int n = h+w;
		int r = h;
		
		//find out nCr
		long l = (((fact[n]*factinv[r])%p)*factinv[n-r])%p;
		if(l<0)l+=p;
		return l;
	}

	public static void main(String[] args) 
	{
		long ma = 0;
		fact[0] = 1;
		for(int i = 1; i < 200000; i++)
		{
			fact[i] = (fact[i-1]*i)%p;
			if(fact[i] < 0)
				fact[i]+=p;
			
			BigInteger bi = new BigInteger(Long.toString(fact[i]));
			factinv[i] = bi.modInverse(bip).longValue();
			
			ma=Math.max(ma, factinv[i]);
		}
		factinv[0] = 1;
//		System.out.println("DONE");
		
		
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		{
			int h = sc.nextInt();
			int w = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int colh = h - a;
			
			int trh = h-a;
			
			for(int i = 0; i < colh; i++)
			{
				long colv = val(w-b-1, a+i);
				long mul = val(trh-i-1,b-1);
				sum = (sum +(colv*mul)%p)%p;
			}
		}
		System.out.println(sum);

	}

}
