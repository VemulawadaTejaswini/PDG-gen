import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //Write choose function for each k (0 <= k <= N-1)
		//Figure out why this even works to begin with (why no overcounting occurs)
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long M = input.nextLong();
		long K = input.nextLong();
		long[][] fact = new long[(int) (N+1)][2]; //[Factorial][Inverse]
		fact[1][0]=1;
		fact[1][1]=1;
		long mod = 998244353;
		long baseCase = M;
		baseCase*=FastExp(M-1,N-1,mod);
		baseCase%=mod; //K=0 case
		long ans = baseCase;
		for (long i = 2; i <= N; i++) { //Pre-computing factorial and inverses
			fact[(int) i][0] = fact[(int) (i-1)][0]*i;
			fact[(int) i][0]%=mod;
			long inverse = FastExp(fact[(int) i][0],mod-2,mod);
			fact[(int) i][1] = inverse;
		}
		for (long i = 1; i <= K; i++) {
			if (K==N-1) {
				ans = FastExp(M,N,mod); //Avoiding finding factorial of 0 (dubious case that is hard to code using choose function)
				break;
			}else {
				long curans = M; //M ways of making pairs same color
				long pairs = fact[(int) (N-1)][0];
				pairs*=fact[(int) i][1];
				pairs%=mod;
				pairs*=fact[(int)(N-i-1)][1]; //Choosing K pairs from N-1 adjacent pair slots
				pairs%=mod;
				curans*=pairs;
				curans%=mod; //Each pair has M possibilities
				//K pairs = K+1 slots used, therefore N-(K+1) = N-K-1 slots remain (1<=i<=K)
				long leftover = FastExp(M-1,N-i-1,mod);
				curans*=leftover;
				curans%=mod;
				ans+=curans;
				ans%=mod;
			}
		}
		System.out.println(ans);
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans = 1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			base*=base;
			base%=mod;
			ans%=mod;
			exp/=2;
		}
		return ans;
	}
}