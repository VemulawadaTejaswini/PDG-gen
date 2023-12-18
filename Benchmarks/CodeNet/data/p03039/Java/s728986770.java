import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		long mod=1_000_000_007L;
		long ans=0L;
		for (int i=0;i<M;i++) {
			ans+=(i*(M-i)%mod*(N*N))%mod;
			ans=ans%mod;
		}
		for (int i=0;i<N;i++) {
			ans+=(i*(N-i)%mod*(M*M))%mod;
			ans=ans%mod;
		}
		long cnt=calcNumOfCombination(N*M-2,K-2);
		System.out.println((ans*cnt)%mod);
	}

    static long calcNumOfCombination(int n, int r){
    	long mod=1_000_000_007L;
    	return ((factorial(n)*modinv(factorial(n-r),mod))%mod*modinv(factorial(r),mod))%mod;
    }

    static long factorial(int n) {
    	long num=1L;
    	long mod=1_000_000_007L;
    	for (int i=n;i>0;i--) {
    		num=num*i;
    		num%=mod;
    	}
    	return num;
    }

    static long pow(long a,long n) {
    	long mod=1_000_000_007L;
    	long res=1;
    	while (n>0) {
    		if ((n-n/2*2)==1) {
    			res=res*a%mod;
    		}
    		a=a*a%mod;
    		n>>=1;
    	}
    	return res%mod;
    }

    static long modinv(long a,long mod) {
        return pow(a,mod-2);
    }
}