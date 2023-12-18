
import java.util.*;


public class Main {
	
	static long f[] ;
	static void init() {
		f = new long[100005];
		f[0] = 1 ;
		for(int i = 1 ; i < f.length ; i++)
			f[i] = (f[i-1] * i) % m ;
	}
static long m = 1000 * 1000 * 1000 + 7 ;
	
	static long add(long a, long b)
	{
		return (a % m + b % m + m) % m;
	}
	
	static long mul(long a, long b)
	{
		return ((a % m) * (b % m)) % m;
	}
	static long nCr(int n, int r){
		if(r > n) return 0 ;
		long den = (f[n - r] * f[r]) % m ;
		return (f[n] * euInv(den, m)) % m ;
	}
	static long nPr(int n, int r){
		if(r > n) return 0 ;
		long den = f[r];
		return (f[n] * euInv(den, m)) % m ;
	}
	
	static long euInv(long a, long mod)
	{
		long[] A = new long[100];
		long[] B = new long[100];
		long b = mod, c = 0;
		int p = 0;
		while(b > 0)
		{
			A[p] = a;
			B[p] = b;
			c = a;
			a = b;
			b = c % b;
			p = p + 1;
		}
		long x = 1, y = 0;
		
		while(p-- > 0)
		{
			c = x;
			x = y;
			y = c - (A[p] / B[p]) * y;
		}
		return (x + mod) % mod;
	}
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		init();
		System.out.println(n-k+1);
		for(int i = 2;i<=k;i++)
		{
			System.out.println(mul(nCr(n-k+1, i), nCr(k-1,i-1)));
		}
		
		
	}
}
