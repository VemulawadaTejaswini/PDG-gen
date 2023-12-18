import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long h = sc.nextLong();

		// 計算
		long result = 0;
		long cnt = 1;
		while(h > 1){
		    result += cnt;
		    cnt *= 2;
		    h /= 2;
		}
		result += cnt;
		
		// 出力
		System.out.println(result);
	}
}
