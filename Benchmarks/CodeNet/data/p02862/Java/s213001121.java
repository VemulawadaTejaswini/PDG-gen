import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	 static long[] kaijo;
	 static long[] kaiinv;
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int cnt=0;
        
        while(X!=2*Y && 2*X!=Y) {
        	cnt++;
        	X=X-3;Y=Y-3;
        	if(X<0||Y<0) {
                System.out.println(0);      		
        		return;
        	}
        }
        
        int n=cnt*2+Math.min(X, Y);
        int r=cnt;
        
        
        
        kaijo = new long[n+1];;
        kaijo[0]=1;
        for(int i=1;i<n+1;i++) {
        	kaijo[i]=(kaijo[i-1]*i)%mod;
        }
        kaiinv = new long[n+1];
        kaiinv[0]=1;
        kaiinv[1]=1;
        for(int i=2;i<n+1;i++) {
        	kaiinv[i]=modinv(kaijo[i])%mod;
        }

        System.out.println(nCr(cnt*2+Math.min(X, Y),cnt));        	
                		
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
		return pow(n, mod-2);
	}

}