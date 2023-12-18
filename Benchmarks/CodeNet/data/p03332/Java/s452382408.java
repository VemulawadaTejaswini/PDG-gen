/*package whatever //do not write package name here */

import java.util.*;

public class Main {
    private static int fact[] = new int[123456];
    private static void pre(){
        fact[0] = 1;
        for(int i=1;i<=123455;i++){
            fact[i] = fact[i-1]*i;
            fact[i]%=998244353;
        }
    }
    private static long c(long g, long gg){
        
        return fact[(int)g]/(fact[(int)gg] * fact[(int)(g-gg)]);
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    int a=sc.nextInt(), b= sc.nextInt();
	    pre();
	    long k = sc.nextLong();
	    long ans = 0l;
	     int mod = 998244353;
	     if(k==0){
	         System.out.println(1); return;
	     }
	    for(int i=1;i<=n;i++){
	        long aa = k-a*i;
	        if(aa<b){
	            continue;
	        }
	        if(aa%b==0){
	            ans+=(c(n,i) * c(n, aa/b))%mod;
	        }
	    }
	    System.out.println(ans);
	}
}