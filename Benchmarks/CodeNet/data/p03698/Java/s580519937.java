import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "no";
		HashSet<Character> hs = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++){
		    hs.add(s.charAt(i));
		}
		if(hs.size() == s.length()) result = "yes";

		// 出力
		System.out.println(result);
	}
}

