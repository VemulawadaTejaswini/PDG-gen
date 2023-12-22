import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
	public static long fact[];
	public static long inverse[];
	public static long pow(long a,long n) {
	    long res=1;
	    while (n>0) {
	        if (n%2==1){
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
 
	public static long comb(int n,int k){
    	if(n<0 || k<0 || n<k)return 0;
    	return (fact[n]*((inverse[k]*inverse[n-k])%mod))%mod;
	}
	public static long mod = (long)1e9+7;
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
				int k = Integer.parseInt(reader.readLine());
				String str = reader.readLine();
				int n = str.length();
				inverse = new long[n+k+1];
				fact =new long[n+k+1];
				fact[0]=1;
				inverse[0]=1;
				for(int i=1;i<=n+k;++i){
					fact[i] = (fact[i-1]*(long)i)%mod;
					inverse[i] = modinv(fact[i]);
				}
				//sum of (N-1-(K-k)
				long res = 0;
				long p = 1;
				for(int i = 0;i<=k;i++){
					res = (res + comb(n+k,i)*p)%mod;
					p = (p*25)%mod;
				}
				System.out.println(res); 				
		}
		
}