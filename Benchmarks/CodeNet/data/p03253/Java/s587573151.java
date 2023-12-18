import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		long m = sc.nextLong();
		long MOD = 1000000007L;

		// 計算
		long result = 1;
		ArrayList<NumList> list = new ArrayList<NumList>();
	    for(int k = 2; k <= sqrt(m); k++){
	        if(m == 1) break;
	        if(m%k == 0){
	            NumList numList = new NumList(k, 0);
	            while(m%k == 0){
	                m = m/k;
	                numList.num2++;
	            }
	            list.add(numList);
	        }
	    }
	    if(m != 1) list.add(new NumList((int)m, 1));

        for(NumList nl : list){
            result *= combination((int)(nl.num2 + n - 1), nl.num2, MOD);
            result %= MOD;
        }
        
		// 出力
		System.out.println(result);
		
	}
	
	public static long pow(long a, long n, long MOD) {
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
	
	public static long[] fact(int n, long MOD) {
	    long[] f = new long[n+1];
	    for(int i = 0; i < n+1; i++){
	        if(i == 0) f[i] = 1;
	        if(i > 0) f[i] = (f[i-1]*i)%MOD;
	    }
	    return f;
	}
	
	public static long combination(int n, int k, long MOD) {
	    if(n < k) return 0;
	    long[] f = fact(n, MOD);
	    long a = f[n];
	    long b = pow(f[k], MOD - 2, MOD);
	    long c = pow(f[n - k], MOD - 2, MOD);
	    return (((a*b)%MOD)*c)%MOD;
	}
}

class NumList {
    int num1;
    int num2;
    
    NumList(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}

