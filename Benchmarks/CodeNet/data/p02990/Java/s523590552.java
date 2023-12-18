import java.util.Scanner;

public class Main {
	static int mod = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		
		for (int i=1; i<K+1; i++){
			int n = N-K+1;
			int r = i;
			
			long blue = nCr(n,r);
			long red = nCr(K-1,i-1);
			
			System.out.println(blue*red%mod);
			
		}
		
		sc.close();
	}
	
	public static long factorial(int n) {
		long tmp = 1;
		for (int i=n; i>0; i--) {
			tmp = (tmp*i)%mod;
		}
		return tmp;
	}
	
	public static long pow(long a,int n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a)%mod;
	        }
	        a=(a*a)%mod;
	        n>>=1;
	    }
	    return res;
	}
 
	public static long modinv(long n) {
		return pow(n, mod-2);
	}
 
	public static long nCr(int n, int r) {
		return factorial(n) * modinv(factorial(n-r)) % mod * modinv(factorial(r)) % mod;
	}
}