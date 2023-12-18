import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long[] kaijo;
	 static long[] kaiinv;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int K = sc.nextInt();
       
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       
       int N=2*100000;
       kaijo = new long[N+100];
       kaijo[0]=1;
       for(int i=1;i<=N+88;i++) {
       	kaijo[i]=(kaijo[i-1]*i)%mod;
       }
       kaiinv = new long[N+100];
       kaiinv[0]=1;
       kaiinv[1]=1;
       for(int i=2;i<N+88;i++) {
       	kaiinv[i]=modinv(kaijo[i])%mod;
       }
       
       K=Math.min(K, n);
       long sum=0;
       for(int i=0;i<=K;i++) {
    	   long a=(nCr(n,i)*nCr(n-1,i))%mod;
    	   sum=(sum+a)%mod;
       }
       
       
       System.out.println(sum);
   }

	static long nCr(int n, int r) {
		if(n<r) {
			return 0;
		} else {
			return (kaijo[n]*(kaiinv[r]*kaiinv[n-r]%mod))%mod;
		}
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
		return pow(n, mod-2)%mod;
	}


}