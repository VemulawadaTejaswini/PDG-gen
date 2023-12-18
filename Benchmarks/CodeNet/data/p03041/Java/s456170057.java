import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		
		// 計算
		String result = "";
		
		char[] c = s.toCharArray();
		//c[k-1] += 32;
		c[k-1] = Character.toLowerCase(c[k-1]);
		result = new String(c);
		
		// 出力
		System.out.println(result);
	}
}