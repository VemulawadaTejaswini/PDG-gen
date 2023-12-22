/**
 * @author yuichirw
 *
 */
import java.util.*;
public class Main {

	static int n;
	static String line;
	static Scanner sc = new Scanner(System.in);
	
	static void read() {
		line = sc.nextLine();
	}
	
	static int solve() {
		return new MyParser().parse(line.substring(0, line.length() - 1));
	}
	
	public static void main(String[] args) {
		n = sc.nextInt(); sc.nextLine();
		while(n-- > 0) {
			read();
			System.out.println(solve());
		}
	}
	
}

class MyParsed {
	int val;
	String str;
	
	MyParsed(int val, String str) {
		this.val = val; this.str = str;
	}
}

class MyParser {
	
	public int parse(String str) {
		MyParsed mp = expr(str);
		return mp.val;
	}
	
	private MyParsed expr(String str) {
		MyParsed mp = term(str);
		while(mp.str.length() > 0 && (mp.str.charAt(0) == '+' || mp.str.charAt(0) == '-')) {
			char op = mp.str.charAt(0);
			int tmp = mp.val;
			mp = term(mp.str.substring(1));				
			if(op == '+') {
				mp.val = tmp + mp.val;
			} else {
				mp.val = tmp - mp.val;
			}
				
		}
		return mp;
	}
	
	private MyParsed term(String str) {
		MyParsed mp = fact(str);
		while(mp.str.length() > 0 && (mp.str.charAt(0) == '*' || mp.str.charAt(0) == '/')) {
			char op = mp.str.charAt(0);
			int tmp = mp.val;
			mp = fact(mp.str.substring(1));
			if(op == '*') {
				mp.val = tmp * mp.val;
			} else {
				mp.val = tmp / mp.val;
			}
		}
		return mp;
	}
	
	private MyParsed fact(String str) {
		if(Character.isDigit(str.charAt(0))) {
			int pos = 0; String num = "";
			while(pos < str.length() && Character.isDigit(str.charAt(pos))) {
				num += str.charAt(pos++);			
			}
			return new MyParsed(Integer.parseInt(num), str.substring(pos));
		} else {
			MyParsed mp = expr(str.substring(1));
			mp.str = mp.str.substring(1);
			return mp;
		}
	}
}