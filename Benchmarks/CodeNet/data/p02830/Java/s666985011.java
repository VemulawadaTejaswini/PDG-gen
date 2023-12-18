import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		
		// 計算
		//int result = 0;
		
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.print(s.charAt(i));
		    System.out.print(t.charAt(i));
		}
		//System.out.println(result);
	}
}


