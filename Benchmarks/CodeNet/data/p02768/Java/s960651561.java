import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       int A = sc.nextInt();
       int B = sc.nextInt();
       
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       
       long bunsi1=1;
       long bunbo1=1;
       for(int i=0;i<A;i++) {
    	   bunsi1=bunsi1*(n-i)%mod;
    	   bunbo1=bunbo1*modinv(i+1)%mod;
       }
       long bunsi2=1;
       long bunbo2=1;
       for(int i=0;i<B;i++) {
    	   bunsi2=(bunsi2*(n-i))%mod;
    	   bunbo2=bunbo2*modinv(i+1)%mod;
       }
    	   
       long sub1=(bunsi1*bunbo1)%mod;
       long sub2=(bunsi2*bunbo2)%mod;
       long ans=((pow(2,n)-1-sub1-sub2)+mod)%mod;
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