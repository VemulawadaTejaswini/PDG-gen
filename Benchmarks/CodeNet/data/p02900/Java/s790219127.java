import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = gcd(a,b);
		//System.out.println("n:" + n);
		
		// 計算
		long result = 1;
		for(int m = 2; m <= n; m++){
		    if(n%m == 0){
		        result++;
		        while(n%m == 0){
		            n = n/m;
		        }
		    }
		}
		// 出力
		System.out.println(result);
        
	}
	
	static long gcd(long x, long y){
	    if(x < y){
	        long temp = x;
	        x = y;
	        y = temp;
	    }
	    if(y == 0) return x;
	    if(x%y == 0) return y;
	    return gcd(y , x%y);
	}
}