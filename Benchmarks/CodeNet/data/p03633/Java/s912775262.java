import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long lcm = 1L;
		for(int i = 0; i < n; i++){
		    lcm = lcm(lcm, sc.nextLong());
		}
		
		// 計算
		long result = lcm;
		
		
		// 出力
		System.out.println(result);
	}
	
	static long gcd(long x, long y){
		if(y == 0) return x;
		return gcd(y , x%y);
	}
	static long lcm(long x, long y){
		return (x/gcd(x, y))*y;
	}
}


