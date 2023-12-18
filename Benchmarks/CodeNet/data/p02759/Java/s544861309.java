import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = n/2;
		if(n%2 == 1) result++;
		
		
		// 出力
		System.out.println(result);
	}
}
