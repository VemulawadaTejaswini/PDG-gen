import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		long result = 0;
		int s = n/k;
		int t = 0;
		if(k%2 == 0) t = (n+(k/2))/k;
		result += s*s*s + t*t*t;
		
		// 出力
		System.out.println(result);
	}
}
