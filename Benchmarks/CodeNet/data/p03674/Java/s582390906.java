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
		int[] ps = new int[n + 1];
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
		for(int i = 1; i <= n + 1; i++)
		{
			System.out.println(get(n, i, dup2 - dup1 - 1));
		}


	}

	final long MOD = 1000000007;

	long get(int n, int k, int aida)
	{
		long res = combMod(n + 1, k);
		if(n+1!=k)
		{
			res -= combMod(n - aida - 1, k - 1);
			res %= MOD;
			if(res < 0) res += MOD;
		}
		return res;
	}

	long combMod(int n, int k)
	{
		if(k > n || k < 0) return 0;
		if(k == n || k == 0) return 1;
		BigInteger bi = BigInteger.valueOf(1);
		for(int i = 0; i < k; i++)
		{
			bi = bi.multiply(BigInteger.valueOf(n - i)).divide(
					BigInteger.valueOf(i + 1));
		}
		return bi.remainder(BigInteger.valueOf(MOD)).longValue();
	}

	int nint()
	{
		return Integer.parseInt(sc.next());
	}
}
