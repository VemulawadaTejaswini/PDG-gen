import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "";
		result = s.charAt(0) + String.valueOf(s.length() -2) + s.charAt(s.length() -1);
		
		// 出力
		System.out.println(result);
	}
}

