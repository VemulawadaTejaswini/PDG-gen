import java.util.*;

public class Main {
	static int mod = 1_000_000_007;
	static long fact[];
	static long inverse[];

	static long pow(long a,int n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=res*a%mod;
	        }
	        a=a*a%mod;
	        n>>=1;
	    }
	    return res;
	}

	static long modinv(long n) {
	    return pow(n, mod-2);
	}

	static long comb(int n,int k){
	    if(n<0 || k<0 || n<k)return 0;
	    return fact[n]*(inverse[k]*inverse[n-k]%mod) %mod;
	}


	public static void main(String[] args) {
		fact=new long[200000];
		fact[0]=1;
		inverse=new long[200000];
		inverse[0]=1;
		for(int i=1;i<200000;i++){
		    fact[i]=(fact[i-1]*(long)i)%mod;
		    inverse[i]=modinv(fact[i]);
		}
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		// if (K-2==0) N++;
		Arrays.sort(A);

		int index = Math.max(N-2, K);
		long[] nCk_sum = new long[N-1+1];
		// long[] nCk_sum = new long[index+1];
		for (int i=0;i<N-1;i++) {
			nCk_sum[i+1] = (nCk_sum[i]+comb(i, K-2))%mod;
		}
		// long[] val = new long[N-2+1];
		// for (int i=0;i<N-2;i++) {
		// 	val[i+1] = (val[i]+nCk_sum[i+1]);
		// }
		// System.out.println(Arrays.toString(nCk_sum));
		// System.out.println(Arrays.toString(val));

		long plus = 0L;
		long minus = 0L;
		for (int i=0;i<N-1;i++) {
			minus = (minus+A[i]*nCk_sum[N-1-i]%mod)%mod;
			plus = (plus+A[N-1-i]*nCk_sum[N-1-i]%mod)%mod;
		}
		// System.out.println(plus);
		System.out.println((plus-minus+mod)%mod);
	}
}
