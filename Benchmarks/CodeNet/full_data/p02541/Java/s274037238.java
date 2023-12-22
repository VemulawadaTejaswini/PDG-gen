import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	// a^{-1} modulo M
	long inv(long a,long M) {
		return a==1?a:(M+(-M*inv(M%a,a)+1)/a);
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		if (N==1) {
			System.out.println(1);
			return;
		}
		N*=2;
		ArrayList<Long> a=new ArrayList<>();
		{
			long N_=N;
			for (long p=2;p*p<=N_;++p) {
				long pe=1;
				while (N_%p==0) {
					pe*=p;
					N_/=p;
				}
				if (pe!=1) a.add(pe);
			}
			if (N_!=1) a.add(N_);
		}
		int n=a.size();
		
		long ans=Long.MAX_VALUE;
		for (int s=1;s<(1<<n)-1;++s) {
			long P=1;
			for (int shift=0;shift<n;++shift) {
				if ((s>>shift)%2==1) P*=a.get(shift);
			}
			long Q=N/P;
			long u=inv(P,Q);
			long v=(u*P-1)/Q;
			ans=Math.min(ans, v*Q);
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
