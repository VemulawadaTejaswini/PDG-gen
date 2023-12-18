import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "Yes";
		if(s.equals("AAA") || s.equals("BBB")) result = "No";
		
		// 出力
		System.out.println(result);
	}
}
