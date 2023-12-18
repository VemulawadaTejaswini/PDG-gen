import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static int n, k;
	static long[] a, lsum, rsum;
	static long MOD = 1000000007l;
	                //1000000007
	
	static long[] fact;
	static long[] afact;
	
	static long nCr(int n, int r)
	{
		return ((fact[n] * afact[n-r])%MOD * afact[r])%MOD;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		a = new long[n];
		
		fact = new long[100001];
		afact = new long[100001];
		
		fact[0] = 1;
		BigInteger bimod = new BigInteger(Long.toString(MOD));
		BigInteger bi;
		for(int i = 0; i <= 100000; i++)
		{
			if(i>0)fact[i] = (fact[i-1] * i)%MOD;
			bi = new BigInteger(Long.toString(fact[i]));
			afact[i] = bi.modInverse(bimod).longValueExact();
		}
		
//		System.out.println("Done " + afact[0]);
		
		
		long sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			sum += a[i];
		}
		
		Arrays.sort(a);
		
		//count rightsums and leftsums
		lsum = new long[n];
		rsum = new long[n];
		
		for(int i = 0; i < n; i++)
		{
			lsum[i] = a[i];
			if(i>0)lsum[i] += lsum[i-1];
			
			if(i>0)rsum[i] = rsum[i-1] - a[i-1];
			else rsum[i] = sum;
		}
		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(lsum));
//		System.out.println(Arrays.toString(rsum));
		//count difsums
		
		long an = 0;
		
		if(k>1)
			for(int d = k-1; d < n; d++)
			{
				long difsum = rsum[d] - lsum[n-d-1];
				long ncr = nCr(d-1,k-2);
//				System.out.println("d=" + d + ": difsum " + difsum + " " + ncr + ", n " + (d-1) + ", r " + (k-2));
				an = (an + (difsum*nCr(d-1,k-2))%MOD)%MOD;
			}
		an = an%MOD;
		if(an<0)an+=MOD;
		
		System.out.println(an);
	}

}
