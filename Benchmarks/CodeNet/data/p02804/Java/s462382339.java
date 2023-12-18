import java.util.*;
	
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long[] kaijo;
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        long ans=0;
        for(int i=0;i<N;i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
//        System.out.println(sum);
        if(A[0]<0) {
        	long c=A[0];
        	for(int i=0;i<N;i++) {
        		A[i]=A[i]+c;
        	}
        }
        
        kaijo = new long[N+100];
        kaijo[0]=1;
        for(int i=1;i<=N+89;i++) {
        	kaijo[i]=kaijo[i-1]*i;
        }
//        System.out.println(nCr(10,0));
        		
        for(int i=0;i<N-1;i++) {
        	for(int j=i+1;j<N;j++) {
        		if((j-i>K-2)){
        			ans=(ans+nCr(j-i-1,K-2)*(A[j]-A[i]))%mod;
        		}
        	}
        }
        
        System.out.println(ans);
    }

	public static long pow(long a,long n) {
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
 
	static long nCr(int n, int r) {
		if(n<r) {
			return 0;
		} else {
			return kaijo[n]/kaijo[r]/kaijo[n-r]%mod;
		}
	}
	public static long factorial(long n) {
		long tmp = 1;
		for (long i=n;i>0;i--) {
			tmp = (tmp*i)%mod;
		}
		return tmp;
	}
}