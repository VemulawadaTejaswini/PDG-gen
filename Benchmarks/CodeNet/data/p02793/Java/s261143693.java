import java.util.Scanner;
public class Main {
	public static final long mod = (long)1e9+7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0;;
		int[] a = new int[n];
		long lcm = 1, ans = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		int[] a2 = a.clone();
		int[] fact = new int[max+1];
		for (int i = 0; i < n; i++) {
			for (int j = 2; j*j <= a[i]; j++) {
				int count = 0;
				while(a[i]%j==0) {
					a[i] /= j;
					count++;
				}
				fact[j] = Math.max(fact[j], count);
			}
			if(a[i] != 1) fact[a[i]] = Math.max(fact[a[i]], 1);
		}
		for (int i = 2; i <= max; i++) {
			lcm *= pow(i, fact[i]);
			lcm %= mod;
		}
		for (int i = 0; i < n; i++) {
			ans += lcm*pow(a2[i], mod-2);
			ans %= mod;
		}
		System.out.println(ans);
	}
	public static long pow(long x, long n) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum * x % mod;
	        }
	        x = x*x%mod;
	        n >>= 1;
	    }
	    return sum;
	}
}