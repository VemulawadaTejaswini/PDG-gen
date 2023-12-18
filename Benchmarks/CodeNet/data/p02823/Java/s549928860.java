import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		// 計算
		long result = 0;
		if((b-a)%2 == 0){
		    result = (b-a)/2;
		}else{
		    result = min(a-1, n-b) + 1 + ((b-a)-1)/2;
		}
		
		// 出力
		System.out.println(result);
	}
}
