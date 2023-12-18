import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	void run()
	{
		int n = nint();
		int[] ps = new int[n+1];
		int dup1 = -1;
		int dup2 = -1;
		BitSet bs = new BitSet(n);
		for(int i = 0; i < n; i++)
		{
			int a = nint();
			if(bs.get(a))
			{
				dup1 = ps[a];
				dup2 = i;
			}
			ps[a] = i;
			bs.set(a);
		}
		System.err.println(dup1 + ", " + dup2);
		for(int i = 1; i <= n + 1; i++)
		{
			System.out.println(get(n, i, dup1, dup2));
		}
		
		
	}
	
	final long MOD = 1000000007;
	
	long get(int n, int k, int d1, int d2)
	{
		long res = 0;
		int aida = d2 - d1 - 1;
		//		System.err.println("aida:" + aida);
		// 0ko tukau
		long use0 = combMod(n-1, k);
		//		System.err.printf("(%d,%d) 0ko: %d%n", n, k, use0);
		res = (res + use0) % MOD;
		// 1ko tukau
		if(k==1)
		{
			res = (res + 1) % MOD;
			//			System.err.printf("(%d,%d) 1ko/wo(f): %d%n", n, k, 1);
		}
		if(n != 1 && k>1)
		{
			// aida wo tukawanai
			if(n-1-aida > 0  && n-1-aida >= k-1)
			{
				long use1n = combMod(n - aida - 1, k-1);
				//				System.err.printf("(%d,%d) 1ko/wo: %d%n", n, k, use1n);
				res = (res + use1n) % MOD;
			}
			// aida wo tukau
			for(int i=1; i<=aida; i++)
			{
				long aidaComb = combMod(aida, i);
				long othersComb = combMod(n - aida - 1, k - i - 1);
				long use1w = aidaComb * othersComb * 2;
				//				System.err.printf("(%d,%d) 1ko/w: %d%n", n, k, use1w);
				res = (res + use1w) % MOD;
			}
		}
		// 2ko tukau
		if(k==2)
		{
			res = (res + 1) % MOD;
			//			System.err.printf("(%d,%d) 2ko(f): %d%n", n, k, 1);
		}
		if(k>2)
		{
			long use2 = combMod(n-1, k-2);
			//			System.err.printf("(%d,%d) 2ko: %d%n", n, k, use2);
			res = (res + use2) % MOD;
		}

		return res;
	}
	
	long combMod(int n, int k)
	{
		if(k > n || k < 0) return 0;
		BigInteger bi = BigInteger.valueOf(1);
		for(int i = 0; i < k; i++)
		{
			bi = bi.multiply(BigInteger.valueOf(n - i)).divide(
					BigInteger.valueOf(i + 1));
		}
		return bi.remainder(BigInteger.valueOf(MOD)).longValue();
	}
	
	long factMod(int n)
	{
		long r = 1;
		for(int i = 2; i <= n; i++)
		{
			r = (r * i) % MOD;
		}
		return r;
	}
	
	int nint()
	{
		return Integer.parseInt(sc.next());
	}
}
