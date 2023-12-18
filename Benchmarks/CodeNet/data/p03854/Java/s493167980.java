import java.util.*;
import static java.lang.Math.*;

public class Main {

	// 定数
	static final String a  = "dream";
	static final String b  = "dreamer";
	static final String c  = "erase";
	static final String d  = "eraser";

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		String s = sc.next();// 文字列

		// チェック
		String result = "";

		if(check(s)){
			result = "YES";
		}else{
			result = "NO";
		}

		// 出力
		System.out.println(result);
	}

	static boolean check(String s){

		if(s.equals(a) || s.equals(b) || s.equals(c) || s.equals(d)){
			return true;
		}
		if(s.startsWith(a)){
			if(check(s.substring(a.length()))){
				return true;
			}
		}
		if(s.startsWith(b)){
			if(check(s.substring(b.length()))){
				return true;
			}
		}
		if(s.startsWith(c)){
			if(check(s.substring(c.length()))){
				return true;
			}
		}
		if(s.startsWith(d)){
			if(check(s.substring(d.length()))){
				return true;
			}
		}
		return false;
	}

}


