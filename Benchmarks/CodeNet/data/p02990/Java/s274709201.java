import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		long MOD = 1000000007;
		
		// 計算
		long result = 0;
		
		// 出力
		for(int i = 1; i <= k; i++){
		    if(n-k+1 < i){
		        result = 0;
		    }else{
		        result = (combination(n-k+1, i, MOD)*combination(k-1, i-1, MOD))%MOD;
		    }
		    System.out.println(result);
		}
		//System.out.println(result);
	}
	
	public static long pow(long a,long n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a);
	        }
	        a=(a*a);
	        n>>=1;
	    }
	    return res;
	}
	
	public static long pow(long a,long n, long MOD) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a)%MOD;
	        }
	        a=(a*a)%MOD;
	        n>>=1;
	    }
	    return res%MOD;
	}
	
	public static long[] fact(int n) {
	    long[] f = new long[n+1];
	    for(int i = 0; i < n+1; i++){
	        if(i == 0) f[i] = 1;
	        if(i > 0) f[i] = f[i-1]*i;
	    }
	    return f;
	}
	
	public static long[] fact(int n, long MOD) {
	    long[] f = new long[n+1];
	    for(int i = 0; i < n+1; i++){
	        if(i == 0) f[i] = 1;
	        if(i > 0) f[i] = (f[i-1]*i)%MOD;
	    }
	    return f;
	}
	
	public static long combination(int n, int k) {
	    long[] f = fact(n);
	    return f[n]/(f[k]*f[n - k]);
	}
	
	public static long combination(int n, int k, long MOD) {
	    long[] f = fact(n, MOD);
	    long a = f[n];
	    long b = pow(f[k], MOD - 2, MOD);
	    long c = pow(f[n - k], MOD - 2, MOD);
	    return (((a*b)%MOD)*c)%MOD;
	}
}