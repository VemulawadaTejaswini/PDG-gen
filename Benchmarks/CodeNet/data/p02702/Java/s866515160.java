import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
//	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int mod =  2019;
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long mod=2019;
        long[] modinv = new long[200005];
        long t=1;
        for(int i=0;i<200005;i++) {
        	modinv[i]=modinv(t);
        	t=(t*10)%mod;
        }
        
        
        
        
        String S = sc.next();
        char[] c = S.toCharArray();
        long[] m = new long[c.length];
        long[] sum = new long[c.length];
        long tmp=1;
        for(int i=0;i<c.length;i++) {
        	m[i]=(tmp*(int)(c[c.length-1-i]-'0'))%mod;
        	if(i==0) {
        		sum[i]=m[i];
        	} else {
        		sum[i]=(sum[i-1]+m[i])%mod;
        	}
        	tmp=(tmp*10)%mod;
        }
        long ans=0;
        for(int i=0;i<c.length-1;i++) {
        	for(int j=i+1;j<c.length;j++) {
        		if(i==0) {
        			if(sum[j]==0)ans++;
        		} else {
            		if(((sum[j]-sum[i-1]+2019)*modinv[i])%mod==0) {
            			//System.out.println(i + "and" + j);
            			ans++;
            		}        			
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
		return pow(n, mod-2)%mod;
	}
}