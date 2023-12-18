import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int a = sc.nextInt();
		
		// 計算
		int result = (h + a - 1)/a;
		
		// 出力
		System.out.println(result);
	}
}
