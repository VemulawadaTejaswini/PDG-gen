import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static long[] fac;
	public static long[] finv;
	public static long[] inv;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		long ntotal = 1;
		long bai = 2;
		long nb = n;
		while(nb>0) {
			if((nb & 1) == 1) {
				ntotal*=bai;
				if(ntotal>=MOD) {
					ntotal%=MOD;
				}
			}
			nb>>=1;
			bai=bai*bai;
			if(bai>=MOD) {
				bai%=MOD;
			}
		}
		fac = new long[n+1];
		finv = new long[n+1];
		inv= new long[n+1];
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (i = 2; i <= n; i++) {
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
		}
		long atotal=com(n, a);
		long btotal=com(n, b);
		long ans = ntotal - atotal - btotal - 1;
		if(ans<0)ans+=MOD;
		out.println(ans);
	}
	public static long com(int n, int k) {
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
}
