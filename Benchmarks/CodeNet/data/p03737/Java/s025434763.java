import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		// 計算
		String result = "";
		result = a.substring(0,1).toUpperCase() + b.substring(0,1).toUpperCase() + c.substring(0,1).toUpperCase();
		
		// 出力
		System.out.println(result);
	}
}

