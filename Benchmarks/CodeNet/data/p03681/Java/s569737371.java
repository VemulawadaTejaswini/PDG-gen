import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		// 計算
		long result = 0;
		int MOD = 1000000007;
		if(abs(n-m) <= 1){
		    long[] f = fact(max(n,m), MOD);
		    if(n == m){
		        result = f[n]*f[m]%MOD*2%MOD;
		    }else{
		        result = f[max(n, m)]*f[min(n, m)]%MOD;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static long[] fact(int n, long MOD) {
		long[] f = new long[n+1];
		for(int i = 0; i < n+1; i++){
			if(i == 0) f[i] = 1;
			if(i > 0) f[i] = (f[i-1]*i)%MOD;
		}
		return f;
	}
}
