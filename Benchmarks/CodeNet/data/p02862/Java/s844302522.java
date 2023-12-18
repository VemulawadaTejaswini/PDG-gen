
import java.util.Scanner;

public class Main{
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((2*x - y) % 3 != 0 &&(2 * y - x) % 3 != 0) {
			System.out.println(0);
			return ;
		}
		
		int l =( 2 * x - y)/3;
		int k =( 2 * y - x)/3;
		
		long []fac = new long [l + k + 1];
		long []finv = new long [l + k + 1];
		long []inv = new long [l + k + 1];
		
		    fac[0] = fac[1] = 1;
		    finv[0] = finv[1] = 1;
		    inv[1] = 1;
		    for (int i = 2; i <= l+ k; i++){
		        fac[i] = fac[i - 1] * i % MOD;
		        inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
		        finv[i] = finv[i - 1] * inv[i] % MOD;
		    }
		        
		    long ans = COM(l+k , k , fac , finv);
		    
		    
		    System.out.println(ans);
	}
  
	 static long COM(int n, int k , long []fac, long []finv){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

}
