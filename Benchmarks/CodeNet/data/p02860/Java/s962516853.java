import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next(); 
		
		// 計算
		String result = "No";
		if(n%2 == 0 && s.substring(0, n/2).equals(s.substring(n/2, n))) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}
