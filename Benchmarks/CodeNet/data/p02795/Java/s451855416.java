import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		result = (n + max(h, w) - 1)/max(h, w);
		
		// 出力
		System.out.println(result);
	}
}


