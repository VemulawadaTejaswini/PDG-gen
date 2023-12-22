import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextLong();
		solve(a, n);
	}

	static long res = 0, mod = 1_000_000_007;
	private static void solve(long[] a, int n) {
		// TODO Auto-generated method stub
		Map<String, Long> memo = new HashMap<String, Long>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String k = a[i] + "_" + a[j];
				if (memo.containsKey(k)) res = (res + memo.get(k)) % mod;
				else {
					long t = multiply(a[i], a[j]);
					memo.put(k, t);
					res = (res + t) % mod;
				}
			}
		}
		System.out.println(res);
	}
	
	    public static long multiply(long x, long y)
	    {
	        int size1 = getSize(x);
	        int size2 = getSize(y);
	        /** Maximum of lengths of number **/
	        int N = Math.max(size1, size2);
	        /** for small values directly multiply **/        
	        if (N < 10)
	            return x * y;
	        /** max length divided, rounded up **/    
	        N = (N / 2) + (N % 2);    
	        /** multiplier **/
	        long m = (long)Math.pow(10, N);
	 
	        /** compute sub expressions **/        
	        long b = x / m;
	        long a = x - (b * m);
	        long d = y / m;
	        long c = y - (d * N);
	        /** compute sub expressions **/
	        long z0 = multiply(a, c);
	        long z1 = multiply(a + b, c + d);
	        long z2 = multiply(b, d);          
	 
	        return z0 + ((z1 - z0 - z2) * m) + (z2 * (long)(Math.pow(10, 2 * N)));        
	    }
	    
	    public static int getSize(long num)
	    {
	        int ctr = 0;
	        while (num != 0)
	        {
	            ctr++;
	            num /= 10;
	        }
	        return ctr;
	    }

}
