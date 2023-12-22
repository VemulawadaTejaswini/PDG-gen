	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int S = sc.nextInt();
	        int N = S/3;
	        long ans=0;
	        for(int i=1;i<=N;i++) {
	        	ans=(ans+factorial(i-1+S-3*i)*modinv(factorial(i-1))%mod* modinv(factorial(S-3*i)%mod) )%mod;
	        }
	        
	        
	        System.out.println(ans);
		 }
		 
		 
			public static long factorial(long n) {
				long tmp = 1;
				for (long i=n;i>0;i--) {
					tmp = (tmp*i)%mod;
				}
				return tmp;
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
		 
			public static long nCr(long n, long r) {
				if(n<r) {
					return 0;
				} else {
					return factorial(n) * modinv(factorial(n-r)) % mod * modinv(factorial(r)) % mod;
				}
			}		 
	}