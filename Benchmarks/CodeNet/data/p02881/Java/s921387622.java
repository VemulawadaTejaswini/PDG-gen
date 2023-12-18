import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		
		// 計算
		long result = Long.MAX_VALUE;
		for(long i = 1; i <= sqrt(n); i++){
		    if(n%i == 0){
		        long a = n/i;
		        long b = i;
		        result = min(result, a + b - 2);
		    }
		    
		}
		
		// 出力
		System.out.println(result);
		
	}
}