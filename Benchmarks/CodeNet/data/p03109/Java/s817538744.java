import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "Heisei";
		if(s.compareTo("2019/04/30") > 0) result = "TBD";

		// 出力
		System.out.println(result);
        
	}
}
