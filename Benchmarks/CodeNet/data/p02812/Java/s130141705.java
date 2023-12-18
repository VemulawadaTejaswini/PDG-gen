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
		int result = 0;
		for(int i = 0; i < s.length()-2; i++){
		    if("ABC".equals(s.substring(i, i+3))){
		        result++;
		        i += 2;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
	
}


