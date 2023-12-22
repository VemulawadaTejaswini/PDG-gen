	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
//		 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
		 static long[] kaijo;
		 static long[] kaiinv;
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int K = sc.nextInt();
	        
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

	        
	        
	        long[] c = new long[N];
	        for(int i=0;i<N;i++) {
	        	c[i]=(((nCr(N-1,i)*M%mod)%mod)*((pow(M-1,N-1-i))%mod))%mod;
	        }
	        long ans=0;
	        for(int i=0;i<=K;i++) {
	        	ans=(ans+c[i])%mod;
	        }
	        
	        System.out.println(ans);
			return;		        		
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
	