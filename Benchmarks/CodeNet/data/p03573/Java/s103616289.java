import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 計算
		int result = 0;
		if(a == b) result = c;
		if(b == c) result = a;
		if(c == a) result = b;
		
		// 出力
		System.out.println(result);
	}
}

