import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int result = 0;
		int n = b - a;
		result = n * (n + 1) / 2 - b;
		
		// 出力
		System.out.println(result);
	}
}
