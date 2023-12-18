import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long h = sc.nextLong();
		long w = sc.nextLong();

		// 計算
		long result = 0;
		result = ((h+1)/2)*((w+1)/2) + (h/2)*(w/2);
		
		// 出力
		System.out.println(result);
	}
}



