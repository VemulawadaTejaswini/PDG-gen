import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	static long[] fac;
	static long[] finv ;
	static long[] inv ;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		int INF = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		//char[] c = sc.next().toCharArray();
		//int N = A.length;
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		
		int MAX = 510000;
		fac = new long[MAX];
		finv = new long[MAX];
		inv = new long[MAX];
		
		
	    fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for (int i = 2; i < MAX; i++){
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[(int) (MOD%i)] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
	    }
		
		long ans=0;
		
		for(int i=1; i<K+1; i++){
			ans = COM(K-1,i-1)*COM(N-K+1,i)%MOD;

		    ans %= MOD;
			System.out.println(ans);
		}
	    
		
	}
	static long COM(int n, int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
	
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}

