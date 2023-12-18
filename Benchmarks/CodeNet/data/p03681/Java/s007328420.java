import java.util.Scanner;

public class Main{
	static long mod = 1000000007;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long M = scn.nextLong();
		if(N-M >1 || N-M < -1) {
			System.out.println(0);
		}else {
			long ans = 1;
			ans*=nyan(N);
				ans%=mod;
				ans*=nyan(M);
				ans%=mod;
			if(N==M) {
				ans*=2;
				ans%=mod;
			}
			System.out.println(ans);
		}
	}

	public static long nyan(long n) {
		long ans = 1;
		for(int i = 1; i <= n;i++) {
			ans *= i;
			ans %=mod;
		}
		return ans;
	}
}
