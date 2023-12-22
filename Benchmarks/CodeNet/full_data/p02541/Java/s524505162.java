import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	long inv(long a,long M) {
		return a==1?a:(M+(-M*inv(M%a,a)+1)/a);
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long N=2*sc.nextLong();
		if (N==2) {
			System.out.println(1);
			return;
		}
		long ans=(long)1e18;
		for (long d=2;d*d<=N;++d) if (N%d==0) {
			for (long P:new long[] {d,N/d}) {
				long Q=N/P;
				if (gcd(P,Q)!=1) continue;
				ans=Math.min(ans, (inv(P,Q)*P-1)/Q*Q);
			}
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}