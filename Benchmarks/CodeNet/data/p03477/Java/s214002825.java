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
		int d = sc.nextInt();
		
		// 計算
		String result = "Balanced";
		if(a+b > c+d) result = "Left";
		if(a+b < c+d) result = "Right";
		
		
		// 出力
		System.out.println(result);
	}
	
}