import java.math.*;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	final long M=(long)1e9+7;
	boolean[] isPrime=new boolean[(int)1e6+1];
	int[] cnt=new int[(int)1e6+1];
	{
		int p=0;
		Arrays.fill(isPrime, true);
		isPrime[0]=isPrime[1]=false;
		for(int i=2;i<isPrime.length;++i) {
			if(!isPrime[i])continue;
			++p;
			for(int j=2*i;j<isPrime.length;j+=i) {
				isPrime[j]=false;
			}
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		long[]B=new long[N];
		for(int i=0;i<N;++i) {
			A[i]=sc.nextLong();
		}
		Arrays.sort(A);
		B=Arrays.copyOf(A, A.length);
		for(int i=0;i<A.length;++i) {
			for(int div=2;div*div<=A[i];++div) {
				int sz=0;
				while(A[i]%div==0) {
					A[i]/=div;
					++sz;
				}
				cnt[div]=Math.max(cnt[div], sz);
			}
			if(A[i]>1)cnt[(int)A[i]]=Math.max(cnt[(int)A[i]], 1);;
		}
		long lcm=1;
		for(int i=2;i<cnt.length;++i) {
			if(cnt[i]>0)
			lcm=lcm*pow(i,cnt[i])%M;
		}
		long ans=lcm;
		long coe=0;
		for(int i=0;i<A.length;++i) {
			coe+=inv(B[i]);
			coe%=M;
		}
		ans=ans*coe%M;
		System.out.println(ans);
	}
	
	long inv(long a) {
		return pow(a,M-2);
	}
	
	long pow(long a,long n) {
		long r=1;
		for(;n>0;n>>=1,a=a*a%M)if(n%2==1)r=r*a%M;
		return r;
	}
	
	long lcm(long a,long b) {
		return a/gcd(a,b)*b%M;
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
